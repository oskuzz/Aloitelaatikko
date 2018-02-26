package org.apache.jsp.jspSivut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.Kayttaja;
import Tietovarastopakkaus.Aloite;
import Tietovarastopakkaus.Tietovarasto;

public final class tulostaKayttajat_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Hae Aloitteet</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"pictures/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Kaikki Kayttajat</h1><br>\n");
      out.write("            <div class=\"table-responsive table-header\">\n");
      out.write("                <table class=\"table table-striped\" border=\"1\">\n");
      out.write("                    <thead class=\"thead-dark\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"th th-id\">ID</th>\n");
      out.write("                            <th class=\"th th-nimi\">Etunimi</th>\n");
      out.write("                            <th class=\"th th-kuvaus\">Sukunimi</th>\n");
      out.write("                            <th class=\"th th-pvm\">Email</th>\n");
      out.write("                            <th class=\"th th-kayttajaID\">Käyttäjätunnus</th>\n");
      out.write("                            <th class=\"th th-vaihe\">Puhelin</th>\n");
      out.write("                            <th class=\"th th-vaihe\">Päiväys</th>\n");
      out.write("                            <th class=\"th th-vaihe\">Ryhmä</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"table-responsive table-scroll\">\n");
      out.write("                <table class=\"table table-striped\" border=\"1\">\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            for (Kayttaja kayttaja : tietovarasto.haeKaikkiKayttajat()) {
                        
      out.write("\n");
      out.write("                        <tr class=\"tr\">\n");
      out.write("                            <td class=\"td td-id\">");
      out.print( kayttaja.getKayttajaID());
      out.write("</td>\n");
      out.write("                            <td class=\"td td-etunimi\">");
      out.print(kayttaja.getEtunimi());
      out.write("</td>\n");
      out.write("                            <td class=\"td td-sukunimi\">");
      out.print( kayttaja.getSukunimi());
      out.write("</td>\n");
      out.write("                            <td class=\"td td-email\">");
      out.print( kayttaja.getEmail());
      out.write("</td>\n");
      out.write("                            <td class=\"td td-kayttajatunnus\">");
      out.print( kayttaja.getKayttajaTunnus());
      out.write("</td>\n");
      out.write("                            <td class=\"td td-puhelin\">");
      out.print( kayttaja.getPuhelin());
      out.write("</td>\n");
      out.write("                            <td class=\"td td-pvm\">");
      out.print( kayttaja.getLuontipaivays());
      out.write("</td>\n");
      out.write("                            <td class=\"td td-ryhma\">");
      out.print( kayttaja.getRyhma());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
