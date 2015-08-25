package br.com.projectpfc.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//Table(name = "tb_solicitacao")
public class Solicitacao extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5093632199145266172L;

	@ManyToOne
	@JoinColumn(name = "id")
	private Servico servico;

	@ManyToOne
	@JoinColumn(name = "id")
	private PrestadorServico prestadorServico;

	public Solicitacao() {
	}

	// getters and setters

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public PrestadorServico getPrestadorServico() {
		return prestadorServico;
	}

	public void setPrestadorServico(PrestadorServico prestadorServico) {
		this.prestadorServico = prestadorServico;
	}

}
