package instituicao;

public abstract class Curso {
	protected String coordenador;
	protected String descricao;
	protected String nivel;
	protected String identificacao;
	
	public Curso(String coordenador, String descricao,String nivel,String identificacao) {
		this.coordenador = coordenador;
		this.descricao = descricao;
		this.nivel = nivel;
		this.identificacao = identificacao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public  String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	
	public abstract String informacaoGeral();
	
	@Override
	public String toString() {
		return "Coordenador: " + this.coordenador + "\n" +"Descrição: " + descricao + "\n"
		+ "Nivel: " + this.nivel + "\n" + "Identificação: "+ this.identificacao ;
	}
	
}
