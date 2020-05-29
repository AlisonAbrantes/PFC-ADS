/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Avaliacao;

import java.util.ArrayList;
import modelo.Avaliacao;

/**
 *
 * @author vinicius
 */
public interface IAvaliacaoDao 
{
    public ArrayList<Avaliacao> listar(Avaliacao avaliacao);
    public void buscar(Avaliacao avaliacao);
    public boolean cadastrar(Avaliacao avaliacao);   
}
