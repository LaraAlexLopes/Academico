package instituicao;

public class CursoSuperior extends Curso {
	private String ingresso;
	
	public CursoSuperior(String coordenador,String descricao,String nivel,String identificacao,String ingresso) {
		super(coordenador,descricao,nivel,identificacao);
		this.ingresso = ingresso;
	}

	public String getIngresso() {
		return ingresso;
	}

	public void setIngresso(String ingresso) {
		this.ingresso = ingresso;
	}
	
	@Override
	public String informacaoGeral() {
		return "\n" + "IDENTIFICAÇÃO DO CURSO:"+ "\n" + "Identificação: "+ this.identificacao + "\n"  + "Coordenador: " + this.coordenador + "\n" +"Descrição: " + descricao + "\n"
				+ "Nivel: " + this.nivel  + "\n" + 
				"Ingresso: " + this.ingresso;
	}
	
	@Override
	public String toString() {
		return "\n" + "Coordenador: " + this.coordenador + "\n" +"Descrição: " + descricao + "\n"
		+ "Nivel: " + this.nivel + "\n" + "Identificação: "+ this.identificacao + "\n" + 
		"Ingresso: " + this.ingresso + "\n";
	}	
}
