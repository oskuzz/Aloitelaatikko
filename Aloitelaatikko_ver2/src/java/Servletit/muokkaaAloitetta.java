/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletit;

import Tietovarastopakkaus.Tietovarasto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Osku Sirpoma
 */
@WebServlet(name = "muokkaaAloitetta", urlPatterns = {"/muokkaaAloitetta"})
public class muokkaaAloitetta extends HttpServlet {

    private Tietovarasto tietovarasto = new Tietovarasto();

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
            String aloiteID = request.getParameter("aloiteID");
            String aloitenimi = request.getParameter("aloitenimi");
            String aloitekuvaus = request.getParameter("aloitekuvaus");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv= \"refresh\" content=\"5; url= jspSivut/LoggedJsp/Kayttaja/tulostaAloitteetKayttaja.jsp\" />");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>");
            out.println("<style>\n"
                    + "            body {\n"
                    + "                background-image: url(\"jspSivut/spagettikissa.jpg\");\n"
                    + "                background-size: cover;\n"
                    + "                color: black;\n"
                    + "                text-align: center;\n"
                    + "                padding: 70px;\n"
                    + "            }\n"
                    + "        </style>");
            out.println("");
            out.println("");
            out.println("<title>Aloitteen muokkaaminen</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Sivu uudelleenohjataan 5 sekunnin kuluttua</h2>");
            out.println("</body>");
            out.println("</html>");

            tietovarasto.aloitteenMuokkaaminen(Integer.parseInt(aloiteID), aloitenimi, aloitekuvaus);

            if (tietovarasto.aloitteenMuokkaaminen(Integer.parseInt(aloiteID), aloitenimi, aloitekuvaus)) {
                out.println("<h2>Muokkaaminen onnistui</h2>");

            } else {
                out.println("<h2>Muokkaaminen epäonnistui</h2>");
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
