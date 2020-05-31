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
import modelo.Avaliacao;

/**
 *
 * @author vinicius
 */
public class CadastrarAvaliacaoAction implements ICommand{
        @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.setSugestao(request.getParameter("txtsugrestao"));
            avaliacao.setNivel_satisfacao(Integer.parseInt(request.getParameter("btnSatisfacao")));

            if (avaliacao.getSugestao().length() == 0) {
                return "págian cadastro";
            } else {

                AvaliacaoDao avaliacaodao = new AvaliacaoDao();

                avaliacaodao.cadastrar(avaliacao);

                return "página sucesso";
            }
        } catch (Exception ex) {
            return "página cadastro";

        }
    }
}
