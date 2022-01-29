package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private LocalDate dataInical = LocalDate.now();
	private LocalDate dataFinal = dataInical.plusDays(45);
	private Set<Dev> devIncritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInical() {
		return dataInical;
	}

	public void setDataInical(LocalDate dataInical) {
		this.dataInical = dataInical;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Set<Dev> getDevIncritos() {
		return devIncritos;
	}

	public void setDevIncritos(Set<Dev> devIncritos) {
		this.devIncritos = devIncritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInical, descricao, devIncritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInical, other.dataInical) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devIncritos, other.devIncritos) && Objects.equals(nome, other.nome);
	}

}
