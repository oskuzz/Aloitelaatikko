<%-- 
    Document   : lisaaToimenpide
    Created on : Nov 17, 2017, 2:08:44 PM
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
            body {
                background-image: url("pictures/oceanBackground.jpg");
                background-size: cover; 
                color: black;
                text-align: center;
                padding: 100px;
            }

            div {
                max-width: 330px;
                padding: 15px;
                margin: 0 auto;
            }
            .btn{
                box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2), 0 10px 20px 0 rgba(0, 0, 0, 0.19);
            }
            h1{
                margin-bottom: 20px;
            }
            h5{
                border: 1px solid black;
            }


        </style>
        <title>Toimenpiteen Kirjaaminen</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
        %>
        <%
            request.setCharacterEncoding("UTF-8");

            String aloiteID = request.getParameter("aloiteID");
            String aloitenimi = request.getParameter("aloitenimi");
            String aloitekuvaus = request.getParameter("aloitekuvaus");
        %>
        <div class="container">
            <div class="form-group">
                <h1>Toimenpiteen Kirjaaminen</h1>
                <h5>Aloite: <%=aloitenimi%></h5>
                <h5>Kuvaus: <%=aloitekuvaus%></h5>
                <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/lisaaToimenpide" method="post">
                    <textarea class="form-control" rows="10" cols="40" name="kuvaus" placeholder="Toimenpiteen kuvaus"></textarea><br>
                    <%="Vaihe:"%>
                    <select class="form-control" name="vaihe">
                        <option value="1">-</option>
                        <option value="2">Odottamassa</option>
                        <option value="3">Työn Alla</option>
                        <option value="4">Valmis</option>
                    </select><br>
                    <input class="btn btn-danger" type="reset" value="Tyhjennä" name="reset" >
                    <input class="btn btn-success" type="submit" value="Talleta" name="talleta" >
                    <input type="hidden" name="aloiteID" value='<%=aloiteID%>'>
                </form>
            </div>
        </div>
    </body>
</html>
