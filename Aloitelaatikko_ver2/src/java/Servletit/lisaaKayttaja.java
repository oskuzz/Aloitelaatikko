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
 * @author Osku Sirpoma
 */
@WebServlet(name = "lisaaKayttaja", urlPatterns = {"/lisaaKayttaja"})
public class lisaaKayttaja extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    // Määritellään viittaus Tietovarasto-luokkaan
    private Tietovarasto tietovarasto = new Tietovarasto();
    
    private Date date = new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        // Talletetaan lomakkeelle syötetyt käyttäjän tiedot
        String etunimi = request.getParameter("etunimi");
        String sukunimi = request.getParameter("sukunimi");
        String email = request.getParameter("email");
        String kayttajatunnus = request.getParameter("kayttajatunnus");
        String salasana = request.getParameter("salasana");
        String puhelin = request.getParameter("puhelin");
        String ryhma = request.getParameter("ryhma");
        // String luontipaivays = request.getParameter("luontipaivays");
        String luontipaivays = sdf.format(date);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Käyttäjän lisäys</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Käyttäjän tiedot</h1>");
            
            out.println("Etunimi: " + etunimi + "<br>");
            out.println("Sukunimi: " + sukunimi + "<br>");
            out.println("Email: " + email + "<br>");
            out.println("Käyttäjätunnus: " + kayttajatunnus + "<br>");
            out.println("Salasana: " + salasana + "<br>");
            out.println("Puhelin: " + puhelin + "<br>");
            out.println("Luontipäiväys: " + luontipaivays + "<br>");
            out.println("Ryhmä: " + ryhma + "<br>");
            
            // Luodaan käyttäjä-olio lomakkeelta saatujen tietojen avulla
           
            Kayttaja kayttaja = new Kayttaja(0, etunimi, sukunimi, email, kayttajatunnus, salasana, puhelin, luontipaivays, ryhma);
            
            // Kutsutaan metodia lisaaKayttaja. Metodille välitetään kayttaja-olio
            
            if (tietovarasto.lisaaKayttaja(kayttaja)) {
                //Lisäys onnistui
                out.println("<h2>Lisäys onnistui</h2>");
            } else {
                //Lisäys epäonnistui
                out.println("<h2>Lisäys epäonnistui</h2>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
