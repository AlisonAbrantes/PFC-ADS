/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;
import util.ConectaBanco;
/**
 *
 * @author profe
 */
public class CategoriaDao implements ICategoriaDao {

    private static final String SELECT_ALL = "SELECT * FROM categoria  where descricao ilike ?;";
    private static final String BUSCAR = "SELECT * FROM categoria WHERE id=?;";

    private Object pstmt;
    private Connection conexao = null;
        

    @Override
    public ArrayList<Categoria> listar(Categoria categoria) {

        //cria uma array de obJ Categoria
        ArrayList<Categoria> listaCategoria = new ArrayList<>();
        try {
            conexao=ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            
            pstmt.setString(1, "%" + categoria.getDescricao() + "%");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Categoria novoCategoria = new Categoria();
                novoCategoria.setId(rs.getInt("id"));
                novoCategoria.setDescricao(rs.getString("descricao"));

                //add na lista
                listaCategoria.add(novoCategoria);
            }
            return listaCategoria;

        } catch (Exception ex) {
            
            return listaCategoria;

        } finally {
                       
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    @Override
    public void buscar(Categoria categoria) {

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);
            pstmt.setInt(1, categoria.getId());
           
            ResultSet rs = pstmt.executeQuery();

            rs.next();
            categoria.setDescricao(rs.getString("descricao"));

        } catch (Exception e) {

        } finally {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

}
