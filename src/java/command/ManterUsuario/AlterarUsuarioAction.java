/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.ManterUsuario;

import dao.Usuario.UsuarioDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import util.Md5;

/**
 *
 * @author Alison
 */
public class AlterarUsuarioAction {
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

       
  if (request.getParameter("txtemail") != null && request.getParameter("txtsenha") != null) {
      
       Usuario user = new Usuario();
       
        user.setNome(request.getParameter("txtnome"));
        user.setEmail(request.getParameter("txtemail"));
        user.setId(Integer.parseInt(request.getParameter("id")));
        
        UsuarioDao userdao = new UsuarioDao();

        userdao.alterarSenha(user);
        
  }else{
      return "pagina_usuario";
  }
       // user.setSenha(Md5.senhamd5(request.getParameter("txtsenha")));

        return "/ControleUsuario?acao=Login";
    }
}
