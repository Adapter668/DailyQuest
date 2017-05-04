<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>DailyQuest</title>
    <%@include file="/resources/layout/includes.jsp" %>

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