<%-- 
    Document   : etusivuYllapito
    Created on : 28.11.2017, 14:55:48
    Author     : s1601382
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

        <link href="/Aloitelaatikko_ver2/CSS/signin.css" rel="stylesheet" type="text/css"/>
        <link href="/Aloitelaatikko_ver2/CSS/style3.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                background-image: url("/Aloitelaatikko_ver2/jspSivut/spagettikissav2.jpg");
                background-size: cover;
                color: black;
                text-align: center;

            }

            .btnSize {
                width: 300px;
                height: 60px;
            }

            .formStyle {
                margin-top: 10px;
            }

            footer{
                font-family: Brush Script MT;
                color: white;
                font-size: 30px;
            }
        </style>

        <title>Ylläpidon etusivu</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark">
            <!-- Brand -->
            <a href="etusivuYllapito.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="etusivuYllapito.jsp"><img src="/Aloitelaatikko_ver2/jspSivut/Aloitelaatikko_teksti.png"></a>
            <a href="etusivuYllapito.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a><br>
            <img src="/Aloitelaatikko_ver2/jspSivut/Yllapito.png">
        </nav>
        <br>
        <form class="formStyle" name="kayttajat" action="tulostaKayttajat.jsp" method="post">
            <input type="submit" class="btn btn-primary btnSize" value="Käyttäjätiedot" name="submit">
        </form>
        
        <form class="formStyle" name="lisaaKayttaja" action="lisaaKayttaja.jsp" method="post">
            <input type="submit" class="btn btn-primary btnSize" value="Lisää käyttäjä" name="submit">
        </form>
        <br>
        <form class="formStyle" name="lisaaAloite" action="../Kayttaja/lisaaAloite.jsp">
            <input type="submit" class="btn btn-primary btnSize" value="Lisää aloite" name="submit">
        </form>

        <form class="formStyle" name="tulostaAloitteet" action="../Kayttaja/tulostaAloitteetKayttaja.jsp">
            <input type="submit" class="btn btn-primary btnSize" value="Omat aloitteet" name="tulostaAloitteet">
        </form>

        <form class="formStyle" name="tulostaKaikkiAloitteet" action="../Kayttaja/tulostaAloitteet.jsp">
            <input type="submit" class="btn btn-primary btnSize" value="Kaikki aloitteet / Toimenpiteet" name="tulostaKaikkiAloitteet">
        </form>
        <br>
        <form class="formStyle" name="kirjauduUlos" action="../../../logout">
            <input type="submit" class="btn btn-primary btnSize" value="Kirjaudu ulos" name="kirjauduUlos">
        </form>
        <footer class="container-fluid footer text-center fixed-bottom">
            <img class="copyright" src="/Aloitelaatikko_ver2/jspSivut/Copyright.png">
        </footer>
    </body>
</html>
