<%-- 
    Document   : lisaaToimenpide
    Created on : 21.11.2017, 13:52:25
    Author     : Osku Sirpoma
--%>

<%@page import="Tietovarastopakkaus.Tietovarasto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
        <link href="/Aloitelaatikko_ver2/CSS/style.css" rel="stylesheet" type="text/css"/>
        <title>Toimenpiteen kirjaaminen</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
        <style>
            body {
                background-image: url("/Aloitelaatikko_ver2/jspSivut/oceanBackground.jpg");
            }

        </style>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=UTF-8");
            response.setCharacterEncoding("UTF-8");

            String aloiteID = request.getParameter("aloiteID");
            String aloitekuvaus = request.getParameter("aloitekuvaus");

            Tietovarasto tietovarasto = new Tietovarasto();
            String url = "../Kayttaja/tulostaAloitteet.jsp";

        %>
        <div class="container">
            <img class="header" src="/Aloitelaatikko_ver2/jspSivut/ToimenpiteenKirjaaminen.png">
            <a class="return" href=<%=url%>><img src="/Aloitelaatikko_ver2/jspSivut/Palaa.png"></a>
            <div class="form-group">

                <input class="form-control" type="text" class="" name="luontipaivays" readonly value="<%=aloitekuvaus%>">
                <form class="form-signin" name="lisays" action="/Aloitelaatikko_ver2/lisaaToimenpide" method="post"><br>
                    <textarea class="form-control" rows="10" cols="40" name="Kuvaus" placeholder="Toimenpide"></textarea><br>
                    <select class="form-control" name="vaihe">
                        <option selected disabled>Työvaihe</option>
                        <option value="1">-</option>
                        <option value="2">Huomioitu</option>
                        <option value="3">Työn alla</option>
                        <option value="4">Valmis</option>
                    </select><br>

                    <input class="btn btn-primary" type="reset" value="Tyhjennä" name="reset">
                    <input class="btn btn-primary" type="submit" value="Talleta" name="submit">
                    <input type="hidden" name="aloiteID" value="<%=aloiteID%>">
                </form>
            </div>
        </div>
    </body>
</html>
