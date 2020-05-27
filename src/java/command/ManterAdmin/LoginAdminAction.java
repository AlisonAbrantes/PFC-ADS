package command.ManterAdmin;

import command.ICommand;
import dao.Admin.AdminDao;
import modelo.Administrador;
import util.Md5;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAdminAction implements ICommand{
    
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Usamos este if para validar se o adm digitou algo nos campos
        if (request.getParameter("txtemail") != null && request.getParameter("txtsenha") != null) {

            Administrador adm = new Administrador();
        // Após validar a entrada de dados, resgatamos os valores e setamos nos atributos da classe    
            adm.setEmail(request.getParameter("txtemail"));
            adm.setSenha(Md5.senhamd5(request.getParameter("txtsenha")));

            AdminDao admDao = new AdminDao();
        // Finalmente, poderemos comparar os campos com os valores do banco
            admDao.login(adm);
            
            HttpSession session = request.getSession();
        // Usamos este if para validar se os campos digitados correspondem aos valores retornados do banco.
        if (adm.getEmail().equals(request.getParameter("txtemail")) && adm.getSenha().equals(Md5.senhamd5(request.getParameter("txtsenha")))) 
        {
            //Caso os valores seham corretos, apagamos a senha da sessao para evitar o roubo da senha
                adm.setSenha("");
                session.setAttribute("adm", adm);

                return "/Pagina_usuario.jsp";
                
            } else {
                return "/Admin.jsp";
            }
        } else {
            return "/Admin.jsp";
        }
    }
}
