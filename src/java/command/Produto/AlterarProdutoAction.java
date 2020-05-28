/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.Produto;

import command.ICommand;
import dao.Produto.ProdutoDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Produto;
import modelo.Categoria;

/**
 *
 * @author alunocmc
 */
public class AlterarProdutoAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Produto produto = new Produto();

        produto.setDescricao(request.getParameter("txtdescricao"));

        produto.setId(Integer.parseInt(request.getParameter("id")));

        Categoria categoria = new Categoria(); //perceba que procisamos criar um objeto categoria que será agregado ao produto
        categoria.setId(Integer.parseInt(request.getParameter("cmbcategoria")));
        produto.setCategoria(categoria); //aqui acontece a agregação

        ProdutoDao produtodao = new ProdutoDao();

        produtodao.alterar(produto);

        return "/ControleAdmin?acao=ListarProduto";

    }

}
