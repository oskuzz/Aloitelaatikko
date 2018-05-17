<%@page import="Tietovarastopakkaus.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

        <link href="/Aloitelaatikko_ver2/CSS/signin.css" rel="stylesheet" type="text/css"/>
        <link href="/Aloitelaatikko_ver2/CSS/style3.css" rel="stylesheet" type="text/css"/>

        <style>
            body {
                background-image: url("/Aloitelaatikko_ver2/jspSivut/oceanBackground.jpg");
                color: black;
                font-family: Comic Sans, cursive;
                font-size: 14px;
            }
            table {
                background: rgba(255, 255, 255, 0.7) !important;
                border: 1px;
                text-align: center;
            }
            .thAloiteID {
                width: 5%;
            }
            .thNimi {
                width: 15%;
            }
            .thKuvaus {
                width: 50%;
            }
            .thPVM {
                width: 10%;
            }
            .thKayttajaID {
                width: 5%;
            }
            .thVaihe {
                width: 10%
            }
            .tdKuvaus {
                text-align: left !important;
            }
            .tdNimi {
                text-align: left !important;
            }
            .container {
                max-width: 80%;
            }
        </style>

        <title>Hae aloite</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <%
        Tietovarasto tietovarasto = new Tietovarasto();
    %>
    <body>
        <div class="container">
            <form style="float: right; display: inline-block; margin-top: 10px;" class="formStyle" name="lisays" action="tulostaAloitteet.jsp">
                <input type="submit" class="btn btn-primary" value="Palaa" name="palaa">
            </form>
            <h1 style="display: inline-block;">Aloitteen haku aloitteen nimellä</h1>
            <form name="haku" method="POST">
                <p>
                    <label>
                        Anna haettavan aloitteen nimi:
                        <input class="form-control" name="aloiteNimi" size="30">
                    </label>
                    <input style="margin-bottom: 3px;" class="btn btn-primary" name="hae" type="submit" value ="Hae"/>
                </p>
            </form>
        </div>
        <% request.setCharacterEncoding("UTF-8");
            String haettava = request.getParameter("aloiteNimi");
            if (haettava != null && !haettava.isEmpty()) {
        %>
        <div class="container">
            <H3>Hakusanalla löytyi seuraavat aloitteet:</h3>
            <div class="table-responsive">
                <table class="table table-striped" border="1">
                    <thead class="thead-dark">
                        <tr class="tr">
                            <th class="thAloiteID">AloiteID</th>
                            <th class="thNimi">Aloitenimi</th>
                            <th class="thKuvaus">Kuvaus</th>    
                            <th class="thPVM">Pvm</th>
                            <th class="thKayttajaID">KäyttäjäID</th>
                            <th class="thVaihe">Vaihe</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Aloite aloite : tietovarasto.haeAloite(haettava)) {
                        %>
                        <tr>
                            <td><%= aloite.getAloiteID()%></td>
                            <td><%= aloite.getAloitenimi()%></td>
                            <td><%= aloite.getAloitekuvaus()%></td>
                            <td><%= aloite.getPvm()%></td>
                            <td><%= aloite.getKayttajaID()%></td>
                            <% if (tietovarasto.toimenpideTehty(aloite.getAloiteID())) {%>
                            <%
                                String vaihe = Tietovarasto.getVaihe();
                                if (vaihe.equals("1")) {
                            %>
                            <td>-</td>
                            <%
                            } else if (vaihe.equals("2")) {
                            %>
                            <td>Huomioitu</td>
                            <%
                            } else if (vaihe.equals("3")) {
                            %>
                            <td>Työn alla</td>
                            <%
                            } else if (vaihe.equals("4")) {
                            %>
                            <td>Valmis</td>
                            <% } %>
                        </tr>
                        <% } else { %>
                    <td>-</td>
                    <% }
                        }%>
                    </tbody>
                </table>
            </div>
        </div>
        <%}%>
    </body>
</html>