package Servletit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Tietovarastopakkaus.Tietovarasto;
import Tietovarastopakkaus.Toimenpide;
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
@WebServlet(urlPatterns = {"/lisaaToimenpide"})
public class lisaaToimenpide extends HttpServlet {

    private Tietovarasto tietovarasto = new Tietovarasto();
    private Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

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
        String kuvaus = request.getParameter("kuvaus");
        String luontipaivays = sdf.format(date);
        String aloiteID = request.getParameter("aloiteID");
        String vaihe = request.getParameter("vaihe");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet lisaaToimenpide</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Toimenpiteen tiedot </h1>");
            out.println("KäyttäjäID: " + Tietovarasto.getKayttajaID() + "<br>");
            out.println("aloiteID: " + aloiteID + "<br>");
            out.println("Kuvaus: " + kuvaus + "<br>");
            out.println("Luonti päivämäärä: " + luontipaivays + "<br>");
            out.println("Vaihe: " + vaihe + "<br>");
            out.println("</body>");
            out.println("</html>");

            Toimenpide toimenpide = new Toimenpide(0, kuvaus, luontipaivays, Tietovarasto.getKayttajaID(), Integer.parseInt(aloiteID), vaihe);

            if (tietovarasto.lisaaToimenpide(toimenpide)) {
                // Lisäys onnistui
                out.println("<h2>Lisäys onnistui</h2>");
            } else {
                out.println("<h2>Lisäys epäonnistui</h2>");
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
