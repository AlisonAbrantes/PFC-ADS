package command.ManterUsuario;

import command.ICommand;
import dao.Usuario.UsuarioDao;
import modelo.Usuario;
import util.Md5;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginUsuarioAction implements ICommand{
    
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Usamos este if para validar se o user digitou algo nos campos
        if (request.getParameter("txtemail") != null && request.getParameter("txtsenha") != null) {

            Usuario user = new Usuario();
        // Após validar a entrada de dados, resgatamos os valores e setamos nos atributos da classe    
            user.setEmail(request.getParameter("txtemail"));
            user.setSenha(Md5.senhamd5(request.getParameter("txtsenha")));

            UsuarioDao userDao = new UsuarioDao();
        // Finalmente, poderemos comparar os campos com os valores do banco
            userDao.login(user);
            
            HttpSession session = request.getSession();
        // Usamos este if para validar se os campos digitados correspondem aos valores retornados do banco.
        if (user.getEmail().equals(request.getParameter("txtemail")) && user.getSenha().equals(Md5.senhamd5(request.getParameter("txtsenha")))) 
        {
            //Caso os valores seham corretos, apagamos a senha da sessao para evitar o roubo da senha
                user.setSenha("");
                session.setAttribute("user", user);

                return "pagina_usuario.jsp";
                
            } else {
                return "Home.jsp";
            }
        } else {
            return "Home.jsp";
        }
    }
}
