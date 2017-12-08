<%-- 
    Document   : lisaaAloite
    Created on : Nov 14, 2017, 2:31:04 PM
    Author     : s1601396
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aloitteen kirjaaminen</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <h1>Aloitteen kirjaaminen</h1>
        <form name="lisays" action="../../Aloitelaatikko_ver2/lisaaAloite" method="post">
            <input type="text" name="aloitenimi" placeholder="Aloitteen nimi"><br>
            <textarea rows="10" cols="40" name="aloitekuvaus" placeholder="Aloitteen kuvaus"></textarea><br>
            <input type="reset" value="Tyhjennä" name="reset" >
            <input type="submit" value="Talleta" name="talleta" >            
        </form>
        <br>
        <form name="lisays" action="../../Aloitelaatikko_ver2/jspSivut/tulostaAloitteetKayttaja.jsp" method="post">
            <input type="submit" value="Kaikki aloitteet" name="siirry">
        </form>
    </body>
</html>
