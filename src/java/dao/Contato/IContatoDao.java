/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Contato;

import java.util.ArrayList;
import modelo.Contato;

/**
 *
 * @author vinicius
 */
public interface IContatoDao {
    
    public ArrayList<Contato> listar(Contato contato);
    public void buscar(Contato contato);
    public boolean cadastrar(Contato contato);
}
