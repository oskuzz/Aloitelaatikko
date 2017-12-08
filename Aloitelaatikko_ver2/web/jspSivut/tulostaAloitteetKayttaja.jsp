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
            .muokkaa-btn{
                margin-left: 6px;
            }
            .th-muokkaa{
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
                            <th class="th th-muokkaa">Muokkaa</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Aloite aloite : tietovarasto.haeKaikkiAloitteet()) {
                        %>
                        <tr class="tr">

                            <td><%= aloite.getAloiteID()%></td>
                            <td><%= aloite.getAloitenimi()%></td>
                            <td class="td-kuvaus"><%= aloite.getAloitekuvaus()%></td>
                            <td><%= aloite.getPvm()%></td>
                            <td><%= aloite.getKayttajaID()%></td>
                            <td>
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
