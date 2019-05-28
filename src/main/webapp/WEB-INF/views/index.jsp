<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Welcome to PS Bank</title>
</head>
<body>
    <div class = "container">
        <%@ include file="header.jsp"%>

        <div class="row">
            <div class ="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                <div class="jumbotron">
                    <h1 class = "display-4">Welcome to PS Bank</h1>
                    <p class="lead">
                        Happiness = A good bank account, a good cook and a good digestion - Jean
                    </p>

                    <a href="/user/new" class = "btn btn-lg btn-success">Register Here</a>
                    <p><br />Existing Users: <a href="/user/login">Login Here</a> </p>
                </div>
            </div>
        </div>


        <%@include file="footer.jsp"%>
    </div>
</body>
</html>
