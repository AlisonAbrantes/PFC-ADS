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

public class Componente
{
    private int id;
    private Peso peso;
    private String descricao;
    private TipoComponente tipocomponente;

    public TipoComponente getTipocomponente() {
        return tipocomponente;
    }

    public void setTipocomponente(TipoComponente tipocomponente) {
        this.tipocomponente = tipocomponente;
    }
    
    public int getId() 
    {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(int id) 
    {
        this.id = id;
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

    public Componente(int id, String descricao, Peso peso) 
    {
        this.id=id;
        this.descricao=descricao;
        this.peso = peso;
    }
    

    
}
