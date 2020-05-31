/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Produto;


import dao.Armazenamento.ArmazenamentoDao;
import dao.PlacaMae.PlacaMaeDao;
import dao.Categoria.CategoriaDao;
import dao.Comp.CompDao;
import dao.Fonte.FonteDao;
import dao.MemoriaRam.MemoriaRamDao;
import dao.PlacaVideo.PlacaVideoDao;
import dao.Processador.ProcessadorDao;
import util.ConectaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;
import modelo.Componente;
import modelo.Fonte;
import modelo.Armazenamento;
import modelo.MemoriaRam;
import modelo.PlacaMae;
import modelo.PlacaVideo;
import modelo.Processador;
import modelo.Produto;

/**
 *
 * @author profe
 */
public class ProdutoDao implements IProdutodao {

    private static final String SELECT_ALL = "SELECT * FROM produto where descricao ilike ? ;";
    private static final String INSERT = "INSERT INTO produto(descricao,categoria) values(?,?);";
    private static final String BUSCAR = "SELECT * FROM produto WHERE id=?;";
    private static final String UPDATE = "UPDATE produto set descricao=? WHERE id=?";

    private Object pstmt;
    private Connection conexao;

    @Override
    public ArrayList<Produto> listar(Produto produto) {
        //cria uma array de obJ Produto
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            pstmt.setString(1, "%" + produto.getDescricao() + "%");
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Produto novoProduto = new Produto();
                novoProduto.setId(rs.getInt("id"));
                novoProduto.setDescricao(rs.getString("descricao"));
                
                //Precisamos buscar as categorias 
                Categoria objcate = new Categoria();
                objcate.setId(rs.getInt("id"));
                CategoriaDao catedao = new CategoriaDao();
                catedao.buscar(objcate);
                //Agregação
                novoProduto.setCategoria(objcate);
                
                PlacaMae objPlaca = new PlacaMae();
                objPlaca.setId(rs.getInt("id"));
                CompDao Daocomp = new CompDao();
                Daocomp.buscar(objPlaca);
                
                Processador objProcessador = new Processador();
                objProcessador.setId(rs.getInt("id"));
                Daocomp.buscar(objProcessador);
                
                MemoriaRam objRam = new MemoriaRam();
                objRam.setId(rs.getInt("id"));
                Daocomp.buscar(objRam);
                
                Armazenamento objArmazenamento = new Armazenamento();
                objArmazenamento.setId(rs.getInt("id"));
                Daocomp.buscar(objArmazenamento);
                
                PlacaVideo objVideo = new PlacaVideo();
                objVideo.setId(rs.getInt("id"));
                Daocomp.buscar(objVideo);
                
                Fonte objFonte = new Fonte();
                objFonte.setId(rs.getInt("id"));
                Daocomp.buscar(objFonte);           
                
                ArrayList<Componente> arrcomp = new ArrayList();
                arrcomp.add(0, objPlaca);
                arrcomp.add(1,objProcessador);
                arrcomp.add(2,objRam);
                arrcomp.add(3,objArmazenamento);
                arrcomp.add(4,objVideo);
                arrcomp.add(5,objFonte);
                
                novoProduto.setComponente(arrcomp);
//                
                listaProduto.add(novoProduto);
            }
            return listaProduto;

        } catch (Exception ex) {
            return listaProduto;
            
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

       @Override
    public void buscar(Produto produto) {

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);
            pstmt.setInt(1, produto.getId());
            
            ResultSet rs = pstmt.executeQuery();
            // como a query ira retornar somente um registro, faremos o NEXT
            rs.next();
            
            produto.setDescricao(rs.getString("descricao"));
            
            Categoria objcat= new Categoria();
            objcat.setId(rs.getInt("objcat"));
            //precisamos de uma dao que fara a busca dos dados junto ao banco de dados
            CategoriaDao catDao = new CategoriaDao();
            //desta forma teremos uma categoria para poder colocar no atributo caategoria do produto
            catDao.buscar(objcat);
            produto.setCategoria(objcat);
            
            
        } catch (Exception e) {

        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public boolean alterar(Produto produto) {
       
         try {
 
            conexao = ConectaBanco.getConexao();

            PreparedStatement pstmt = conexao.prepareStatement(UPDATE);

            pstmt.setString(1, produto.getDescricao());
            pstmt.setInt(2, produto.getId());
            
            pstmt.execute();
            return true;

        } catch (Exception ex) {

            return false;

        } finally {

             try {
                 conexao.close();
             } catch (SQLException ex) {
                 Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        
    }
    public boolean cadastrar(Produto produto, CompDao compDao) {

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, produto.getDescricao());
            pstmt.setInt(2, produto.getCategoria().getId());
            
            int ultimoid = pstmt.executeUpdate(); //assim vc pega o ultimo id
            //pegar o ultimo id gerado na tabela produto
            //depois chamar o metodo cadastrar componentes dentro de componente dao e passar o array de componentes
            compDao.cadastrar(produto.getComponente(),ultimoid);
            
            //aqui já vai estar cadastrado o produto e os componentes.
            return true;

        } catch (Exception ex) {
            return false;
        } finally {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    @Override
    public boolean excluir(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
