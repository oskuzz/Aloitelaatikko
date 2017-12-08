/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletit;

import Tietovarastopakkaus.Aloite;
import Tietovarastopakkaus.Tietovarasto;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author s1601396
 */
@WebServlet(name = "lisaaAloite", urlPatterns = {"/lisaaAloite"})
public class lisaaAloite extends HttpServlet {

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

        String aloitenimi = request.getParameter("aloitenimi");
        String aloitekuvaus = request.getParameter("aloitekuvaus");

        String pvm = sdf.format(date);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Aloitteen lisäys </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Aloitteen tiedot </h1>");
            out.println("Aloiteen nimi: " + aloitenimi + "<br>");
            out.println("Aloiteen kuvaus: " + aloitekuvaus + "<br>");
            out.println("Aloiteen pvm: " + pvm + "<br>");
            out.println("</body>");
            out.println("</html>");

            Aloite aloite = new Aloite(0, aloitenimi, aloitekuvaus, pvm, Integer.toString(Tietovarasto.getKayttajaID()));

            if (tietovarasto.lisaaAloite(aloite)) {
                out.println("<h2>Lisäys onnistui</h2>");
            } else {
                out.println("<h2>Lisäys epäonnistui</h2>");
            }
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
