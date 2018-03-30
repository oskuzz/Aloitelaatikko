<%-- 
    Document   : lisaaTekija
    Created on : 31.10.2017, 14:54:19
    Author     : Osku Sirpoma
--%>

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
                background-image: url("spagettikissa.jpg");
                background-size: cover;
                color: black;
                text-align: center;
                padding: 70px;
            }

            div {
                max-width: 330px;
                padding: 15px;
                margin: 0 auto;
            }
        </style>
        <title>Käyttäjän lisääminen</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <div class="container">
            <div class="form-group">
                <h1>Uuden käyttäjän lisäys</h1>
                <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/lisaaKayttaja" method="post">
                    <input type="text" class="form-control" name="etunimi" placeholder="Etunimi"><br>
                    <input type="text" class="form-control" name="sukunimi" placeholder="Sukunimi"><br>
                    <input type="email" class="form-control" name="email" placeholder="Email"><br>
                    <input type="text" class="form-control" name="kayttajatunnus" placeholder="Käyttäjätunnus"><br>
                    <input type="password" class="form-control" name="salasana" placeholder="Salasana"><br>
                    <input type="text" class="form-control" name="puhelin" placeholder="Puhelin"><br>
                    <select class="form-control" name="ryhma">
                        <option value="Kayttaja">Käyttäjä</option>
                        <option value="Ohjausryhma">Ohjausryhmä</option>
                        <option value="Yllapito">Ylläpito</option>
                    </select><br>

                    <input type="submit" class="btn btn-primary" value="Talleta" name="talleta"/>
                    <input type="reset" class="btn btn-primary" value="Tyhjennä" name="reset"/>
                </form>
            </div>
        </div>
    </body>
</html>
