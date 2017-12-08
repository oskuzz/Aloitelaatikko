<%-- 
    Document   : tulostaAloitteet
    Created on : Nov 24, 2017, 1:51:28 PM
    Author     : s1601396
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
                background-image: url("pictures/oceanBackground.jpg");
                background-size: cover; 
                color: black;
                text-align: center;
                padding: 70px;
            }
            .table {
                background: rgba(255,255,255,0.7) ;
            }
            .delete-btn{
                margin-left: 0px;
            }
            .th-poista{
                width: 50px;
            }
            .th-nimi{
                width: 100px;
            }
            .th-id{
                width: 10px;
            }
            .th-tekijatunnus{
                width: 50px;
            }
            .th-pvm{
                width: 120px;
            }
            .td-kuvaus{
                text-align: left;
            }
            .tr{
                font-weight: 500;
            }
            .td-nimi{
                font-weight: bold;
            }
            .th-vaihe{
                width: 100px;
            }

        </style>
        <title>Hae Aloitteet</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
        %>
        <div class="container">
            <h1>Kaikki aloitteet</h1>
            <div class="table-responsive">
                <table class="table table-striped" border="1">
                    <thead class="thead-dark">
                        <tr>
                            <th class="th th-id">ID</th>
                            <th class="th th-nimi">Aloite</th>
                            <th class="th th-kuvaus">Kuvaus</th>
                            <th class="th th-pvm">pvm</th>
                            <th class="th th-tekijatunnus">Tekijätunnus</th>
                            <th class="th th-vaihe">Vaihe</th>
                            <th class="th-poista">Poista</th>
                            <!--<th class="th-muokkaa">Muokkaa</th>-->
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            String vaihe = "";
                            for (Aloite aloite : tietovarasto.haeKaikkiAloitteet()) {

                        %>
                        <tr class="tr">

                            <td><%= aloite.getAloiteID()%></td>
                            <% if (!tietovarasto.olemassaolevaToimenpide(aloite.getAloiteID())) {%>
                            <td class="td-nimi"><a href='lisaaToimenpide.jsp?aloiteID=<%=aloite.getAloiteID()%>&aloitekuvaus=<%=aloite.getAloitekuvaus()%>&aloitenimi=<%=aloite.getAloitenimi()%>'><%=aloite.getAloitenimi()%></a></td>
                                <% } else {%>
                            <td class="td-nimi"><%=aloite.getAloitenimi()%></td>
                            <%}%>
                            <td class="td-kuvaus"><%= aloite.getAloitekuvaus()%></td>
                            <td><%= aloite.getPvm()%></td>
                            <td><%= aloite.getKayttajaID()%></td>
                            <%
                                if (tietovarasto.olemassaolevaToimenpide(aloite.getAloiteID())) {
                                    vaihe = tietovarasto.getVaihe();

                                    if (vaihe.equals("1")) { %>
                            <td>-</td><br>
                            <%} else if (vaihe.equals("2")) {%>
                    <td>Odottamassa</td><br>
                    <% } else if (vaihe.equals("3")) {%>
                    <td>Työn alla</td><br>
                    <% } else {%>
                    <td>Valmis</td><br>
                    <%}
                    } else {
                    %>
                    <td>-</td><br>
                    <%}%>
                    <td>
                        <form name="lisays" action='../../Aloitelaatikko_ver2/jspSivut/poistaAloite.jsp?aloiteID=<%=aloite.getAloiteID()%>&aloitenimi=<%=aloite.getAloitenimi()%>&aloitekuvaus=<%=aloite.getAloitekuvaus()%>&pvm=<%= aloite.getPvm()%>' method="post">
                            <input class="btn delete-btn btn-danger" type="submit" value="X" name="delete">
                        </form>
                    </td>
                    <!--<td>
                        <form name="lisays" action='../../Aloitelaatikko_ver2/jspSivut/muokkaaAloite.jsp'>
                            <input class="btn btn-secondary muokkaa-btn" type="submit" value=">" name="muokkaa">
                        </form>
                    </td>-->
                    </tr>
                    <%}%>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
