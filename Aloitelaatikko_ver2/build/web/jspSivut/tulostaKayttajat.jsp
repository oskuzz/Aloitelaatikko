<%-- 
    Document   : tulostaKayttajat
    Created on : 26.2.2018, 14:30:42
    Author     : osku0
--%>

<%@page import="Tietovarastopakkaus.Kayttaja"%>
<%@page import="Tietovarastopakkaus.Aloite"%>
<%@page import="Tietovarastopakkaus.Tietovarasto"%>
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
        <title>Hae Aloitteet</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
        %>
        <div class="container">
            <h1>Kaikki Kayttajat</h1><br>
            <div class="table-responsive table-header">
                <table class="table table-striped" border="1">
                    <thead class="thead-dark">
                        <tr>
                            <th class="th">ID</th>
                            <th class="th">Etunimi</th>
                            <th class="th">Sukunimi</th>
                            <th class="th">Email</th>
                            <th class="th">Käyttäjätunnus</th>
                            <th class="th">Puhelin</th>
                            <th class="th">Päiväys</th>
                            <th class="th">Ryhmä</th>
                        </tr>
                    </thead>
                </table>
            </div>
            <div class="table-responsive table-scroll">
                <table class="table table-striped" border="1">
                    <tbody>
                        <%
                            for (Kayttaja kayttaja : tietovarasto.haeKaikkiKayttajat()) {
                        %>
                        <tr class="tr">
                            <td class="td"><%= kayttaja.getKayttajaID()%></td>
                            <td class="td"><%=kayttaja.getEtunimi()%></td>
                            <td class="td"><%= kayttaja.getSukunimi()%></td>
                            <td class="td"><%= kayttaja.getEmail()%></td>
                            <td class="td"><%= kayttaja.getKayttajaTunnus()%></td>
                            <td class="td"><%= kayttaja.getPuhelin()%></td>
                            <td class="td"><%= kayttaja.getLuontipaivays()%></td>
                            <td class="td"><%= kayttaja.getRyhma()%></td>
                            <td class="td td-delete">

                                <form name="lisays" action='../../Aloitelaatikko_ver2/jspSivut/poistaKayttaja.jsp?kayttajaID=<%=kayttaja.getKayttajaID()%>&etunimi=<%=kayttaja.getEtunimi()%>&sukunimi=<%=kayttaja.getSukunimi()%>&kayttajaTunnus=<%= kayttaja.getKayttajaTunnus()%>' method="post">
                                    <input class="btn delete-btn btn-danger" type="submit" value="X" name="delete">
                                </form>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
