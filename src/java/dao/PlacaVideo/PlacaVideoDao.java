/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.PlacaVideo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Componente;
import modelo.PlacaVideo;
import util.ConectaBanco;

/**
 *
 * @author vinicius
 */
public class PlacaVideoDao implements IPlacaVideoDao{
    
    private static final String SELECT_ALL = "SELECT * FROM componente where descricao ilike ? and tipo = 6;";
    private static final String BUSCAR = "SELECT descrição FROM componente WHERE id = ?;";

    private Object pstmt;
    private Connection conexao;

    public ArrayList<PlacaVideo> listar(PlacaVideo objvideo) {
        ArrayList<PlacaVideo> listaVideo = new ArrayList<PlacaVideo>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            pstmt.setString(1, "%" + objvideo.getDescricao() + "%");
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                PlacaVideo objVideo = new PlacaVideo();
                objVideo.setId(rs.getInt("id"));
                objVideo.setDescricao(rs.getString("descricao"));
                
                listaVideo.add(objVideo);
            }
            return listaVideo;

        } catch (Exception ex) {
            return listaVideo;
            
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(PlacaVideoDao.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
    
    public void buscar(Componente objVideo) {
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);
            
            pstmt.setInt(1, objVideo.getId());
            
            ResultSet rs = pstmt.executeQuery();

            rs.next();
            objVideo.setDescricao(rs.getString("descricao"));
           
        } catch (Exception e) {

            //
        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(PlacaVideoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
