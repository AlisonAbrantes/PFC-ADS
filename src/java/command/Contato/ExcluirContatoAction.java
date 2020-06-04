/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.Contato;

import command.ICommand;
import dao.Contato.ContatoDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Contato;

/**
 *
 * @author alunocmc
 */
public class ExcluirContatoAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Contato objContato = new Contato();
        ContatoDao daoContato = new ContatoDao();
        
        objContato.setId(Integer.parseInt(request.getParameter("id")));

                daoContato.excluir(objContato);
                return "/ControleContato?acao=Listar";
        
        }
}


