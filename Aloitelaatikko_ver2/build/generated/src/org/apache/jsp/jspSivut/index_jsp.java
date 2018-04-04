package org.apache.jsp.jspSivut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.Tietovarasto;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("        <link href=\"../CSS/signin.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"../CSS/style3.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            footer{\r\n");
      out.write("                font-family: Brush Script MT;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <title>Aloitelaatikko</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"indexBody\">\r\n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-dark\">\r\n");
      out.write("            <!-- Brand/logo -->\r\n");
      out.write("            <a href=\"etusivuKayttaja.jsp\" class=\"navbar-brand\"><img src=\"/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png\"></a>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"etusivuKayttaja.jsp\"><img src=\"/Aloitelaatikko_ver2/jspSivut/Aloitelaatikko_teksti.png\"></a>\r\n");
      out.write("            <a href=\"etusivuKayttaja.jsp\" class=\"navbar-brand\"><img src=\"/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png\"></a><br>\r\n");
      out.write("            <img src=\"/Aloitelaatikko_ver2/jspSivut/Kirjautuminen.png\">\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"indexDiv form-group\">\r\n");
      out.write("            <form class=\"form-signin\" name=\"lisays\" action=\"../../Aloitelaatikko_ver2/index\" method=\"post\">\r\n");
      out.write("                ");

                    if (Tietovarasto.getLogin() == false) {
                
      out.write("\r\n");
      out.write("                <style>\r\n");
      out.write("                    .form-control{\r\n");
      out.write("                        border: 1px solid red;\r\n");
      out.write("                    }\r\n");
      out.write("                </style>\r\n");
      out.write("                <p style=\"color:red\">Kirjautuminen epäonnistui, yritä uudelleen.</p>\r\n");
      out.write("                ");

                    }
                    Tietovarasto.setLogin(true);
                
      out.write("\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Käyttäjätunnus\">\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"salasana\" placeholder=\"Salasana\">\r\n");
      out.write("                <input type=\"submit\" class=\"btn btn-primary\" value=\"Kirjaudu\" name=\"submit\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer class=\"container-fluid footer text-center fixed-bottom\">\r\n");
      out.write("            <img class=\"copyright\" src=\"/Aloitelaatikko_ver2/jspSivut/Copyright.png\">\r\n");
      out.write("        </footer>\r\n");
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
