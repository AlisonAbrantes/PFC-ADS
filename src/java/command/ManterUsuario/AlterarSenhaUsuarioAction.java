/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.ManterUsuario;

import command.ICommand;
import command.ManterUsuario.*;
import dao.Usuario.UsuarioDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import util.Md5;

/**
 *
 * @author Alison
 */
public class AlterarSenhaUsuarioAction implements ICommand{
     public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

             Usuario user = new Usuario();
        
            user.setId(Integer.parseInt(request.getParameter("id")));
            if (request.getParameter("txtsenha") != null)
                {
                    user.setSenha(Md5.senhamd5(request.getParameter("txtsenha")));
                    UsuarioDao admdao = new UsuarioDao();

                    admdao.AlterarSenha(user);
                }
            else
            {
                return "pagina_usuario.jsp";
            }

        return "/ControleUsuario?acao=Login";
    }
}
