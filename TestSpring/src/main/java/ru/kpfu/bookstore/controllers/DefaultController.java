package ru.kpfu.bookstore.controllers;

import Goods.Data;
import Goods.Goods;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Robert Garipov
 */

@Controller
@RequestMapping("")
public class DefaultController {
    
  @RequestMapping("")
  public String index(  ModelMap map,
                        @RequestParam(name = "fullname", required = false) 
                          String fullname,

                        @RequestParam(name = "email",required = false)
                          String email,

                        @RequestParam(name = "address", required = false)
                          String address) {
      
    Goods goods = new Goods(); 
    Data data = new Data();
    goods.addGoods();
    map.put("goodss", goods.getGoods());
    data.addTextTXT(fullname, email, address);
    return "tests";
      
  }
  
    @RequestMapping("/allgoods")
    public String index(  ModelMap map) throws FileNotFoundException{
        Data data = new Data();
        map.put("allgoods", data.getTextTXT());
        return "orders";  
  }
  
//  
//  @RequestMapping("/s")
//  public String simple(ModelMap map) {
//    map.put("viewVariable", "Just simple action");
//    return "tests";
//  }
//  
//  @RequestMapping( { "/s1" , "/s2" } )
//  public String simpleMultiple(ModelMap map) {
//    map.put("viewVariable", "Just simple action for 2 addresses");
//    return "tests";
//  }
//  
//  @RequestMapping("/rb")
//  @ResponseBody
//  public String responseBody(){
//    return "<marquee scrollamount=\"25\" style=\"color: #D9470D; font-size: 40px; font-weight: bolder; line-height: 150%; text-shadow: #000000 0px 1px 1px;\">The only text on a page is this text - @ResponseBody annotation.</marquee>";
//  }
//  
//  @RequestMapping("/writer")
//  public void writer(java.io.Writer writer) throws IOException{
//    writer.write("This is plain/text done with java.io.Writer");
//  }
//  
//  @RequestMapping("/rs")
//  @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
//  public String responseStatus(ModelMap map){
//    map.put("viewVariable", "What do you want from me? I'm a teapot!");
//    return "tests";
//  }
//
//  @RequestMapping(
//    value = "/rmb",
//    method = RequestMethod.GET,
//    headers = "!user-agent=Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:36.0) Gecko/20100101 Firefox/36.0",
//    params = "secret_param=1"
//  )
//  public String requestMappingBunch(ModelMap map) {
//    map.put("viewVariable", "Page with secret_param for not Mozilla 36 on Linux");
//    return "tests";
//  }
//
//  @RequestMapping("/rp")
//  public String requestParam(@RequestParam String param, ModelMap map) {
//    map.put("viewVariable", "Request parameter:<br>" + param );
//    return "tests";
//  }
//
//  @RequestMapping("/rpb")
//  public String requestParamBanch(
//    @RequestParam(
//      value        = "special_name",
//      required     = false,
//      defaultValue = "Default value"
//    ) String param,
//    ModelMap map
//  ) {
//    map.put("viewVariable", "Request parameter:<br>" + param );
//    return "tests";
//  }
//  
//  @RequestMapping("/pv/{param}")
//  public String pathVariable(@PathVariable String param, ModelMap map){
//    map.put("viewVariable", "Path variable:<br>" + param );
//    return "tests";
//  }
//  
//  @RequestMapping("/pvb/{param_special_name}/{param2}/path")
//  public String pathVariableBunch(
//    @PathVariable(
//      value = "param_special_name"
//    ) String param,
//    @PathVariable String param2,
//    ModelMap map
//  ){
//    map.put("viewVariable", "Path variable:<br>" + param );
//    return "tests";
//  }
//  
//  @RequestMapping("/rh")
//  public String requestHeader(@RequestHeader("user-agent") String param, ModelMap map){
//    map.put("viewVariable", "User-agent header:<br>" + param );
//    return "tests";
//  }
}
