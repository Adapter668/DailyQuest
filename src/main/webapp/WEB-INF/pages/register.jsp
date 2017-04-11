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