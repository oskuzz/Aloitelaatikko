<%-- 
    Document   : lisaaAloite
    Created on : 14.11.2017, 14:29:35
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
        <link href="/Aloitelaatikko_ver2/CSS/style.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                background-image: url("/Aloitelaatikko_ver2/jspSivut/oceanBackground.jpg");
            }

        </style>
        <title>Aloitteen luominen</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
            String url = "";

            if (session.getAttribute("ryhma").equals("Ohjausryhma")) {
                url = "../Ohjausryhma/etusivuOhjausryhma.jsp";
            } else if (session.getAttribute("ryhma").equals("Yllapito")) {
                url = "../Yllapito/etusivuYllapito.jsp";
            } else if(session.getAttribute("ryhma").equals("Kayttaja")) {
                url = "etusivuKayttaja.jsp";
            }
        %>

        <div class="container">
            <img class="header" src="/Aloitelaatikko_ver2/jspSivut/Aloite.png">
            <a class="return" href=<%=url%>><img src="/Aloitelaatikko_ver2/jspSivut/Palaa.png"></a>
            <div class="form-group">
                <form class="form-signin" name="lisays" action="/Aloitelaatikko_ver2/lisaaAloite" method="post">
                    <input class="form-control" type="text" name="aloitenimi" placeholder="Otsikko"><br>
                    <textarea class="form-control" rows="10" cols="40" name="aloitekuvaus" placeholder="Kuvaus"></textarea><br>
                    <input class="btn btn-danger" type="reset" value="Tyhjennä" name="reset"/>
                    <input class="btn btn-primary"type="submit" value="Talleta" name="talleta"/>
                </form>
            </div>
        </div>
    </body>
</html>
