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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>PS Bank Account Holder Details</title>
</head>
<body>
    <div class="container">

        <%@include file="header.jsp"%>

        <div class="row">
            <div class="col-12">
                <a href="<c:url value='/new'/>" class="btn byn-lg btn-primary">Add new account</a>
            </div>
        </div>

        <div class="row">
            <div class="col-12">
                <table class="table table-bordered table-hover">
                    <thead class="bg-success">
                    <tr>
                        <th><spring:message code ="lbl.accountNo"/></th>
                        <th><spring:message code ="lbl.accountHolderName"/></th>
                        <th><spring:message code ="lbl.balance"/></th>
                        <th> &nbsp; </th>
                        <th> &nbsp; </th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="account" items="${accounts}">
                        <c:url var="updateLink" value ="/edit">
                            <c:param name="accountNo" value="${account.accountNo}" />
                        </c:url>
                        <c:url var="deleteLink" value ="/delete">
                            <c:param name="accountNo" value="${account.accountNo}" />
                        </c:url>
                        <tr>
                            <td>${account.accountNo} </td>
                            <td>${account.accountHolderName} </td>
                            <td>${account.balance} </td>
                            <td><a href="${updateLink}" class="btn btn-warning">Edit</a></td>
                            <td><a href="${deleteLink}" class="btn btn-danger"
                                   onclick="if(!(confirm('Are you sure to delete?')))return false"
                            >Delete</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>

        <%@ include file="footer.jsp"%>
    </div>


</body>
</html>
