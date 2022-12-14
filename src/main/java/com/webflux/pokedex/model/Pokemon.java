package com.webflux.pokedex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pokemon {
    @Id
    private String id;
    private String nome;
    private String habilidade;
    private String categoria;
    private Double peso;

    

    public Pokemon() {
        super();
    }

    public Pokemon(String id, String nome, String habilidade, String categoria, Double peso) {
        this.id = id;
        this.nome = nome;
        this.habilidade = habilidade;
        this.categoria = categoria;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;  
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pokemon [id=" + id + ", nome=" + nome + ", habilidade=" + habilidade + ", categoria=" + categoria
                + ", peso=" + peso + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((habilidade == null) ? 0 : habilidade.hashCode());
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + ((peso == null) ? 0 : peso.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pokemon other = (Pokemon) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (habilidade == null) {
            if (other.habilidade != null)
                return false;
        } else if (!habilidade.equals(other.habilidade))
            return false;
        if (categoria == null) {
            if (other.categoria != null)
                return false;
        } else if (!categoria.equals(other.categoria))
            return false;
        if (peso == null) {
            if (other.peso != null)
                return false;
        } else if (!peso.equals(other.peso))
            return false;
        return true;
    }






    






    

    

}
