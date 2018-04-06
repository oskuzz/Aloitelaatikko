<%-- 
    Document   : muokkaaAloitetta
    Created on : 8.12.2017, 11:17:53
    Author     : Osku Sirpoma
--%>

<%@page import="Tietovarastopakkaus.*"%>
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
        <style>
            body {
                background-image: url("/Aloitelaatikko_ver2/jspSivut/oceanBackground.jpg");
                background-size: cover;
                color: black;
                text-align: center;
                padding: 70px;
            }
            div {
                max-width: 330px;
                padding: 15px;
                margin: 0 auto;
            }
            input{
                margin-bottom: 20px;
            }
            .btn{
                margin-bottom: 5px;
            }
        </style>
        <title>Muokkaa aloitetta</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">

    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();

            String aloiteID = request.getParameter("aloiteID");
            String aloiteNimi = request.getParameter("aloitenimi");
            String aloiteKuvaus = request.getParameter("aloitekuvaus");
        %>
        <div class="container">
            <img class="header" src="/Aloitelaatikko_ver2/jspSivut/PoistaAloite.png"><br>
            <a class="return" href="tulostaAloitteetKayttaja.jsp"><img src="/Aloitelaatikko_ver2/jspSivut/Palaa.png"></a>
            <div class="form-group">    
                <form class="form-signin" name="muokkaa" action="/Aloitelaatikko_ver2/muokkaaAloitetta" method="post">
                    <input class="form-control" type="text" class="" name="aloitenimi" value="<%=aloiteNimi%>">
                    <textarea class="form-control" rows="10" cols="40" name="aloitekuvaus"><%=aloiteKuvaus%></textarea><br>
                    <input class="btn btn-primary" type="submit" class="btn btn-danger" name="submit" value="Muokkaa">
                    <input type="hidden" name="aloiteID" value='<%=aloiteID%>'>
                </form>
                <form name="poista" action='../Kayttaja/poistaAloite.jsp' method="post">
                    <input class="btn btn-danger" type="hidden" name="aloiteID" value='<%=aloiteID%>'>
                    <input class="btn btn-danger" type="submit" name="poista" value="Poista">
                </form>
            </div>
        </div>
    </body>
</html>
