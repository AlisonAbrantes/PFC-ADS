/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class Produto 
{
    private int id; 
    private String descricao;
    private ArrayList<Componente> componente;
    private ArrayList<Categoria> categoria;

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public ArrayList<Componente> getComponente() 
    {
        return componente;
    }

    public void setComponente(ArrayList<Componente> componente) 
    {
        this.componente = componente;
    }

    public ArrayList<Categoria> getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(ArrayList<Categoria> categoria) 
    {
        this.categoria = categoria;
    }

    public Produto() 
    {
        //
    }

    public Produto(int id, String descricao, ArrayList<Componente> componente, ArrayList<Categoria> categoria) 
    {
        this.id = id;
        this.descricao = descricao;
        this.componente = componente;
        this.categoria = categoria;
    }
    
    
    
    
}
