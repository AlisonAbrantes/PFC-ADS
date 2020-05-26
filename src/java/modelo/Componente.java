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

public class Componente extends Peso
{
    private int idcomponente;
    private Peso peso;

    @Override
    public int getId() 
    {
        return idcomponente;
    }

    @Override
    public void setId(int id) 
    {
        this.idcomponente = id;
    }

    public Peso getPeso() 
    {
        return peso;
    }

    public void setPeso(Peso peso) 
    {
        this.peso = peso;
    }

    public Componente() 
    {
        //
    }

    public Componente(int idcomponente, Peso peso, int id, int valor) 
    {
        super(id, valor);
        this.idcomponente = idcomponente;
        this.peso = peso;
    }
    

    
}
