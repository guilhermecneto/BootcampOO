/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.orientacaoobjetosjava;

import java.time.LocalDate;

/**
 *
 * @author ANONYMOUS
 */
public class Mentoria extends Conteudo{
    
    private String titulo;
    private String descricao;
    private LocalDate data;

     public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
           return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + '}';
    }
    
    public Mentoria(){}
}
