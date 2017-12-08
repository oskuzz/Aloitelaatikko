<%-- 
    Document   : lisaaKayttaja
    Created on : Oct 30, 2017, 6:56:19 PM
    Author     : haaar

    Muutos 3.11.2015: Tekijä sana korvattu sanalla Käyttäjä
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
                background-image: url("pictures/oceanBackground.jpg");
                background-size: cover; 
                color: black;
                text-align: center;
                padding: 50px;
            }

            div {
                max-width: 330px;
                padding: 5px;
                margin: 0 auto;
            }
            .h1{
                position: relative;
                height: 100px;
            }
            .btn{
                box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2), 0 10px 20px 0 rgba(0, 0, 0, 0.19);
            }

        </style>
        <title>Käyttäjän lisääminen</title>
        <link rel="shortcut icon" href="pictures/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <div class="container">
            <div class="form-group">
                <h1 class="h1">Käyttäjän lisääminen</h1>
                <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/lisaaKayttaja" method="post">
                    <input class="form-control" type="text" name="etunimi" placeholder="Etunimi"><br>
                    <input class="form-control" type="text" name="sukunimi" placeholder="Sukunimmi"><br>
                    <input class="form-control" type="email" name="email" placeholder="Email"><br>
                    <input class="form-control" type="text" name="kayttajatunnus" placeholder="Käyttäjätunnus"><br>
                    <input class="form-control" type="password" name="salasana" placeholder="Salasana"><br>
                    <input class="form-control"s type="text" name="puhelin" placeholder="Puhelin"><br>
                    <select class="form-control" name="ryhma">
                        <option value="Kayttaja">Käyttäjä</option>
                        <option value="Ohjausryhma">Ohjausryhmä</option>
                        <option value="Yllapito">Ylläpito</option>
                    </select><br>
                    <input class="btn btn-primary" type="reset" value="Tyhjennä" name="reset" />
                    <input class="btn btn-primary" type="submit" value="Talleta" name="talleta" />            
                </form>
            </div>
        </div>
    </body>
</html>
