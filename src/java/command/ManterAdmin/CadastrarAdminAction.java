/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.ManterAdmin;

import command.ICommand;
import dao.Admin.AdminDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Administrador;
import util.Md5;

/**
 *
 * @author Alison
 */
public class CadastrarAdminAction implements ICommand{
        public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
            
       try{
           Administrador adm = new Administrador();
           
           adm.setNome(request.getParameter("txtnome"));
           adm.setEmail(request.getParameter("txtemail"));
           
             // Esta condição é para validar se o Admininstrador digitou email e senha
           if(adm.getNome().length()==0 && adm.getEmail().length()==0)
           {
               return "adicionar_adm.jsp";
           }
           // Esta condição é para validar se o Administradir entrou com uma Senha.
            if (request.getParameter("txtsenha") != null)
            {
             adm.setSenha(Md5.senhamd5(request.getParameter("txtsenha")));
             
                 AdminDao admDao = new AdminDao();
                admDao.Cadastrar(adm);
               
               return "perfil.jsp";
            }
            else
            {
                return "adicionar_adm.jsp";
            }
           
       }catch (Exception ex){
          
        return "perfil.jsp";
       }     
    }
}
