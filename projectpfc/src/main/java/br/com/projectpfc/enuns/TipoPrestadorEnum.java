package br.com.projectpfc.enuns;

public enum TipoPrestadorEnum {

	DIARISTA(1, "Diarista"),
	ENCANADOR(2, "Encanador");

	private Integer codigo;
	private String descricao;

	TipoPrestadorEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static String obterDescricaoTipoPrestadorPorCodigo(Integer codigo) {
		String descricaoTipoSugestao = "";
		if (codigo != null) {
			for (TipoPrestadorEnum tipoPrestador : TipoPrestadorEnum.values()) {
				if (tipoPrestador.getCodigo().equals(codigo)) {
					descricaoTipoSugestao = tipoPrestador.getDescricao(); 
				}
			}
		}
		return descricaoTipoSugestao;
	}
	
	public static Integer obterCodigoTipoPrestadorPorDescricao(String descricao) {
		Integer codigo = null;
		if (descricao != null) {
			for (TipoPrestadorEnum tipoPrestador : TipoPrestadorEnum.values()) {
				if (tipoPrestador.getDescricao().equals(descricao)) {
					codigo = tipoPrestador.getCodigo();
				}
			}
		}
		return codigo;
	}
	
	// getters and setters

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
