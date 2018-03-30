<%-- 
    Document   : lisaaAloite
    Created on : 14.11.2017, 14:29:35
    Author     : Osku Sirpoma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aloitteen luominen</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <h1>Uuden aloitteen luominen</h1>
        <form name="lisays" action="/Aloitelaatikko_ver2/lisaaAloite" method="post">
            <input type="text" name="aloitenimi" placeholder="Otsikko"><br>
            <textarea rows="10" cols="40" name="aloitekuvaus" placeholder="Kuvaus"></textarea><br>
            
            <input type="reset" value="Tyhjennä" name="reset"/>
            <input type="submit" value="Talleta" name="talleta"/>
        </form>
    </body>
</html>
