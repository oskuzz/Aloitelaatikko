package org.apache.jsp.jspSivut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.*;

public final class tulostaAloitteetKayttaja_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <style> \r\n");
      out.write("\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url(\"pictures/oceanBackground.jpg\");\r\n");
      out.write("                background-size: cover; \r\n");
      out.write("                color: black;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                padding: 70px;\r\n");
      out.write("            }\r\n");
      out.write("            .table {\r\n");
      out.write("                background-color: white !important;\r\n");
      out.write("            }\r\n");
      out.write("            .muokkaa-btn{\r\n");
      out.write("                margin-left: 6px;\r\n");
      out.write("            }\r\n");
      out.write("            .th-muokkaa{\r\n");
      out.write("                width: 50px;\r\n");
      out.write("            }\r\n");
      out.write("            .th-nimi{\r\n");
      out.write("                width: 100px;\r\n");
      out.write("            }\r\n");
      out.write("            .th-id{\r\n");
      out.write("                width: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            .th-tekijatunnus{\r\n");
      out.write("                width: 50px;\r\n");
      out.write("            }\r\n");
      out.write("            .th-pvm{\r\n");
      out.write("                width: 120px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Hae Aloitteet</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();
        
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Kaikki aloitteet</h1>\r\n");
      out.write("            <div class=\"table-responsive\">\r\n");
      out.write("                <table class=\"table table-striped\" border=\"1\">\r\n");
      out.write("                    <thead class=\"thead-dark\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"th th-id\">ID</th>\r\n");
      out.write("                            <th class=\"th th-nimi\">Nimi</th>\r\n");
      out.write("                            <th class=\"th th-kuvaus\">Kuvaus</th>\r\n");
      out.write("                            <th class=\"th th-pvm\">pvm</th>\r\n");
      out.write("                            <th class=\"th th-tekijatunnus\">Tekijätunnus</th>\r\n");
      out.write("                            <th class=\"th th-muokkaa\">Muokkaa</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

                            for (Aloite aloite : tietovarasto.haeKaikkiAloitteet()) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("\r\n");
      out.write("                            <td>");
      out.print( aloite.getAloiteID());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( aloite.getAloitenimi());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( aloite.getAloitekuvaus());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( aloite.getPvm());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( aloite.getKayttajaID());
      out.write("</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <form name=\"lisays\" action='../../Aloitelaatikko_ver2/jspSivut/muokkaaAloite.jsp'>\r\n");
      out.write("                                    <input class=\"btn btn-danger muokkaa-btn\" type=\"submit\" value=\">\" name=\"muokkaa\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
