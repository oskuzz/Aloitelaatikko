<%-- 
    Document   : lisaaAloite
    Created on : Nov 14, 2017, 2:31:04 PM
    Author     : s1601396
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
        <title>Aloitteen kirjaaminen</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <div class="container">
            <div class="form-group">
                <h1>Aloitteen kirjaaminen</h1>
                <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/lisaaAloite" method="post">
                    <input class="form-control" type="text" name="aloitenimi" placeholder="Aloitteen nimi"><br>
                    <textarea class="form-control" rows="10" cols="40" name="aloitekuvaus" placeholder="Aloitteen kuvaus"></textarea><br>
                    <input class="btn btn-danger" type="reset" value="Tyhjennä" name="reset" >
                    <input class="btn btn-success talleta" type="submit" value="Talleta" name="talleta" >            
                </form>
                <br>
                <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/jspSivut/tulostaAloitteetKayttaja.jsp" method="post">
                    <input class="btn btn-primary btn-block" type="submit" value="Kaikki aloitteet" name="siirry">
                </form>
            </div>
        </div>

    </body>
</html>
