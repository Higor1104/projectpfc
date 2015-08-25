package br.com.projectpfc.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name = "tb_servico")
public class Servico extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6932679637675203306L;

	@ManyToOne
	@JoinColumn(name = "id")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "id", nullable = true)
	private PrestadorServico prestadorServico;

	public Servico() {
	}

	// getters and setters

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PrestadorServico getPrestadorServico() {
		return prestadorServico;
	}

	public void setPrestadorServico(PrestadorServico prestadorServico) {
		this.prestadorServico = prestadorServico;
	}

}
