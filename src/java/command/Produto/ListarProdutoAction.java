/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.Produto;

import command.ICommand;
import dao.Produto.ProdutoDao;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Produto;

/**
 *
 * @author alunocmc
 */
public class ListarProdutoAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ArrayList<Produto> arr = new ArrayList<Produto>();

        Produto produto = new Produto();

        produto.setDescricao("");
        
        ProdutoDao produtoDao = new ProdutoDao();

        arr = produtoDao.Listar(produto);

        HttpSession session = request.getSession();

        session.setAttribute("arrproduto", arr);

        return "manterProdutos.jsp";

    }

}
