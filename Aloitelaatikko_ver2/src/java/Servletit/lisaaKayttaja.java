/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Tietovarastopakkaus.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author haaar
 */
@WebServlet(name = "lisaaKayttaja", urlPatterns = {"/lisaaKayttaja"})
public class lisaaKayttaja extends HttpServlet {

    // Määritellään viitaus Tietovarasto-luokkaan
    private Tietovarasto tietovarasto = new Tietovarasto();
    // Määritellään päiväysolio ja päiväys formaatti (esim. 2017-11-07)
    private Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Talletetaan lomakkeelle syötetut käyttäjän tiedot
        String etunimi = request.getParameter("etunimi");
        String sukunimi = request.getParameter("sukunimi");
        String email = request.getParameter("email");
        String kayttajatunnus = request.getParameter("kayttajatunnus");
        String salasana = request.getParameter("salasana");
        String puhelin = request.getParameter("puhelin");
        String ryhma = request.getParameter("ryhma");
        //MUUTETTU: String luontipaivays = request.getParameter("luontipaivays");
        String luontipaivays = sdf.format(date);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Käyttäjän lisäys</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Käyttäjän tiedot </h1>");

            out.println("Etunimi: " + etunimi + "<br>");
            out.println("Sukunimi: " + sukunimi + "<br>");
            out.println("Email: " + email + "<br>");
            out.println("Käyttäjätunnus: " + kayttajatunnus + "<br>");
            out.println("Salasana: " + salasana + "<br>");
            out.println("Puhelin: " + puhelin + "<br>");
            out.println("Luontipäivä: " + luontipaivays + "<br>");
            out.println("Ryhmä: " + ryhma + "<br>");

            //luodaan käyttäjä-olio lomakkeelta saatujen tietojen avulla
            Kayttaja kayttaja = new Kayttaja(0, etunimi, sukunimi, email,
                    kayttajatunnus, salasana, puhelin, luontipaivays, ryhma);

            //kutsutaan metodia lisaaKayttaja. Metodille välitetään kayttaja-olio.
            if (tietovarasto.lisaaKayttaja(kayttaja)) {
                // Lisäys onnistui
                out.println("<h2>Lisäys onnistui</h2>");
            } else {
                out.println("<h2>Lisäys epäonnistui</h2>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
