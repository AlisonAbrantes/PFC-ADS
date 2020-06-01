package dao.Comp;

import dao.Categoria.CategoriaDao;
import dao.Processador.ProcessadorDao;
import dao.Produto.ProdutoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Armazenamento;
import modelo.Categoria;
import modelo.Componente;
import modelo.Fonte;
import modelo.MemoriaRam;
import modelo.PlacaMae;
import modelo.PlacaVideo;
import modelo.Processador;
import modelo.Produto;
import util.ConectaBanco;
/**
 *
 * @author Alison
 */
public class CompDao implements ICompDao{
    private static final String INSERT = "INSERT INTO produto_componente (produto,componente) values(?,?);";
    private static final String LISTARCOMPONENTE =" SELECT componente FROM produto_componente where produto = ? ";
    private Connection conexao;
    
    public boolean cadastrar(ArrayList<Componente> arrcomp,long key){
       // Para que possamos cadastrar os componentes do Produto, será necessario o id do produto cadastro
       // Dentro do for será enviado o array de componentes que montamos anteriormente.
        try{
          conexao = ConectaBanco.getConexao();
          PreparedStatement pstmt = conexao.prepareStatement(INSERT);
          
          for (Componente obj: arrcomp){
            
              pstmt.setLong(1, key);
              pstmt.setInt(2, obj.getId());
              
              pstmt.execute();
        }
         return true;
        }catch(Exception e){
            
             return false;
        }
    }
    
    public void buscar(Componente obj ) {
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(LISTARCOMPONENTE);
            
              pstmt.setInt(1, obj.getId());
              
              pstmt.execute();
           
        } catch (Exception e) {

            //
        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProcessadorDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
