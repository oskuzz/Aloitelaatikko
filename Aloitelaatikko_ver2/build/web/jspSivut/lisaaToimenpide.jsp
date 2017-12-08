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
        <title>Toimenpiteen Kirjaaminen</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
        %>
        <h1>Toimenpiteen Kirjaaminen</h1>
        <%
            request.setCharacterEncoding("UTF-8");

            String aloiteID = request.getParameter("aloiteID");
            String aloitenimi = request.getParameter("aloitenimi");
            String aloitekuvaus = request.getParameter("aloitekuvaus");
        %>
        <p>Nimi: <%=aloitenimi%></p>
        <p>Kuvaus: <%=aloitekuvaus%></p>
        <form name="lisays" action="../../Aloitelaatikko_ver2/lisaaToimenpide" method="post">
            <textarea rows="10" cols="40" name="kuvaus" placeholder="Toimenpiteen kuvaus"></textarea><br>
            <%="Vaihe:"%>
            <select name="vaihe">
                <option value="1">-</option>
                <option value="2">Odottamassa</option>
                <option value="3">Työn Alla</option>
                <option value="4">Valmis</option>
            </select><br>
            <input type="reset" value="Tyhjennä" name="reset" >
            <input type="submit" value="Talleta" name="talleta" >
            <input type="hidden" name="aloiteID" value='<%=aloiteID%>'>
        </form>
    </body>
</html>
