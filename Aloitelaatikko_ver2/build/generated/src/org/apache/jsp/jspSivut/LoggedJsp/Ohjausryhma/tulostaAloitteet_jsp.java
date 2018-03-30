package org.apache.jsp.jspSivut.LoggedJsp.Ohjausryhma;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.*;

public final class tulostaAloitteet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url(\"spagettikissa.jpg\");\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            table {\r\n");
      out.write("                background: rgba(255, 255, 255, 0.7) !important;\r\n");
      out.write("                border: 1px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thAloiteID {\r\n");
      out.write("                width: 5%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thNimi {\r\n");
      out.write("                width: 15%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thKuvaus {\r\n");
      out.write("                width: 50%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thPVM {\r\n");
      out.write("                width: 10%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thKayttajaID {\r\n");
      out.write("                width: 5%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thPoista {\r\n");
      out.write("                width: 5%\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thVaihe {\r\n");
      out.write("                width: 5%\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .tdKuvaus {\r\n");
      out.write("                text-align: left !important;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .tdNimi {\r\n");
      out.write("                text-align: left !important;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Aloitteiden Haku</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/Aloitelaatikko_ver2/jspSivut/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();
        
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Kaikki aloitteet</h1>\r\n");
      out.write("            <div class=\"table-responsive\">\r\n");
      out.write("                <table class=\"table table-striped\">\r\n");
      out.write("                    <thead class=\"thead-dark\">\r\n");
      out.write("                        <tr class=\"tr\">\r\n");
      out.write("                            <th class=\"thAloiteID\">AloiteID</th>\r\n");
      out.write("                            <th class=\"thNimi\">Aloite</th>\r\n");
      out.write("                            <th class=\"thKuvaus\">Kuvaus</th>\r\n");
      out.write("                            <th class=\"thPVM\">Pvm</th>\r\n");
      out.write("                            <th class=\"thKayttajaID\">KäyttäjäID</th>\r\n");
      out.write("                            <th class=\"vaihe\">Vaihe</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

                            String vaihe = "";
                            for (Aloite aloite : tietovarasto.haeKaikkiAloitteet()) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print( aloite.getAloiteID());
      out.write("</td>\r\n");
      out.write("                            ");
 if (!tietovarasto.toimenpideTehty(aloite.getAloiteID())) {
      out.write("\r\n");
      out.write("                            <td class=\"tdNimi\"><a href=\"lisaaToimenpide.jsp?aloiteID=");
      out.print(aloite.getAloiteID());
      out.write("&aloitekuvaus=");
      out.print( aloite.getAloitekuvaus());
      out.write('"');
      out.write('>');
      out.print(aloite.getAloitenimi());
      out.write("</a></td>\r\n");
      out.write("                                ");
} else {
      out.write("\r\n");
      out.write("                            <td class=\"tdNimi\">");
      out.print(aloite.getAloitenimi());
      out.write("</td>\r\n");
      out.write("                            ");
 }
      out.write("\r\n");
      out.write("                            <td class=\"tdKuvaus\">");
      out.print( aloite.getAloitekuvaus());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( aloite.getPvm());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( aloite.getKayttajaID());
      out.write("</td>\r\n");
      out.write("                            ");
 if (tietovarasto.toimenpideTehty(aloite.getAloiteID())) {
      out.write("\r\n");
      out.write("                            ");

                                vaihe = Tietovarasto.getVaihe();
                                if (vaihe.equals("1")) {
                            
      out.write("\r\n");
      out.write("                            <td>-</td>\r\n");
      out.write("                            ");

                            } else if (vaihe.equals("2")) {
                            
      out.write("\r\n");
      out.write("                            <td>Huomioitu</td>\r\n");
      out.write("                            ");

                            } else if (vaihe.equals("3")) {
                            
      out.write("\r\n");
      out.write("                            <td>Työn alla</td>\r\n");
      out.write("                            ");

                            } else {
                            
      out.write("\r\n");
      out.write("                            <td>Työn alla</td>\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
 } else { 
      out.write("\r\n");
      out.write("                    <td>-</td>\r\n");
      out.write("                    ");
 }
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
