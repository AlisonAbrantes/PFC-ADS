/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.MemoriaRam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Componente;
import modelo.MemoriaRam;
import util.ConectaBanco;

/**
 *
 * @author vinicius
 */
public class MemoriaRamDao {
        
    private static final String SELECT_ALL = "SELECT * FROM componente where descricao ilike ? and tipo = 3;";
    private static final String BUSCAR = "SELECT descricao FROM componente WHERE id = ?;";

    private Object pstmt;
    private Connection conexao;

    public ArrayList<MemoriaRam> listar(MemoriaRam objmemoria) {
        ArrayList<MemoriaRam> listaMemoria = new ArrayList<MemoriaRam>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            pstmt.setString(1, "%" + objmemoria.getDescricao() + "%");
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                MemoriaRam objMemoria = new MemoriaRam();
                objMemoria.setId(rs.getInt("id"));
                objMemoria.setDescricao(rs.getString("descricao"));
                
                listaMemoria.add(objMemoria);
            }
            return listaMemoria;

        } catch (Exception ex) {
            return listaMemoria;
            
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(MemoriaRamDao.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
        
    public void buscar(Componente objMemoria) {
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);
            
            pstmt.setInt(1, objMemoria.getId());
            
            ResultSet rs = pstmt.executeQuery();

            rs.next();
            objMemoria.setDescricao(rs.getString("descricao"));
           
        } catch (Exception e) {

            //
        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(MemoriaRamDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
