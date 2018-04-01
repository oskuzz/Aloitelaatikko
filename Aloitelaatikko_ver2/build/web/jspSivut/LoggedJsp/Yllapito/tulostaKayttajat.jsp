<%-- 
    Document   : tulostaKayttajat
    Created on : 26.2.2018, 21:03:37
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
        <link href="/Aloitelaatikko_ver2/CSS/style.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                background-image: url("/Aloitelaatikko_ver2/jspSivut/oceanBackground.jpg");
                background-size: cover;
                color: black;
                overflow: hidden;
            }

            .container {
                max-width: 100% !important;
            }

            table {
                background: rgba(255, 255, 255, 0.7) !important;
                text-align: center;
                border: 1px;
            }

            .thKayttajaID {
                width: 5%;
            }

            .thNimi {
                width: 15%;
            }

            .thKuvaus {
                width: 50%;
            }

            .thPVM {
                width: 10%;
            }

            .thKayttajaID {
                width: 5%;
            }

            .thPoista {
                width: 5%
            }

            .thVaihe {
                width: 5%
            }

            .tdKuvaus {
                text-align: left !important;
            }

            .tdNimi {
                text-align: left !important;
            }
        </style>
        <title>Käyttäjälista</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
        %>
        <div class="container">
            <img class="header" src="/Aloitelaatikko_ver2/jspSivut/KaikkiKayttajat.png">
            <a class="return" href="etusivuYllapito.jsp"><img src="/Aloitelaatikko_ver2/jspSivut/Palaa.png"></a>
            <div class="table-responsive">
                <table class="table table-striped" border="1">
                    <thead class="thead-dark">
                        <tr class="tr">
                            <th class="">KayttajaID</th>
                            <th class="">Etunimi</th>
                            <th class="">Sukunimi</th>
                            <th class="">Email</th>
                            <th class="">Kayttajatunnus</th>
                            <th class="">Salasana</th>
                            <th class="">Puhelin</th>
                            <th class="">Luontipäiväys</th>
                            <th class="">Ryhmä</th>
                            <th class="">Muokkaa</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Kayttaja kayttaja : tietovarasto.haeKaikkiKayttajat()) {
                        %>
                        <tr>
                            <td><%= kayttaja.getKayttajaID()%></td>
                            <td><%= kayttaja.getEtunimi()%></td>
                            <td><%= kayttaja.getSukunimi()%></td>
                            <td><%= kayttaja.getEmail()%></td>
                            <td><%= kayttaja.getKayttajatunnus()%></td>
                            <td><%= kayttaja.getSalasana()%></td>
                            <td><%= kayttaja.getPuhelin()%></td>
                            <td><%= kayttaja.getLuontipaivays()%></td>
                            <td><%= kayttaja.getRyhma()%></td>
                            <td>
                                <form name="lisays" action='../../LoggedJsp/Yllapito/muokkaaKayttaja.jsp?kayttajaID=<%=kayttaja.getKayttajaID()%>&etunimi=<%=kayttaja.getEtunimi()%>&sukunimi=<%=kayttaja.getSukunimi()%>&email=<%= kayttaja.getEmail()%>&kayttajatunnus=<%= kayttaja.getKayttajatunnus()%>&salasana=<%= kayttaja.getSalasana()%>&puhelin=<%= kayttaja.getPuhelin()%>&luontipaivays=<%= kayttaja.getLuontipaivays()%>&ryhma=<%= kayttaja.getRyhma()%>' method="post">
                                    <input class="btn btn-warning" type="submit" value=">" name="muokkaa">
                                </form>
                            </td>
                        </tr>
                        <% }%>
                </table>
            </div>
        </div>
    </body>
</html>
