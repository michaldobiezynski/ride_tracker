<%--
  Created by IntelliJ IDEA.
  User: dobimi
  Date: 24/05/2019
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="lbl.title" /></title>
</head>
<body>
<h2>PS: Bank Account Details </h2>

<%--<p>Account # : ${param.accountNo}</p>--%>
<%--<p>Account Holder Name : ${param.accountHolderName}</p>--%>
<%--<p>Balance : ${param.balance}</p>--%>

<p><spring:message code="lbl.accountNo" />: ${account.accountNo}</p>
<p><spring:message code="lbl.accountHolderName" />: ${account.accountHolderName}</p>
<p><spring:message code="lbl.balance" />: ${account.balance}</p>


</body>
</html>
