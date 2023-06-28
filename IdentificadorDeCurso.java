package instituicao;

public abstract class IdentificadorDeCurso {
	public  static String identificarCurso(Curso curso){	
		return curso.informacaoGeral();		
	}	
}
