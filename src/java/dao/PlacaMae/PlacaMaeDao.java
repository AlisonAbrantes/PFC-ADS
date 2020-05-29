/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import util.ConectaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alison
 */
public class PlacaMaeDao {
    
    private static final String SELECT_ALL = "SELECT * FROM produto where descricao ilike ?;";
    private static final String INSERT = "INSERT INTO produto(componetes) values(?);";
    private static final String BUSCAR = "SELECT * FROM produto WHERE id=?;";
    private static final String UPDATE = "UPDATE produto set descricao=? WHERE id=?";

    private Object pstmt;
    private Connection conexao;

    @Override
    public ArrayList<Produto> listar(Produto objcat) {
        //cria uma array de obJ Produto
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            pstmt.setString(1, "%" + objcat.getDescricao() + "%");
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Produto novoProduto = new Produto();
                novoProduto.setId(rs.getInt("id"));
                novoProduto.setDescricao(rs.getString("descricao"));
                
                //Precisamos buscar as categorias 
                Categoria objcate = new Categoria();
                objcate.setId(rs.getInt("objcate"));
                CategoriaDao catedao = new CategoriaDao();
                catedao.buscar(objcate);
                //Agregação
                novoProduto.setCategoria(objcate);
                
                
                
                
                
                
                //Agora produto esta completo de categoriapodemos adiciona-lo na Lista
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
            
            Componente objPlaca = new PlacaMae();
            Componente objProcesador = new Processador();
            Componente objRam = new MemoriaRam();
            Componente objMemoria = new HD();
            Componente objVideo = new PlacaVideo();
            Componente objFonte = new Fonte();
            
            objPlaca.setId(rs.getInt("placamae"));
            objProcesador.setId(rs.getInt("processador"));
            objRam.setId(rs.getInt("memoriaram"));
            objMemoria.setId(rs.getInt("memoria"));
            objVideo.setId(rs.getInt("placaVideo"));
            objFonte.setId(rs.getInt("fonte"));
            
            PlacaMaeDao maeDao = new PlacaMaeDao();
           
            maeDao.buscar(objPlaca);
            produto.setComponente(objComp);
            
        } catch (Exception e) {

        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


