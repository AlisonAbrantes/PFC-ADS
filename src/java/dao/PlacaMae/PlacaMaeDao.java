package dao.PlacaMae;
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
import modelo.Componente;
import modelo.PlacaMae;
import modelo.TipoComponente;
/**
 *
 * @author Alison
 */
public class PlacaMaeDao implements IPlacaMae{
    
    private static final String SELECT_ALL = "SELECT * FROM componente where descricao ilike ? and tipo = 1;";
    private static final String BUSCAR = "SELECT descricao FROM componente WHERE id = ?;";

    private Object pstmt;
    private Connection conexao;

    public ArrayList<PlacaMae> listar(PlacaMae objPlaca) {
        ArrayList<PlacaMae> listaPlacaMae = new ArrayList<PlacaMae>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            
            pstmt.setString(1, "%" + objPlaca.getDescricao() + "%");
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                PlacaMae objplaca = new PlacaMae();
                objplaca.setId(rs.getInt("id"));
                objplaca.setDescricao(rs.getString("descricao"));
                
                //Retorna uma lista de Placas Mae
                listaPlacaMae.add(objplaca);
            }
            return listaPlacaMae;

        } catch (Exception ex) {
            return listaPlacaMae;
            
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(PlacaMaeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    public void buscar(Componente objPlaca) {
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);
            
            pstmt.setInt(1, objPlaca.getId());
            
            ResultSet rs = pstmt.executeQuery();

            rs.next();
            objPlaca.setDescricao(rs.getString("descricao"));
           
        } catch (Exception e) {

            //
        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(PlacaMaeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}


