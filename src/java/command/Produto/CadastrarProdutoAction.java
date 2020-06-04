/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.Produto;

import command.ICommand;
import dao.Armazenamento.ArmazenamentoDao;
import dao.Categoria.CategoriaDao;
import dao.Comp.CompDao;
import dao.Fonte.FonteDao;
import dao.MemoriaRam.MemoriaRamDao;
import dao.PlacaMae.PlacaMaeDao;
import dao.PlacaVideo.PlacaVideoDao;
import dao.Processador.ProcessadorDao;
import dao.Produto.ProdutoDao;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Armazenamento;
import modelo.Categoria;
import modelo.Componente;
import modelo.Fonte;
import modelo.MemoriaRam;
import modelo.PlacaMae;
import modelo.PlacaVideo;
import modelo.Processador;
import modelo.Produto;
import modelo.TipoComponente;
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
             objcat.setDescricao("");// Set Vazio para buscar todos os registros
             arrcategoria = categoriaDao.listar(objcat);
            
             HttpSession session = request.getSession();
             session.setAttribute("arrcategoria", arrcategoria);
             
             }catch (Exception ex){
                 
            }
            //Carrega TODOS OS COMPONENTES NA SESSÃO
            try{
                PlacaMae objPlaca = new PlacaMae();
                PlacaMaeDao placaDao = new PlacaMaeDao();

                ArrayList<PlacaMae> arrPlacas = new ArrayList<>();
                objPlaca.setDescricao("");
                arrPlacas = placaDao.listar(objPlaca);
                
                HttpSession session = request.getSession();
                session.setAttribute("arrPlacas", arrPlacas);
            }catch(Exception e){
                //
            }
            
            try{
                Processador objpcd = new Processador();
                ProcessadorDao processadorDao = new ProcessadorDao();
                
                ArrayList<Processador> arrproc = new ArrayList<>();
                objpcd.setDescricao("");
                arrproc = processadorDao.listar(objpcd);
                
                HttpSession session = request.getSession();
                session.setAttribute("arrproc", arrproc);
            }catch(Exception e){
                //
            }
             
            try{
                MemoriaRam objRam = new MemoriaRam();
                MemoriaRamDao RamDao = new MemoriaRamDao();
                
                ArrayList<MemoriaRam> arrRam = new ArrayList<>();
                objRam.setDescricao("");
                arrRam = RamDao.listar(objRam);
                
                HttpSession session = request.getSession();
                session.setAttribute("arrRam", arrRam);
            }catch(Exception e){
                //
            }
            
            try{
                PlacaVideo objVideo = new PlacaVideo();
                PlacaVideoDao VideoDao = new PlacaVideoDao();
                
                ArrayList<PlacaVideo> arrVideo = new ArrayList<>();
                objVideo.setDescricao("");
                arrVideo = VideoDao.listar(objVideo);
                
                HttpSession session = request.getSession();
                session.setAttribute("arrVideo", arrVideo);
            }catch(Exception e){
                //
            }
             
            try{
                Armazenamento objDisco = new Armazenamento();
                ArmazenamentoDao daoDisco = new ArmazenamentoDao();
                
                ArrayList<Armazenamento> arrDisco = new ArrayList<>();
                objDisco.setDescricao("");
                arrDisco = daoDisco.listar(objDisco);
                
                HttpSession session = request.getSession();
                session.setAttribute("arrDisco", arrDisco);
            }catch(Exception e){
                //
            }
            
            try{
                Fonte objfonte = new Fonte();
                FonteDao daoFonte = new FonteDao();
                
                ArrayList<Fonte> arrFonte = new ArrayList<>();
                objfonte.setDescricao("");
                arrFonte = daoFonte.listar(objfonte);
                
                HttpSession session = request.getSession();
                session.setAttribute("arrFonte", arrFonte);
            }catch(Exception e){
                //
            }
             
        try {
                Produto produto = new Produto();
                produto.setDescricao(request.getParameter("txtdescricao"));
                
           if (produto.getDescricao().length() == 0) {
                return "manterProdutos.jsp";
            }else{
            // Precisamos criar objetos que serao agregados ao produto
                Categoria categoria = new Categoria(); 
                categoria.setId(Integer.parseInt(request.getParameter("cmbcategoria")));

                Componente objPlaca = new PlacaMae();
                objPlaca.setId(Integer.parseInt(request.getParameter("cmbplacamae")));

                Componente objProcessador = new Processador();
                objProcessador.setId(Integer.parseInt(request.getParameter("cmbprocessador")));

                Componente objplacaVideo = new PlacaVideo();
                objplacaVideo.setId(Integer.parseInt(request.getParameter("cmbplacavideo")));

                Componente objRam = new MemoriaRam();
                objRam.setId(Integer.parseInt(request.getParameter("cmbmemoriaram")));

                Componente objmemoria = new Armazenamento();
                objmemoria.setId(Integer.parseInt(request.getParameter("cmbmemoria")));

                Componente objfonte = new Fonte();
                objfonte.setId(Integer.parseInt(request.getParameter("cmbfonte")));

                ArrayList<Componente> arrcomp = new ArrayList();
                arrcomp.add(0, objPlaca);
                arrcomp.add(1, objProcessador);
                arrcomp.add(2, objplacaVideo);
                arrcomp.add(3, objRam);
                arrcomp.add(4, objmemoria);
                arrcomp.add(5, objfonte);

                //ASSIM PODEMOS RETORNAR O ARRAY DE COMPONENTES PARA A AGREGAÇÃO
                produto.setCategoria(categoria);//aqui acontece a agregação
                produto.setComponente(arrcomp);
             
                    CompDao compDao = new CompDao();
                    ProdutoDao prodDao = new ProdutoDao();
                    prodDao.cadastrar(produto,compDao);
                return "/ControleProduto?acao=Listar";
            }
        } catch (Exception ex) {
            return "manterProdutos.jsp";

        }

    }

}
