/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.Produto;

import command.produto.*;
import command.ICommand;
import dao.Categoria.CategoriaDao;
import dao.Produto.ProdutoDao;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Categoria;
import modelo.Componente;
import modelo.PlacaMae;
import modelo.Produto;
/**
 *
 * @author Alison
 */
public class CadastrarProdutoAction implements ICommand {
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

            // Carrega Categorias na sessao.
            try{
             Categoria objcat = new Categoria();
             CategoriaDao categoriaDao =new CategoriaDao();

             ArrayList<Categoria> arrcategoria = new ArrayList<>();
             objcat.setDescricao("");
            
             arrcategoria = categoriaDao.listar(objcat);
            
             HttpSession session = request.getSession();
             session.setAttribute("arrcategoria", arrcategoria);
             
             }catch (Exception ex){
            }
            
        try {
            Produto produto = new Produto();
            produto.setDescricao(request.getParameter("txtdescricao"));
            // Precisamos criar objetos que serao agregados ao produto
            
            Categoria categoria = new Categoria(); 
            categoria.setId(Integer.parseInt(request.getParameter("cmbcategoria")));
            
            Componente objPlaca = new PlacaMae();
            objPlaca.setId(Integer.parseInt(request.getParameter("cmbplacamae")));
            
            //COMO PODEMOS RETORNAR VARIAS COMB PARA COMPONETES RETORNAR AO BANCO
            produto.setCategoria(categoria);//aqui acontece a agregação
            produto.setComponente(objPlaca);

            if (produto.getDescricao().length() == 0) {
                return "/Admin/manterProdutos.jsp";
            } else {
        
                ProdutoDao produtodao = new ProdutoDao();
                produtodao.cadastrar(produto);

                return "/pag_adm.jsp";
            }
        } catch (Exception ex) {
            return "/pag_adm.jsp";

        }

    }

}
