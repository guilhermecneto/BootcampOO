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
public class NewClass {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria = new Mentoria();
        Curso curso2 = new Curso();
        
        curso1.setTitulo("ti");
        curso1.setDescricao("Programação");
        curso1.setCargaHoraria(200);
        
        curso2.setTitulo("ti");
        curso2.setDescricao("Programação");
        curso2.setCargaHoraria(200);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Treinamento Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev dev1 = new Dev();
        dev1.setNome("Guilherme");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + dev1.getConteudoConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("-");

        Dev dev2 = new Dev();
        dev2.setNome("Teddy");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + dev2.getConteudoConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
    
}
