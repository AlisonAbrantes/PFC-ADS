/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Categoria;

import java.util.ArrayList;
import modelo.Categoria;

/**
 *
 * @author profe
 */
public interface ICategoriaDao {
     public ArrayList<Categoria> listar(Categoria situacao);

    public void buscar(Categoria situacao);
 }
