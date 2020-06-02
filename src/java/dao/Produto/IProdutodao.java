/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Produto;


import dao.Comp.CompDao;
import java.util.ArrayList;
import modelo.Produto;

/**
 *
 * @author Alison
 */
public interface IProdutodao {

    public ArrayList<Produto> Listar(Produto produto);
    
    public void BuscarCompleto(Produto produto);
    
     public void buscar(Produto produto);
    
    public boolean alterar(Produto produto);
    
    public boolean cadastrar(Produto produto, CompDao compDao);

}
