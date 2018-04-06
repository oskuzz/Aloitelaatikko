<%-- 
    Document   : index
    Created on : 21.11.2017, 15:12:34
    Author     : Osku Sirpoma
--%>

<%@page import="Tietovarastopakkaus.Tietovarasto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

        <link href="../CSS/signin.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/style3.css" rel="stylesheet" type="text/css"/>

        <style>
            footer{
                font-family: Brush Script MT;
                color: white;
                font-size: 30px;
            }
        </style>

        <title>Aloitelaatikko</title>
        <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    </head>
    <body class="indexBody">
        <nav class="navbar navbar-expand-sm navbar-dark">
            <!-- Brand/logo -->
            <a href="etusivuKayttaja.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="etusivuKayttaja.jsp"><img src="/Aloitelaatikko_ver2/jspSivut/Aloitelaatikko_teksti.png"></a>
            <a href="etusivuKayttaja.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a><br>
            <img src="/Aloitelaatikko_ver2/jspSivut/Kirjautuminen.png">
        </nav>

        <div class="indexDiv form-group">
            <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/index" method="post">
                <%
                    if (Tietovarasto.getLogin() == false) {
                %>
                <style>
                    .form-control{
                        border: 1px solid red;
                    }
                </style>
                <p style="color:red">Kirjautuminen epäonnistui, yritä uudelleen.</p>
                <%
                    }
                    Tietovarasto.setLogin(true);
                %>
                <input type="text" class="form-control" name="username" placeholder="Käyttäjätunnus">
                <input type="password" class="form-control" name="salasana" placeholder="Salasana">
                <input type="submit" class="btn btn-primary" value="Kirjaudu" name="submit">
            </form>
        </div>
        <footer class="container-fluid footer text-center fixed-bottom">
            <img class="copyright" src="/Aloitelaatikko_ver2/jspSivut/Copyright.png">
        </footer>
    </body>
</html>
