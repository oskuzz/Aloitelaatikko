<%-- 
    Document   : kayttajanAloitteet
    Created on : 9.12.2017, 14:18:40
    Author     : osku0
--%>

<%@page import="Tietovarastopakkaus.*"%>
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
            <h1>Kaikki aloitteet</h1><br>
            <div class="table-responsive table-header">
                <table class="table table-striped" border="1">
                    <thead class="thead-dark">
                        <tr>
                            <th class="th th-id">ID</th>
                            <th class="th th-nimi">Aloite</th>
                            <th class="th th-Kuvaus">Kuvaus</th>
                            <th class="th th-pvm">pvm</th>
                            <th class="th th-kayttajaID">Käyttäjä ID</th>
                            <th class="th th-vaihe">Vaihe</th>
                            <th class="th th-muokkaa">Muokkaa</th>
                        </tr>
                    </thead>
                </table>
            </div>
            <div class="table-responsive table-scroll">
                <table class="table table-striped" border="1">
                    <tbody>
                        <%
                            for (Aloite aloite : tietovarasto.kayttajanAloitteet(2)) {
                        %>
                        <tr class="tr">

                            <td class="td td-id"><%= aloite.getAloiteID()%></td>
                            <td class="td td-nimi"><%= aloite.getAloitenimi()%></td>
                            <td class="td-Kuvaus"><%= aloite.getAloitekuvaus()%></td>
                            <td class="td td-pvm"><%= aloite.getPvm()%></td>
                            <td class="td td-kayttajaID"><%= aloite.getKayttajaID()%></td>
                            <%
                                String vaihe = "";
                                if (tietovarasto.olemassaolevaToimenpide(aloite.getAloiteID())) {
                                    vaihe = tietovarasto.getVaihe();

                                    if (vaihe.equals("1")) { %>
                            <td class="td td-vaihe">-</td>
                            <%} else if (vaihe.equals("2")) {%>
                            <td class="td td-vaihe">Odottamassa</td>
                            <% } else if (vaihe.equals("3")) {%>
                            <td class="td td-vaihe">Työn alla</td>
                            <% } else {%>
                            <td class="td td-vaihe">Valmis</td>
                            <%}
                            } else {
                            %>
                            <td class="td td-vaihe">-</td>
                            <%}%>
                            <td class="td td-muokkaa">
                                <form name="lisays" action='../../Aloitelaatikko_ver2/jspSivut/muokkaaAloite.jsp?aloiteID=<%=aloite.getAloiteID()%>&aloitenimi=<%=aloite.getAloitenimi()%>&aloitekuvaus=<%=aloite.getAloitekuvaus()%>' method="post">
                                    <input class="btn btn-danger muokkaa-btn" type="submit" value=">" name="muokkaa">
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