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
import modelo.Peso;
import modelo.PlacaMae;
import modelo.PlacaVideo;
import modelo.Processador;
import modelo.Produto;
import modelo.TipoComponente;
import util.ConectaBanco;
/**
 *
 * @author Alison
 */
public class CompDao implements ICompDao{
    private static final String INSERT = "INSERT INTO produto_componente (produto,componente) values(?,?);";
    private static final String LISTARCOMPONENTE =" SELECT * FROM produto_componente where produto = ? ";
     private static final String SELECT =" SELECT * FROM componente where id = ? ";
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
    
        public void buscar(Componente obj) {
        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT);

            pstmt.setInt(1, obj.getId());
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            obj.setDescricao(rs.getString("descricao"));
            
            Peso objPeso = new Peso();
            objPeso.setId(rs.getInt("peso"));
            
            obj.setPeso(objPeso);

            TipoComponente objtipocomp = new TipoComponente();
            objtipocomp.setId(rs.getInt("tipo"));

 //UPDATE FUTURO           
//            if (objtipocomp.getId() == 1) {//fonte
//                
//            }
//            
//            TipoComponenteDao objtipocompdao = new TipoComponenteDao();
//            objtipocompdao.buscar(objtipocomp);

              obj.setTipocomponente(objtipocomp);
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
    
     public ArrayList<Componente> ListarComponentes(Produto produto) {
                  ArrayList<Componente> arrcomp = new ArrayList<Componente>();
        
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(LISTARCOMPONENTE);
            
                pstmt.setInt(1, produto.getId());
                ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Componente objcomp = new Componente();
                objcomp.setId(rs.getInt("componente"));
                buscar(objcomp);
                arrcomp.add(objcomp);
            }
            
        }catch (Exception e) {

            //
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProcessadorDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            return arrcomp;
    }
}
