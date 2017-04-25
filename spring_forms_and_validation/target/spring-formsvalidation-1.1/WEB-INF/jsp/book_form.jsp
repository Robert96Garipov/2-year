<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
  </head>
  <body>

  <span style="float: right">
    <a href="?lang=en">en</a>
    |
    <a href="?lang=de">ru</a>
  </span>

    <a href="<c:url value="/" />">Homepage</a><br><br>
    <c:if test="${not empty message}">
      <h1>${message}</h1>
    </c:if>
      
      
    <form:form method="POST" commandName="book">
      <form:label path="fullName">Name : </form:label> <h1><spring:message code="test"/></h1>
      <form:input path="fullName"/>
      <form:errors path="fullName" /><br><br>

      
      <form:label path="email">E-mail : </form:label>
      <form:input path="email"/>
      <form:errors path="email" /><br><br>

      
      <form:label path="country">City : </form:label>
      <form:select path="country">
          <option>Москва</option>
          <option>Уфа</option>
          <option>Казань</option>
      </form:select>
      <form:errors path="country"/><br><br>


      <form:label path="sex">Sex : </form:label>
      <form:radiobutton path="sex" value="valueMale"/> Male
      <form:radiobutton path="sex" value="valueFemale"/> Female
      <form:errors path="sex"/><br><br>



      <form:label path="firstPassword">Password : </form:label>
      <form:input path="firstPassword"/>
      <form:errors path="firstPassword" /><br><br>

      <form:label path="secondPassword">Re-Password : </form:label>
      <form:input path="secondPassword"/>
      <form:errors path="secondPassword" /><br><br>

      
      <input type="submit" value="Submit" />
    </form:form>
  </body>
</html>
