<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>DailyQuest - {userLogin}'s profile</title>
    <%@include file="/resources/layout/includes.jsp" %>
</head>
<body>
    <div class="container">
        <div class="page-header title-box">
            <h1>${userLogin}</h1>
            <h2>Level ${userLevel}</h2>
        </div>
        
        <div class="user-avatar">
            <div class="col-xs-12 col-md-6">
                <img src="http://pre14.deviantart.net/a975/th/pre/i/2010/249/a/b/lord_of_valor_by_chrisnfy85-d2y4q3s.jpg" style="max-width: 100%">
                <button class="btn btn-default">Change avatar</button>
            </div>
        </div>
        
        <div class="userdata-div">
            <div class="col-xs-12 col-md-6">

               <div class="well info-box">
                   <p>Private quests done: ${privateQuestsDone}</p>
                   <p>Points from private quests: ${privateQuestsPoints}</p>
                   <p>Friends' quests done: ${friendsQuestsDone}</p>
                   <p>Points from friends' quests ${friendsQuestsPoints}</p>
                   <br>

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
                            <label for="old-pwd">Old password:</label>
                            <input type="password" class="form-control" id="old-pwd" name="pwd">
                        </div>
                        <div class="form-group">
                            <label for="pwd">New password:</label>
                            <input type="password" class="form-control" id="pwd" name="pwd">
                        </div>
                        <button type="submit" class="btn-primary my-button">Save changes</button>
                    </form>

               </div>
            </div>
        </div>
       
    </div>
</body>
</html>
