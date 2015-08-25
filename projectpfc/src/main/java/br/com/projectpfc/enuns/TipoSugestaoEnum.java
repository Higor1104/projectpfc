package br.com.projectpfc.enuns;

public enum TipoSugestaoEnum {

	SUGESTAO(1, "Sugest�o");

	private Integer codigo;
	private String descricao;

	TipoSugestaoEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static String obterDescricaoTipoSugestaoPorCodigo(Integer codigo) {
		String descricaoTipoSugestao = "";
		if (codigo != null) {
			for (TipoSugestaoEnum tipoSugestao : TipoSugestaoEnum.values()) {
				if (tipoSugestao.getCodigo().equals(codigo)) {
					descricaoTipoSugestao = tipoSugestao.getDescricao(); 
				}
			}
		}
		return descricaoTipoSugestao;
	}
	
	public static Integer obterCodigoTipoSugestaoPorDescricao(String descricao) {
		Integer codigo = null;
		if (descricao != null) {
			for (TipoSugestaoEnum tipoSugestao : TipoSugestaoEnum.values()) {
				if (tipoSugestao.getDescricao().equals(descricao)) {
					codigo = tipoSugestao.getCodigo();
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
