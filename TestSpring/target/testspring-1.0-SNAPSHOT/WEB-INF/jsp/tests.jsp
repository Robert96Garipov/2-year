<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action='' method='POST'>
        <b>Full name:</b> <input type='text' name='fullname' placeholder='John Johnson'><br>
        <br>
        <b>E-mail: </b><input type='text' name='email' placeholder='email@gmail.com'><br>
        <br>
        <b>Address:</b> <input type='text' name='address' placeholder='Moscow'><br>
        <br>
        <b>Goods: ${goodss}</b><br>
        <br>
<!--        <c:forEach items="${goodss}" var="item"> 
            ${item} <b>Count: </b> <input type="text" name="goods"><br> 
        </c:forEach>-->
        <input type='submit' value='OK!'> <a href="http://localhost:8080/TestSpring/allgoods">Orders</a>
        </form>
    </body>
</html>
