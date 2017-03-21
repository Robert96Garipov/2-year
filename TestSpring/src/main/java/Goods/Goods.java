/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goods;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Robert Garipov
 */
public class Goods {
    ArrayList<String> list = new ArrayList<String>();
    public void addGoods() {
        list.add("Ball 199rub");
        list.add("T-shirt 499rub");
        list.add("Shorts 399rub");
        list.add("Boots 799rub");
    }
    
    public ArrayList getGoods(){
        
        return list;
    }
    
}
