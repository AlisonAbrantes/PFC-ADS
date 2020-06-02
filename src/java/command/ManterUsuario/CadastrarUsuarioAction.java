/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.ManterUsuario;

import command.ICommand;
import dao.Usuario.UsuarioDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import util.Md5;

/**
 *
 * @author Alison
 */
public class CadastrarUsuarioAction implements ICommand{
        public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
            
       try{
           Usuario user=new Usuario();
           
           user.setNome(request.getParameter("txtnome"));
           user.setEmail(request.getParameter("txtemail"));
           
           // Esta condição é para validar se o usuario entrou com uma Senha.
            if (request.getParameter("txtsenha") != null)
            {
             user.setSenha(Md5.senhamd5(request.getParameter("txtsenha")));
            }
            else
            {
                return "/Home.jsp";
            }
           
            // Esta condição é para validar se o usuario digitou email e senha
           if(user.getNome().length()<3 && user.getEmail().length()<5)
           {
               return "/Home.jsp";
           }
           else
           {
               UsuarioDao usercomDao = new UsuarioDao();
               usercomDao.Cadastrar(user);
               
               return "/Home.jsp";
           }
       }catch (Exception ex){
          
        return "/Home.jsp";
       }     
    }
}
