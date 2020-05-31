/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.Contato;

import command.ICommand;
import dao.Contato.ContatoDao;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Contato;

/**
 *
 * @author vinicius
 */
public class ListarMensagemAction {
    public class ListarAvaliacaoAction implements ICommand{
    
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ArrayList<Contato> arr = new ArrayList<Contato>();

        Contato contato = new Contato();
        contato.setMensagem("");
        
        ContatoDao contatoDao = new ContatoDao();
        
        arr = contatoDao.listar(contato);
        
        HttpSession session = request.getSession();

        session.setAttribute("arravaliacao", arr);

        return "avaliacoes.jsp";

        }
    }
}
