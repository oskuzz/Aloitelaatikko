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
            <img class="header" src="/Aloitelaatikko_ver2/jspSivut/MuokkaaKayttaja.png"><br>
            <a class="return" href="tulostaKayttajat.jsp"><img src="/Aloitelaatikko_ver2/jspSivut/Palaa.png"></a>
            <div class="form-group">
                <form class="form-signin" name="muokkaa" action="/Aloitelaatikko_ver2/muokkaaKayttaja">
                    <input class="form-control" type="text" class="" name="kayttajaID" readonly value="<%=kayttajaID%>">
                    <input class="form-control" type="text" class="" name="etunimi" value="<%=etunimi%>">
                    <input class="form-control" type="text" class="" name="sukunimi" value="<%=sukunimi%>">
                    <input class="form-control" type="text" class="" name="email" value="<%=email%>">
                    <input class="form-control" type="text" class="" name="kayttajatunnus" value="<%=kayttajatunnus%>">
                    <input class="form-control" type="text" class="" name="salasana" value="<%=salasana%>">
                    <input class="form-control" type="text" class="" name="puhelin" value="<%=puhelin%>">
                    <input class="form-control" type="text" class="" name="luontipaivays" readonly value="<%=luontipaivays%>">
                    <select class="form-control" name="ryhma">
                        <%
                            if (ryhma.equals("Ohjausryhma")) {
                        %>
                        <option value="Ohjausryhma">Ohjausryhmä</option>
                        <option value="Kayttaja">Käyttäjä</option>
                        <option value="Yllapito">Ylläpito</option>
                        <%
                        } else if (ryhma.equals("Yllapito")) {
                        %>
                        <option value="Yllapito">Ylläpito</option>
                        <option value="Ohjausryhma">Ohjausryhmä</option>
                        <option value="Kayttaja">Käyttäjä</option>
                        <%
                        } else if (ryhma.equals("Kayttaja")) {
                        %>
                        <option value="Kayttaja">Käyttäjä</option>
                        <option value="Yllapito">Ylläpito</option>
                        <option value="Ohjausryhma">Ohjausryhmä</option>
                        <%
                            }
                        %>
                    </select><br>
                    <input type="submit" class="btn btn-primary" name="muokkaa" value="Muokkaa">
                </form>
                <form name="poista" action="/Aloitelaatikko_ver2/poistaKayttaja">
                    <input type="hidden" class="" name="kayttajaID" readonly value="<%=kayttajaID%>">
                    <input type="submit" class="btn btn-danger" name="poista" value="Poista">
                </form>
            </div>
        </div>
    </body>
</html>
