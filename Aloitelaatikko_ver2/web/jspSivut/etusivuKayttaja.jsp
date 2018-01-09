<%-- 
    Document   : etusivuKayttaja
    Created on : Nov 21, 2017, 5:12:12 PM
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
                padding:0px;

            }
            div {
                max-width: 330px;
                padding: 15px;
                margin: 0 auto;
            }
            .btn{
                box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2), 0 10px 20px 0 rgba(0, 0, 0, 0.19);
                margin-bottom: 25px;
            }
            h1{
                margin-bottom: 20px;
            }
        </style>
        <title>Käyttäjän</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <div class="container">
            <div class="form-group">
                <h1>Käyttäjän etusivu</h1>
                <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/jspSivut/lisaaAloite.jsp" method="post">
                    <input class="btn btn-success" type="submit" value="Uusi aloite" name="talleta">
                </form>
                <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/jspSivut/tulostaAloitteetKayttaja.jsp" method="post">
                    <input class="btn btn-success" type="submit" value="Omat aloitteet" name="talleta">
                </form>
                <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/jspSivut/tulostaAloitteet.jsp" method="post">
                    <input class="btn btn-success" type="submit" value="Kaikki aloitteet" name="talleta">
                </form>
            </div>
        </div>
    </body>
</html>
