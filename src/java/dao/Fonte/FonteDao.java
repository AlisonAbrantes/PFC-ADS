/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Fonte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Componente;
import modelo.Fonte;
import util.ConectaBanco;

/**
 *
 * @author vinicius
 */
public class FonteDao implements IFonteDao{
    
    private static final String SELECT_ALL = "SELECT * FROM componente where tipocomponente = ?;";
    private static final String BUSCAR = "SELECT descrição FROM componente WHERE id = ?;";

    private Object pstmt;
    private Connection conexao;

    public ArrayList<Fonte> listar(Fonte objfonte) {
        ArrayList<Fonte> listaFonte = new ArrayList<Fonte>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            pstmt.setString(1, objfonte.getDescricao());
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Fonte objFonte = new Fonte();
                objFonte.setId(rs.getInt("id"));
                objFonte.setDescricao(rs.getString("descricao"));
                
                listaFonte.add(objFonte);
            }
            return listaFonte;

        } catch (Exception ex) {
            return listaFonte;
            
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(FonteDao.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
    
        public void buscar(Componente objFonte) {
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);
            
            pstmt.setInt(1, objFonte.getId());
            
            ResultSet rs = pstmt.executeQuery();

            rs.next();
            objFonte.setDescricao(rs.getString("descricao"));
           
        } catch (Exception e) {

            //
        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(FonteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
        
}
