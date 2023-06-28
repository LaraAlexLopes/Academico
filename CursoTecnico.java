package instituicao;

public class CursoTecnico extends Curso {
	private  String modalidade;
	
	public CursoTecnico(String coordenador, String descricao,String nivel,String identificacao,String modalidade){
		super(coordenador,descricao,nivel,identificacao);
		this.modalidade = modalidade;
	}
	public  String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	@Override
	public String informacaoGeral() {
		return "\n" + "IDENTIFICAÇÃO DO CURSO:"+ "\n" + "Identificação: "+ this.identificacao + "\n" +"Coordenador: " + this.coordenador + "\n" +"Descrição: " + descricao + "\n"
				+ "Nivel: " + this.nivel +  "\n" + 
				"Modalidade: " + this.modalidade  + "\n" ;
	}
	
	@Override
	public String toString() {
		return "\n" + "Coordenador: " + this.coordenador + "\n" +"Descrição: " + descricao + "\n"
		+ "Nivel: " + this.nivel + "\n" + "Identificação: "+ this.identificacao + "\n" + 
		"Modalidade: " + this.modalidade + "\n" ;
	}
}
