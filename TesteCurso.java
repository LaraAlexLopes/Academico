package instituicao;
public class TesteCurso {
	public static void main(String[] args) throws ListaVaziaException {
		Curso curso1 = new CursoTecnico("Ricardo", "Bsi","Curso Tecnico","CT","Integrado");
		Curso curso2 = new CursoTecnico("Marcelo", "Mecatronica","Curso Tecnico","CT","Comcomitancia");
		Curso curso3 = new CursoSuperior("Silvana", "Medicina","Curso Superior","CS","Por Cota");
		Curso curso4 = new CursoSuperior("Reinaldo", "Matemática","Curso Superior","CS","Ampla Concorrencia");
		
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		System.out.println(curso3.toString());
		System.out.println(curso4.toString());
		
		ListaGenerica<CursoTecnico> listaDeCursoTecnico = new ListaGenerica<>();
		ListaGenerica<CursoSuperior> listaDeCursoSuperior = new ListaGenerica<>();
		
		listaDeCursoTecnico.adicionar(new CursoTecnico("Ricardo", "Bsi","Curso Tecnico","CT","Integrado"));
		listaDeCursoTecnico.adicionar(new CursoTecnico("Marcelo", "Mecatronica","Curso Tecnico","CT","Comcomitancia"));
		listaDeCursoSuperior.adicionar(new CursoSuperior("Silvana", "Medicina","Curso Superior","CS","Por Cota"));
		listaDeCursoSuperior.adicionar(new CursoSuperior("Reinaldo", "Matemática","Curso Superior","CS","Ampla Concorrencia"));
		System.out.println("\n");
		
		System.out.println("LISTA DE CURSOS TÉCNICOS:" + listaDeCursoTecnico.listar());
		System.out.println("LISTA DE CURSOS SUPERIOR:" + listaDeCursoSuperior.listar());
		
		System.out.println(IdentificadorDeCurso.identificarCurso(curso1));
		System.out.println(IdentificadorDeCurso.identificarCurso(curso2));
		System.out.println(IdentificadorDeCurso.identificarCurso(curso3));
		System.out.println(IdentificadorDeCurso.identificarCurso(curso4));
	}
}
