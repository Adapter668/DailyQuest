<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>DailyQuest - join us!</title>
    <%@include file="/resources/layout/includes.jsp" %>
</head>
<body>
<div class="container">
    <div class="page-header title-box">
        <h1>Join us</h1>
    </div>
    <div class="col-md-8 col-md-offset-2 col-xs-12">
        <div class="well well-lg info-box">
            <form method="post">
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input class="form-control" id="name" name="name">
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" class="form-control" id="email" name="email">
                </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd" name="pwd">
                </div>
                <button type="submit" class="btn-primary my-button">Submit</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>