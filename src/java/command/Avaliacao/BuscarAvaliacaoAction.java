/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.Avaliacao;

import command.ICommand;
import dao.Avaliacao.AvaliacaoDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Avaliacao;

/**
 *
 * @author vinicius
 */
public class BuscarAvaliacaoAction implements ICommand{
    
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
 
        Avaliacao avaliacao = new Avaliacao();
       
        AvaliacaoDao avaliacaodao = new AvaliacaoDao();

        avaliacao.setId(Integer.parseInt(request.getParameter("id")));
        
        avaliacaodao.buscar(avaliacao);

        HttpSession session = request.getSession();

        session.setAttribute("avaliacao", avaliacao);
        
        return "/cadastros/tipo/alterar_tipo.jsp";
           
    }
}
