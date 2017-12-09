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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>Hae Aloitteet</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"pictures/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();
        
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Kaikki aloitteet</h1><br>\r\n");
      out.write("            <div class=\"table-responsive table-header\">\r\n");
      out.write("                <table class=\"table table-striped\" border=\"1\">\r\n");
      out.write("                    <thead class=\"thead-dark\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"th th-id\">ID</th>\r\n");
      out.write("                            <th class=\"th th-nimi\">Aloite</th>\r\n");
      out.write("                            <th class=\"th th-Kuvaus\">Kuvaus</th>\r\n");
      out.write("                            <th class=\"th th-pvm\">pvm</th>\r\n");
      out.write("                            <th class=\"th th-kayttajaID\">Käyttäjä ID</th>\r\n");
      out.write("                            <th class=\"th th-vaihe\">Vaihe</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"table-responsive table-scroll\">\r\n");
      out.write("                <table class=\"table table-striped\" border=\"1\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

                            for (Aloite aloite : tietovarasto.haeKaikkiAloitteet()) {
                        
      out.write("\r\n");
      out.write("                        <tr class=\"tr\">\r\n");
      out.write("\r\n");
      out.write("                            <td class=\"td td-id\">");
      out.print( aloite.getAloiteID());
      out.write("</td>\r\n");
      out.write("                            <td class=\"td td-nimi\">");
      out.print( aloite.getAloitenimi());
      out.write("</td>\r\n");
      out.write("                            <td class=\"td-Kuvaus\">");
      out.print( aloite.getAloitekuvaus());
      out.write("</td>\r\n");
      out.write("                            <td class=\"td td-pvm\">");
      out.print( aloite.getPvm());
      out.write("</td>\r\n");
      out.write("                            <td class=\"td td-kayttajaID\">");
      out.print( aloite.getKayttajaID());
      out.write("</td>\r\n");
      out.write("                            ");

                                String vaihe = "";
                                if (tietovarasto.olemassaolevaToimenpide(aloite.getAloiteID())) {
                                    vaihe = tietovarasto.getVaihe();

                                    if (vaihe.equals("1")) { 
      out.write("\r\n");
      out.write("                            <td class=\"td td-vaihe\">-</td>\r\n");
      out.write("                            ");
} else if (vaihe.equals("2")) {
      out.write("\r\n");
      out.write("                            <td class=\"td td-vaihe\">Odottamassa</td>\r\n");
      out.write("                            ");
 } else if (vaihe.equals("3")) {
      out.write("\r\n");
      out.write("                            <td class=\"td td-vaihe\">Työn alla</td>\r\n");
      out.write("                            ");
 } else {
      out.write("\r\n");
      out.write("                            <td class=\"td td-vaihe\">Valmis</td>\r\n");
      out.write("                            ");
}
                            } else {
                            
      out.write("\r\n");
      out.write("                            <td class=\"td td-vaihe\">-</td>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
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
