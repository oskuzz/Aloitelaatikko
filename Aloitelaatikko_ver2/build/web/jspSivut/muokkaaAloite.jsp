<%-- 
    Document   : poistaAloite
    Created on : Nov 30, 2017, 8:48:07 AM
    Author     : s1601396
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

            body{
                background-image: url("pictures/oceanBackground.jpg");
                background-size: cover; 
            }

            .table{
                background-color: white !important;
            }

            .form{
                width:100%;
                margin:auto;
            }
        </style>

        <title>Aloitteen muokkaaminen</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
        %>
        <%
            request.setCharacterEncoding("UTF-8");

            String aloiteID = request.getParameter("aloiteID");
            String aloiteNimi = request.getParameter("aloitenimi");
            String aloiteKuvaus = request.getParameter("aloitekuvaus");
        %>

        <div class="container">
            <h1>Aloitteen muokkaaminen</h1>
            <div class="table-responsive">
                <form class="form" name="lisays" action="../../Aloitelaatikko_ver2/muokkaaAloite" method="post">
                    <%="Aloite ID: " + aloiteID%>
                    <input class="text-name" type="text" name="aloiteNimi" value='<%=aloiteNimi%>'>
                    <textarea rows="10" cols="40" name="aloiteKuvaus"><%=aloiteKuvaus%></textarea><br>
                    <input class="btn btn-danger" type="submit" name="submit" value="Tallenna">
                    <input type="hidden" name="aloiteID" value='<%=aloiteID%>'>
                </form>
            </div>
        </div>
    </body>
</html>
