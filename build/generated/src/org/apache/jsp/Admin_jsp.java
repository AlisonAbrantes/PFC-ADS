package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"CSS/loginAdm.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <link href=\"Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <title>Login ADM</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <div class=\"box-login\">\r\n");
      out.write("       <div class=\"formulario\">\r\n");
      out.write("           <img src=\"imagens/icon-login.png\" alt=\"Login\" class=\"icon-login\">\r\n");
      out.write("           <h1 class=\"title-login\"> Login</h1>\r\n");
      out.write("           <form action=\"");
      out.print( application.getContextPath());
      out.write("/ControleAdmin\" method=\"POST\">\r\n");
      out.write("               <input type=\"hidden\" name=\"acao\"  id=\"acao\" value=\"Login\"/>\r\n");
      out.write("               <div class=\"field-email\">\r\n");
      out.write("                    <input type=\"email\" name=\"txtemail\" id=\"txtemail\" class=\"field campo\" placeholder=\"Insira seu email\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"field-senha\">\r\n");
      out.write("                    <input type=\"password\" name=\"txtsenha\" id=\"txtsenha\" class=\"field campo\" placeholder=\"Insira sua senha\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"field-btn\">\r\n");
      out.write("                <input type=\"submit\" name=\"enviar\" id=\"enviar\" class=\"field btn-logar\" value=\"Enviar\">\r\n");
      out.write("               </div>\r\n");
      out.write(" \r\n");
      out.write("           </form>\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("   </div>\r\n");
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
