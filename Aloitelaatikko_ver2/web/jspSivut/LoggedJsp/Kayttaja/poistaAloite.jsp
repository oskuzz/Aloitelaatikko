<%-- 
    Document   : tulostaAloitteet
    Created on : 24.11.2017, 13:50:24
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
            }

            table {
                background: rgba(255, 255, 255, 0.7) !important;
                border: 1px;
            }
        </style>
        <title>Poista aloite</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
            String aloiteID = request.getParameter("aloiteID");

            Aloite aloite = tietovarasto.haeAloite(Integer.parseInt(aloiteID));

            String aloiteNimi = aloite.getAloitenimi();
            String aloiteKuvaus = aloite.getAloitekuvaus();
            String pvm = aloite.getPvm();
            
        %>

        <div class="container">
            <img class="header" src="/Aloitelaatikko_ver2/jspSivut/PoistaAloite.png">
            <a class="return" href="tulostaAloitteetKayttaja.jsp"><img src="/Aloitelaatikko_ver2/jspSivut/Palaa.png"></a>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th>ID</th>
                            <th>Nimi</th>
                            <th>Kuvaus</th>
                            <th>Pvm</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><%=aloiteID%></td>
                            <td><%=aloiteNimi%></td>
                            <td><%=aloiteKuvaus%></td>
                            <td><%=pvm%></td>
                        </tr>
                    </tbody>
                </table>
                <form class="form-signin" name="lisays" action="/Aloitelaatikko_ver2/poistaAloite" method="post">
                    <input class="btn btn-danger" type="submit" class="btn btn-danger" name="submit" value="Poista">
                    <input type="hidden" name="aloiteID" value='<%=aloiteID%>'>
                </form>
            </div>
        </div>
    </body>
</html>
