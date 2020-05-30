package dao.componente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import modelo.Componente;

/**
 *
 * @author Alison
 */
public class ComponenteDao implements IComponenteDao{
    private static final String INSERT = "INSERT INTO produto_componente(produto,componente) values(?,?);";
    private Connection conexao;
    
    public boolean cadastrar(ArrayList<Componente> arrcomp,int idproduto){
       // Para que possamos cadastrar os componentes do Produto, será necessario o id do produto cadastro
       // Dentro do for será enviado o array de componentes que montamos anteriormente.
        try{
          PreparedStatement pstmt = conexao.prepareStatement(INSERT);
          for (Componente obj: arrcomp){
            
              pstmt.setInt(1, obj.getId());
              pstmt.setInt(2, idproduto);
              
              pstmt.execute();
        }
         return true;
        }catch(Exception e){
            
             return false;
        }
    }
}
