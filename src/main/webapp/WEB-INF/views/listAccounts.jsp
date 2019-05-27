<%--
  Created by IntelliJ IDEA.
  User: dobimi
  Date: 27/05/2019
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>PS Bank Account Holder Details</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th><spring:message code ="lbl.accountNo"/></th>
            <th><spring:message code ="lbl.accountHolderName"/></th>
            <th><spring:message code ="lbl.balance"/></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="account" items="${accounts}">
            <tr>
                <td>${account.accountNo}</td>
                <td>${account.accountHolderName}</td>
                <td>${account.balance}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>
