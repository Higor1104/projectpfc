package br.com.projectpfc.model;

import java.time.LocalDate;

public class Usuario extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6604777830024495937L;

	private String nome;

	private String sobrenome;

	private Character sexo;

	private LocalDate dtNascimento;

	public Usuario() {
	}

	// getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

}
