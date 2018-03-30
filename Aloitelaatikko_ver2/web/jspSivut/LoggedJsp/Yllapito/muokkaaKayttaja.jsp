<%-- 
    Document   : muokkaaKayttaja
    Created on : 26.2.2018, 20:58:59
    Author     : Osku Sirpoma
--%>

<%@page import="Tietovarastopakkaus.*"%>
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
                background-color: #14cad4;
                color: black;
            }

            table {
                background-color: white !important;
                border: 1px;
            }
        </style>
        <title>Muokkaa käyttäjätietoja</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();

            String kayttajaID = request.getParameter("kayttajaID");
            String etunimi = request.getParameter("etunimi");
            String sukunimi = request.getParameter("sukunimi");
            String email = request.getParameter("email");
            String kayttajatunnus = request.getParameter("kayttajatunnus");
            String salasana = request.getParameter("salasana");
            String puhelin = request.getParameter("puhelin");
            String luontipaivays = request.getParameter("luontipaivays");
            String ryhma = request.getParameter("ryhma");
            
        %>
        <div class="container">
            <h1>Muokkaa Käyttäjätietoja</h1>
            <form name="muokkaa" action="/Aloitelaatikko_ver2/muokkaaKayttaja">
                <input type="text" class="" name="kayttajaID" readonly value="<%=kayttajaID%>"><br>
                <input type="text" class="" name="etunimi" value="<%=etunimi%>"><br>
                <input type="text" class="" name="sukunimi" value="<%=sukunimi%>"><br>
                <input type="text" class="" name="email" value="<%=email%>"><br>
                <input type="text" class="" name="kayttajatunnus" value="<%=kayttajatunnus%>"><br>
                <input type="text" class="" name="salasana" value="<%=salasana%>"><br>
                <input type="text" class="" name="puhelin" value="<%=puhelin%>"><br>
                <input type="text" class="" name="luontipaivays" readonly value="<%=luontipaivays%>"><br>
                <input type="text" class="" name="ryhma" value="<%=ryhma%>"><br>
                
                <input type="submit" class="btn btn-warning" name="muokkaa" value="Muokkaa">
            </form>
            <form name="poista" action="/Aloitelaatikko_ver2/poistaKayttaja">
                <input type="hidden" class="" name="kayttajaID" readonly value="<%=kayttajaID%>"><br>
                <input type="submit" class="btn btn-danger" name="poista" value="Poista">
            </form>
        </div>
    </body>
</html>
