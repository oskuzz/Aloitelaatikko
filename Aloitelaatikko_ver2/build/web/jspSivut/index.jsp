<%-- 
    Document   : index
    Created on : Nov 21, 2017, 3:12:28 PM
    Author     : s1601396
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
        <style>
            body {
                background-image: url("pictures/oceanBackground.jpg");
                background-size: cover; 
                color: black;
                text-align: center;
                padding: 100px;
            }
            div {
                max-width: 330px;
                padding: 15px;
                margin: 0 auto;
            }
            .btn{
                box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2), 0 10px 20px 0 rgba(0, 0, 0, 0.19);
            }
            h1{
                margin-bottom: 20px;
            }


        </style>
        <title>Aloitelaatikko</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <div class="container">
            <div class="form-group">
                <h1>Kirjautuminen</h1>
                <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/index" method="post">
                    <input class="form-control" type="text" name="uName" placeholder="Käyttäjätunnus"><br>
                    <input class="form-control" type="password" name="salasana" placeholder="Salasana"><br>
                    <input class="btn btn-primary" type="submit" value="Kirjaudu" name="talleta" >
                </form>
            </div>
        </div>
        <footer class="mainfooter">
            <div class="footer">
                <p class="text-xs-center">&copy; Copyright 2017 - Osku Sirpoma.</p>
            </div>
        </footer>
    </body>
</html>
