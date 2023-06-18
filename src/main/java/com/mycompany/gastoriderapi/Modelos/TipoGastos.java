
package com.mycompany.gastoriderapi.Modelos;


public class TipoGastos {
    
    private int id;
    private String tipoGasto;
    private String descricao;
    
    // Construtor vazio
    public TipoGastos() {
    }
    
    // Construtor com todos os campos
    public TipoGastos(int id, String tipoGasto, String descricao) {
        this.id = id;
        this.tipoGasto = tipoGasto;
        this.descricao = descricao;
    }
    
    public TipoGastos(String tipoGasto, String descricao) {
        this.tipoGasto = tipoGasto;
        this.descricao = descricao;
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTipoGasto() {
        return tipoGasto;
    }
    
    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    // Método toString()
    @Override
    public String toString() {
        return "TipoGastos{" +
                "id=" + id +
                ", tipoGasto='" + tipoGasto + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

    

