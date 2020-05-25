package command.usuario;

import command.ICommand;
import dao.UsuarioDao;
import modelo.Usuario;
import util.Md5;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginUsuarioAction implements ICommand{
    
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Usamos este if para validar se o usuario digitou algo nos campos
        if (request.getParameter("txtemail") != null && request.getParameter("txtsenha") != null) {

            Usuario usuario = new Usuario();
        // Após validar a entrada de dados, resgatamos os valores e setamos nos atributos da classe    
            usuario.setEmail(request.getParameter("txtemail"));
            usuario.setSenha(Md5.senhamd5(request.getParameter("txtsenha")));

            UsuarioDao usuariodao = new UsuarioDao();
        // Finalmente, poderemos comparar os campos com os valores do banco
            usuariodao.login(usuario);
            
            HttpSession session = request.getSession();
        // Usamos este if para validar se os campos digitados correspondem aos valores retornados do banco.
            if (usuario.getEmail().equals(request.getParameter("txtemail")) && usuario.getSenha().equals(Md5.senhamd5(request.getParameter("txtsenha")))) {
         
            //Caso os valores seham corretos, apagamos a senha da sessao para evitar o roubo da senha
                usuario.setSenha("");
                session.setAttribute("usuario", usuario);

                return "/Pagina_usuario.jsp";
                
            } else {

                return "/Home.jsp";
            }

        } else {

            return "/Home.jsp";

        }

    }

}
