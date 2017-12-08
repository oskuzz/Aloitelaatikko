/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servletit;

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
@WebServlet(name = "muokkaaAloite", urlPatterns = {"/muokkaaAloite"})
public class muokkaaAloite extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Tietovarasto tietovarasto = new Tietovarasto();
    private Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String aloiteID = request.getParameter("aloiteID");
            String aloitenimi = request.getParameter("aloiteNimi");
            String aloitekuvaus = request.getParameter("aloiteKuvaus");
            String pvm = sdf.format(date);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"refresh\" content=\"3;url=jspSivut/tulostaAloitteetKayttaja.jsp\" />");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>    ");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>");
            out.println("<style>\n"
                    + "            body {\n"
                    + "                background-image: url(\"jspSivut/pictures/oceanBackground.jpg\");\n"
                    + "                background-size: cover; \n"
                    + "                color: black;\n"
                    + "                text-align: center;\n"
                    + "                padding: 70px;\n"
                    + "            }\n"
                    + "\n"
                    + "            div {\n"
                    + "                max-width: 330px;\n"
                    + "                padding: 15px;\n"
                    + "                margin: 0 auto;\n"
                    + "            }\n"
                    + "        </style>");
            out.println("<title>Aloitteen muokkaaminen</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Aloitteen muokkaaminen</h1>");
            out.println("<h2>Uudelleenohjaus 3 sekunnin kuluttua...</h2>");
            out.println("</body>");
            out.println("</html>");

            if (tietovarasto.aloitteenMuokkaaminen(Integer.parseInt(aloiteID), aloitenimi, aloitekuvaus, pvm)) {
                out.println("<h2>Tallennus onnistui</h2>");

            } else {
                out.println("<h2>Tallennus epäonnistui</h2>");
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
