/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vinicius
 */
public class Categoria 
{
    private int id;
    private String descricao;

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

    public Categoria() 
    {
        //
    }

    public Categoria(int id, String descricao) 
    {
        this.id = id;
        this.descricao = descricao;
    }
    
    
}
