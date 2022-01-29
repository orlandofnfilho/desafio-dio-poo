package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso1 = new Curso();

		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Curso de Java do básico ao avançado");
		curso1.setCargaHoraria(80);

		Curso curso2 = new Curso();

		curso2.setTitulo("Curso de SpringBoot");
		curso2.setDescricao("Descrição do curso2");
		curso2.setCargaHoraria(40);

		Mentoria mentoria1 = new Mentoria();

		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Mentoria do curso de Java");
		mentoria1.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);

		Dev dev1 = new Dev();
		dev1.setNome("Aluno 1");
		dev1.increverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos:" + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos:" + dev1.getConteudosInscritos());
		System.out.println("Conteudos concluidos:" + dev1.getConteudosConcluidos());
		System.out.println("XP:" + dev1.calcularTotalXp());

		System.out.println("---------------------------------");

		Dev dev2 = new Dev();
		dev2.setNome("Aluno 2");
		dev2.increverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos:" + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos:" + dev2.getConteudosInscritos());
		System.out.println("Conteudos concluidos:" + dev2.getConteudosConcluidos());
		System.out.println("XP:" + dev2.calcularTotalXp());

	}

}
