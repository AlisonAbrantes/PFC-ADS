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
import javax.servlet.http.HttpSession;
import modelo.Usuario;
import util.Md5;

/**
 *
 * @author Alison
 */
public class CadastrarUsuarioAction implements ICommand{
        public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
            
            String msg;
            
            HttpSession session = request.getSession();
            
       try{
            Usuario user=new Usuario();
            user.setNome(request.getParameter("txtnome"));
            user.setEmail(request.getParameter("txtemail"));
          
            if(user.getNome().length()<3 && user.getEmail().length()<5)
           {
               msg ="Digite um nome e email";
               session.setAttribute("mensagem", msg);
               return "/Home.jsp";
           }else{
                 // Esta condição é para validar se o usuario entrou com uma Senha.
            if (request.getParameter("txtsenha") != null)
            {
             user.setSenha(Md5.senhamd5(request.getParameter("txtsenha")));
             
              UsuarioDao usercomDao = new UsuarioDao();
              usercomDao.Cadastrar(user);
               
               msg ="Cadastrado com Sucesso";
               
               session.setAttribute("mensagem", msg);
               return "/Home.jsp";
            }
            else{
                msg =" Digite uma senha";
               session.setAttribute("mensagem", msg);
               return "/Home.jsp";
            }
            
          }
           
              
           }catch (Exception ex){
          
            return "/Home.jsp";
       }     
    }
}
