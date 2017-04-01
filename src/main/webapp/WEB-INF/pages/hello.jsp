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
    <style>
        html {
            background: url(http://cdn.wallpapersafari.com/40/7/XAmkPK.jpg) no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }

        body {
            background-color: transparent;
            font-family: 'Spirax', cursive;
            font-size: 20px;
        }

        .title-box{
            background-color: transparent;
            text-align: center;
            color: gold;
        }

        .title-box h1{
            font-size: 5em;
            font-weight: bold;
            text-shadow: 0 0 20px #000;
        }

        button{
            display: block;
            font-size: 1.5em;
            margin-top: 20px;
            width: 100%;
        }

        .info-box{
            background: rgba(0,0,0,0.75);
            color: #cfcccb;
            font-family: Book Antiqua;
            border: none;
        }
    </style>
</head>
<body>
    <div class="container">
       <div class="jumbotron title-box">
           <h1>${message}</h1>
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
                <button type="button" class="btn-default">Sign in</button>
                <button type="button" class="btn-primary">Sign up</button>
            </div>
        </div>
    </div>
</body>
</html>
