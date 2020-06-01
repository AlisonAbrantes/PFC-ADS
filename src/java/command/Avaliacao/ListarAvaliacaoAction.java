/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.Avaliacao;

import command.ICommand;
import dao.Avaliacao.AvaliacaoDao;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Avaliacao;

/**
 *
 * @author vinicius
 */
public class ListarAvaliacaoAction implements ICommand{
    
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ArrayList<Avaliacao> arr = new ArrayList<Avaliacao>();

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setSugestao("");
        
        AvaliacaoDao avaliacaoDao = new AvaliacaoDao();
        
        arr = avaliacaoDao.listar(avaliacao);
        
        HttpSession session = request.getSession();

        session.setAttribute("arravaliacao", arr);

        return "avaliacoes.jsp";

    }
    
}
