package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/adm.css\">\r\n");
      out.write("    <link href=\"../Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <link href=\"../Bootstrap/bootstrap-4.4.1-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <title>Perfil</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <a href=\"pag_adm.jsp\"> <h1 class=\"titulo\"> COINS</h1> </a>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"perfil.jsp\" class=\"btn-perfil\"><li>Perfil</li></a>\r\n");
      out.write("            <a href=\"manterProdutos.jsp\" class=\"btn-prod\"> <li> Manter produtos</li></a>\r\n");
      out.write("            <a href=\"avaliacoes.jsp\" class=\"btn-avl\"> <li>Avaliações</li></a>\r\n");
      out.write("            <a href=\"consultar_mensagens.jsp\" class=\"btn\"> <li>Consultar mensagens</li></a>\r\n");
      out.write("            <a href=\"consultar_log.jsp\" class=\"btn\"> <li>Consultar Log</li></a>\r\n");
      out.write("            <a href=\"../Admin.jsp\" class=\"btn\"><li> Sair</li></a>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"conteudo\">\r\n");
      out.write("        <section class=\"geral\">\r\n");
      out.write("            <h1> Perfil</h1>\r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"../JS/adm.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"conteudo\">\r\n");
      out.write("            <section class=\"geral\">\r\n");
      out.write("                <h1 class=\"pag-title\"> Perfil</h1>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                     <form class=\"formulario\">\r\n");
      out.write("                         <div class=\"row\">\r\n");
      out.write("                             <div class=\"col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2\">\r\n");
      out.write("                                 <label for=\"email\" class=\"text-light lbl-form\"> Email</label>\r\n");
      out.write("                                 <input type=\"email\" name=\"email\" id=\"email\" class=\"field\">\r\n");
      out.write("                             </div>\r\n");
      out.write("                             <div class=\"col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2\">\r\n");
      out.write("                                 <label for=\"senha\" class=\"text-light lbl-form\"> Senha</label>\r\n");
      out.write("                                 <input type=\"password\" name=\"senha\" id=\"senha\" class=\"field\">\r\n");
      out.write("                             </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <div class=\"row\">\r\n");
      out.write("                             <div class=\"col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2\">\r\n");
      out.write("                                 <button class=\"btn-salvar\"> Salvar alterações</button>\r\n");
      out.write("                             </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                     </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("     </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
