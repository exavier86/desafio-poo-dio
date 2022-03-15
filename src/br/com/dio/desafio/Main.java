package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEriton = new Dev();
        devEriton.setNome("Eriton");
        devEriton.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Eriton:" + devEriton.getConteudosInscritos());
        devEriton.progredir();
        devEriton.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Eriton:" + devEriton.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Eriton:" + devEriton.getConteudosConcluidos());
        System.out.println("XP:" + devEriton.calcularTotalXp());

        System.out.println("-------");

        Dev devMalu = new Dev();
        devMalu.setNome("Malu");
        devMalu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Malu:" + devMalu.getConteudosInscritos());
        devMalu.progredir();
        devMalu.progredir();
        devMalu.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Malu:" + devMalu.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Malu:" + devMalu.getConteudosConcluidos());
        System.out.println("XP:" + devMalu.calcularTotalXp());

	}
}
