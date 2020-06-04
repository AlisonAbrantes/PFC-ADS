package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usuario_005fprodutos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/pagina_usuario.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/bootstrap-grid.min.css\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <nav>\r\n");
      out.write("        <h1 class=\"titulo\"> COINS</h1>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"pagina_usuario.jsp\"><li><img class=\"icon\" src=\"imagens/perfil_icon.png\"> Perfil</li></a>\r\n");
      out.write("           <a href=\"questionario.jsp\"> <li><img class=\"icon\" src=\"imagens/questionario_icon.png\"> Iniciar questionario</li></a>\r\n");
      out.write("           <a href=\"usuario_produtos.jsp\"> <li class=\"active\"><img class=\"icon\" src=\"../imagens/lista_icon.png\">Produtos salvos</li></a>\r\n");
      out.write("            <a href=\"Home.jsp\"><li><img class=\"icon\" src=\"imagens/logout_icon.png\"> Sair</li></a>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"conteudo\">\r\n");
      out.write("            <section class=\"geral\">\r\n");
      out.write("                <h1 class=\"pag-title\"> Produtos</h1>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12 col-md-12 offset-md-1\">\r\n");
      out.write("                        <table border=\"1px\" class=\"tabela-produtos\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>#</th>\r\n");
      out.write("                                <th>Descrição</th>\r\n");
      out.write("                                <th>Categoria</th>\r\n");
      out.write("                                <th>Placa mãe</th>\r\n");
      out.write("                                <th>Processador</th>\r\n");
      out.write("                                <th>Memória Ram</th>\r\n");
      out.write("                                <th>Memória</th>\r\n");
      out.write("                                <th>Fonte</th>\r\n");
      out.write("                                <th>Placa de vídeo</th>\r\n");
      out.write("                                <th>Excluir</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
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
