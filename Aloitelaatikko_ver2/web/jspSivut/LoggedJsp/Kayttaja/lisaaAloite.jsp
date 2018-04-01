<%-- 
    Document   : lisaaAloite
    Created on : 14.11.2017, 14:29:35
    Author     : Osku Sirpoma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
        <style>
            body {
                background-image: url("/Aloitelaatikko_ver2/jspSivut/oceanBackground.jpg");
            }

            img{
                margin-left: 70px;
                margin-top: 10px;
                margin-bottom: 20px;
            }
        </style>
        <title>Aloitteen luominen</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <img src="/Aloitelaatikko_ver2/jspSivut/Aloite.png">
        <div class="container">
            <div class="form-group">
                <form class="form-signin" name="lisays" action="/Aloitelaatikko_ver2/lisaaAloite" method="post">
                    <input class="form-control" type="text" name="aloitenimi" placeholder="Otsikko"><br>
                    <textarea class="form-control" rows="10" cols="40" name="aloitekuvaus" placeholder="Kuvaus"></textarea><br>

                    <input class="btn btn-primary" type="reset" value="Tyhjennä" name="reset"/>
                    <input class="btn btn-primary"type="submit" value="Talleta" name="talleta"/>
            </div>
        </div>
    </form>
</body>
</html>
