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
public class AlterarAdminAction implements ICommand{
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Administrador adm = new Administrador();
        
            adm.setId(Integer.parseInt(request.getParameter("id")));
            adm.setNome(request.getParameter("txtnome"));
            adm.setEmail(request.getParameter("txtemail"));
            
            // Esta condição é para validar se o Admininstrador digitou email e nome
           if(adm.getNome().length()==0 && adm.getEmail().length()==0)
           {
               return "perfil.jsp";
           }
           else{
               
             AdminDao daoAdmin = new AdminDao();
             daoAdmin.alterar(adm);
             
            }
    
         return "/ControleAdmin?acao=Login";
    }
}
