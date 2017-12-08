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
 * @author s1601396
 */
@WebServlet(name = "poistaAloite", urlPatterns = {"/poistaAloite"})
public class poistaAloite extends HttpServlet {

    private Tietovarasto tietovarasto = new Tietovarasto();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String aloiteID = request.getParameter("aloiteID");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"refresh\" content=\"3;url=jspSivut/tulostaAloitteet.jsp\" />");
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
            out.println("<title>Aloitteen poistaminen</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Aloitteen poistaminen</h1>");
            out.println("<h2>Uudelleenohjaus 3 sekunnin kuluttua...</h2>");
            out.println("</body>");
            out.println("</html>");

            if (tietovarasto.aloitteenPoistaminen(Integer.parseInt(aloiteID))) {
                out.println("<h2>Poisto onnistui</h2>");

            } else {
                out.println("<h2>Poisto epäonnistui</h2>");
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
