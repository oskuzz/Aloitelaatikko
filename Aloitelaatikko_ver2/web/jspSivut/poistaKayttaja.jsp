<%-- 
    Document   : poistaKayttaja
    Created on : 26.2.2018, 15:00:47
    Author     : osku0
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
        <style>
            body {
                background-image: url("pictures/oceanBackground.jpg");
                background-size: cover; 
            }

            .table {
                background-color: white !important;
            }
        </style>

        <title>Aloitteen poistaminen</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
        %>
        <%
            request.setCharacterEncoding("UTF-8");

            String kayttajaID = request.getParameter("kayttajaID");
            String etunimi = request.getParameter("etunimi");
            String sukunimi = request.getParameter("sukunimi");
            String kayttajaTunnus = request.getParameter("kayttajaTunnus");
        %>
        <div class="container">
            <h1>Aloitteen poistaminen</h1>
            <div class="table-responsive">
                <table class="table table-striped" border="1">
                    <thead class="thead-dark">
                        <tr>
                            <th>ID</th>
                            <th>Etunimi</th>
                            <th>Sukunimi</th>
                            <th>KäyttäjäTunnus</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><%= kayttajaID%></td>
                            <td><%=etunimi%></td>
                            <td><%= sukunimi%></td>
                            <td><%= kayttajaTunnus%></td>

                        </tr>
                    </tbody>        
                </table>
                <form name="lisays" action="../../Aloitelaatikko_ver2/poistaKayttaja" method="post">
                    <input class="btn btn-danger" type="submit" name="submit" value="Poista">
                    <input type="hidden" name="kayttajaID" value='<%=kayttajaID%>'>
                </form>
            </div>
        </div>
    </body>
</html>
