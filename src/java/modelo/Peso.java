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

public class Peso 
{
    private int id;
    protected int valor;

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getValor() 
    {
        return valor;
    }

    public void setValor(int valor) 
    {
        this.valor = valor;
    }

    public Peso() 
    {
        //
    }

    public Peso(int id, int valor) 
    {
        this.id = id;
        this.valor = valor;
    }
    
    
}
