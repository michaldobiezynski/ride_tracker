<%--
  Created by IntelliJ IDEA.
  User: dobimi
  Date: 24/05/2019
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="lbl.title" /></title>
    <style>
        .error{
            color:red
        }
    </style>
</head>
<body>
<h2>Create New Account</h2>
<form:form action="saveAccount" modelAttribute="account">
    <table>
        <tr>
            <td><spring:message code="lbl.accountNo" /></td>
            <td><form:input path="accountNo" size="30" />
                <form:errors path="accountNo" cssClass="error" />
            </td>

        </tr>
        <tr>
            <td><spring:message code="lbl.accountHolderName" /></td>
            <td><form:input path="accountHolderName" size="30" />
                <form:errors path="accountHolderName" cssClass="error" />
            </td>

        </tr>
        <tr>
            <td><spring:message code="lbl.balance" /></td>
            <td><form:input path="balance" size="30" />
                <form:errors path="balance" cssClass="error" />
            </td>

        </tr>
        <tr>
            <td><spring:message code="lbl.accountType" /></td>
            <td><form:select path="accountType">
            <form:option value="">Select Account Type</form:option>
                <form:option value="SAVINGS">Savings</form:option>
                <form:option value="CURRENT">Current</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><spring:message code="lbl.dob" /></td>
            <td><form:input path="dataOfBirth" size="30" />
                <form:errors path="dataOfBirth" cssClass="error" />
            </td>

        </tr>
        <tr>
            <td><spring:message code="lbl.psCode" /></td>
            <td><form:input path="psCode" size="30" />
                <form:errors path="psCode" cssClass="error" />
            </td>

        </tr>
        <tr>
            <td colspan="2" align="center" >
            <input type="submit" value="Create Account" name="btnSubmit"/>
        </tr>
    </table>
</form:form>
</body>
</html>
