<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

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
    <spring:url value="/resources/css/main.css" var="mainCss" />
    <link href="${mainCss}" rel="stylesheet" />
</head>
<body>
    <div class="container">
       <div class="jumbotron title-box">
           <h1>Daily Quest</h1>
       </div>
        <div class="row">
            <div class="col-xs-12 col-md-6">
                <div class="well info-box">
                    <h2> What is DailyQuest?</h2>
                    <p> It's an amazing web application which will change your daily routines into epic quests!
                        Accept quests and give quests to others. Become a hero today!</p>
                </div>
            </div>

            <div class="col-xs-12 col-md-2">
            </div>

            <div class="col-xs-12 col-md-4">
                <button type="button" class="btn-default" data-toggle="modal" data-target="#login-modal">Sign in</button>
                <a href="register"> <button type="button" class="btn-primary">Sign up</button> </a>
            </div>
        </div>
    </div>
</body>
</html>
