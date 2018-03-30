<%-- 
    Document   : lisaaToimenpide
    Created on : 21.11.2017, 13:52:25
    Author     : Osku Sirpoma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Toimenpiteen kirjaaminen</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <h1>Toimenpiteen kirjaaminen</h1>
        <%
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            
            String aloiteID = request.getParameter("aloiteID");
            String aloitekuvaus = request.getParameter("aloitekuvaus");
        %>
        <p>Aloitteen kuvaus: <%=aloitekuvaus%></p>
        <form name="lisays" action="/Aloitelaatikko_ver2/lisaaToimenpide" method="post">
            Toimenpide:<br>
            <textarea rows="10" cols="40" name="Kuvaus" placeholder="Kuvaus"></textarea><br>
            <select class="form-control" name="vaihe">
                <option value="1">-</option>
                <option value="2">Huomioitu</option>
                <option value="3">Työn alla</option>
                <option value="4">Valmis</option>
            </select><br>

            <input type="reset" value="Tyhjennä" name="reset">
            <input type="submit" value="Talleta" name="submit">
            <input type="hidden" name="aloiteID" value="<%=aloiteID%>">
        </form>

    </body>
</html>
