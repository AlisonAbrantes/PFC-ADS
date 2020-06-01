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

    private static final String SELECT = "SELECT * FROM produto where descricao ilike?"; 
    private static final String SELECT_ALL = "SELECT * from produto inner join produto_componente on (produto.id = produto_componente.produto) where produto.id = ?";
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
            pstmt.setInt(1, produto.getId());
            
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
                
                PlacaMaeDao placaDao = new PlacaMaeDao();
                placaDao.buscar(objPlaca);
                
                Processador objProcessador = new Processador();
                objProcessador.setId(rs.getInt("id"));
                
                MemoriaRam objRam = new MemoriaRam();
                objRam.setId(rs.getInt("id"));
                
                Armazenamento objArmazenamento = new Armazenamento();
                objArmazenamento.setId(rs.getInt("id"));
                
                PlacaVideo objVideo = new PlacaVideo();
                objVideo.setId(rs.getInt("id"));
                
                Fonte objFonte = new Fonte();
                objFonte.setId(rs.getInt("id"));
                
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
            
            long key = -1;

            PreparedStatement pstmt = conexao.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, produto.getDescricao());
            pstmt.setInt(2, produto.getCategoria().getId());
            
            pstmt.executeUpdate(); //assim vc pega o ultimo id
            ResultSet rs = pstmt.getGeneratedKeys();
            //pegar o ultimo id gerado na tabela produto
            //depois chamar o metodo cadastrar componentes dentro de componente dao e passar o array de componentes
            if (rs.next()) {
                key = rs.getLong(1);
            }
            compDao.cadastrar(produto.getComponente(),key);
            
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
