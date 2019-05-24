<%--
  Created by IntelliJ IDEA.
  User: dobimi
  Date: 24/05/2019
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PS Bank: Create New Account</title>
</head>
<body>
<h2>Create New Account</h2>
<form name="accountForm" action="saveAccount">
    <table>
        <tr>
            <td>Account #: </td>
            <td><input type="text" name="accountNo"/> </td>
        </tr>
        <tr>
            <td>Account Holder Name: </td>
            <td><input type="text" name="accountHolderName"/> </td>
        </tr>
        <tr>
            <td>Account Balance: </td>
            <td><input type="text" name="balance"/> </td>
        </tr>
        <tr>
            <td colspan="2" align="center" >
            <input type="submit" value="Create Account" name="btnSubmit"/>
        </tr>
    </table>
</form>
</body>
</html>
