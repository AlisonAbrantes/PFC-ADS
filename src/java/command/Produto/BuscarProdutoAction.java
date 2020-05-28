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
import modelo.Produto;


/**
 *
 * @author alunocmc
 */
public class BuscarProdutoAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
 
         try{
            Categoria categoria = new Categoria();
            CategoriaDao categoriadao = new CategoriaDao();
            ArrayList<Categoria> arrcategoria = new ArrayList<>();
            categoria.setDescricao(""); //desta forma virão todos os registros
            arrcategoria = categoriadao.listar(categoria);
            HttpSession session = request.getSession();
            session.setAttribute("arrcategoria", arrcategoria);
        }catch(Exception ex){
            //nada a fazer
        }
        
        Produto produto = new Produto();
       
        ProdutoDao produtodao = new ProdutoDao();

        produto.setId(Integer.parseInt(request.getParameter("id")));
        
        produtodao.buscar(produto);

        HttpSession session = request.getSession();

        session.setAttribute("produto", produto);
        
        return "/Admin/ManterProdutos.jsp";
           
    }
    
}
