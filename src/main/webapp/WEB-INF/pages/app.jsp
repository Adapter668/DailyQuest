<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Google font -->
    <link href="https://fonts.googleapis.com/css?family=Spirax" rel="stylesheet">
    <!-- Custom styles -->
    <spring:url value="/resources/css/main.css" var="mainCss"/>
    <link href="${mainCss}" rel="stylesheet"/>

    <spring:url value="/resources/css/sidebar.css" var="sidebarCss"/>
    <link href="${sidebarCss}" rel="stylesheet"/>

    <spring:url value="/resources/scripts/mainScript.js" var="mainScriptJs"/>
    <script src="${mainScriptJs}"></script>
</head>
<body>
<div id="wrapper">
    <%@include file="/resources/layout/side-nav.jsp" %>

    <div id="page-content-wrapper">
        <%@include file="/resources/layout/header.jsp" %>
        <div class="container-fluid">
            <div class="col-md-12">
                <h1>It's app view</h1>
            </div>
        </div>
    </div>

</div>
</body>