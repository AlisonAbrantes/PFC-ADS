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
import modelo.Contato;

/**
 *
 * @author vinicius
 */
public class CadastrarContatoAction implements ICommand{
    
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            Contato contato = new Contato();
            contato.setNome(request.getParameter("txtnome"));
            contato.setEmail(request.getParameter("txtemail"));
            contato.setTelefone(request.getParameter("txttelefone"));
            contato.setMensagem(request.getParameter("txtmensagem"));

            if (contato.getEmail().length() == 0 && contato.getMensagem().length() == 0) {
                return "Home.jsp";
            } else {

                ContatoDao contatodao = new ContatoDao();

                contatodao.cadastrar(contato);

                return "Home.jsp";
            }
        } catch (Exception ex) {
            return "página cadastro";

        }

    }
    
}
