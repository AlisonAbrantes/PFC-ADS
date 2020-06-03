/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.Produto;

import command.ICommand;
import dao.Categoria.CategoriaDao;
import dao.Produto.ProdutoDao;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Categoria;
import modelo.Componente;
import modelo.Produto;


/**
 *
 * @author alunocmc
 */
public class BuscarProdutoAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
 
        
        Produto produto = new Produto();
       
        ProdutoDao produtodao = new ProdutoDao();

        produto.setId(Integer.parseInt(request.getParameter("id")));
        
        produtodao.buscarComponente(produto);
        
        HttpSession session = request.getSession();

        session.setAttribute("produto", produto);
        
        return "listar_produtos.jsp";
           
    }
    
}
