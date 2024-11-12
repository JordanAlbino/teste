package com.teste.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FilmeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String sinopse;
    private Integer duracao;
    private String genero;
    private Integer classificacao;

    public FilmeModel(Long id, String titulo, String sinopse, Integer duracao, String genero, Integer classificacao) {
        this.id = id;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.genero = genero;
        this.classificacao = classificacao;
    }

    public FilmeModel(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public Integer getDuracao() {
        return duracao;
    }
    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    

        
}
