/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletit;

import Tietovarastopakkaus.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Osku Sirpoma
 */
@WebServlet(name = "index", urlPatterns = {"/index"})
public class index extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Tietovarasto tietovarasto = new Tietovarasto();
            String username = request.getParameter("username");
            String salasana = request.getParameter("salasana");

            if (tietovarasto.haeKayttaja(username, salasana)) {
                String ryhma = tietovarasto.getRyhma();
                int kayttajaID = tietovarasto.getKayttajaID();
                HttpSession session = request.getSession();
                // Sessio vanhentuu tunnin kuluessa (60*60s)
                session.setMaxInactiveInterval(60 * 60);
                session.setAttribute("ryhma", ryhma);
                session.setAttribute("kayttajaID", kayttajaID);
                session.setAttribute("knimi", username);
                if (Tietovarasto.haeRyhma().equals("Yllapito")) {
                    response.sendRedirect("jspSivut/LoggedJsp/Yllapito/etusivuYllapito.jsp");
                } else if (Tietovarasto.haeRyhma().equals("Ohjausryhma")) {
                    response.sendRedirect("jspSivut/LoggedJsp/Ohjausryhma/etusivuOhjausryhma.jsp");
                } else {
                    response.sendRedirect("jspSivut/LoggedJsp/Kayttaja/etusivuKayttaja.jsp");
                }
            } else {
                tietovarasto.setLogin(false);
                response.sendRedirect("jspSivut/index.jsp");
            }
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
