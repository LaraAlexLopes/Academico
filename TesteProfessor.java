package instituicao;
public class TesteProfessor {
	public static void main(String[] args) throws ListaVaziaException {
		Professores prof1 = new Professores("Wanessa", "wanessa@gmail.com",true);
		Professores prof2 = new Professores("Pedro", "pedro@gmail.com",false);
		System.out.println(prof1.toString());
		System.out.println(prof2.toString());
		
		Alunos aluno1 = new Alunos("Lara Alexandra Lopes Alves", null, "laraalexandralopes919@gmail.com",1, null,true,prof2);
		Alunos aluno2 = new Alunos("Helena Pereira Rodrigues", null, "helenapereirarodrigues@gmail.com",2, null,true,prof2);
		Alunos aluno3 = new Alunos("Juan de Lima Costa e Silva", null, "juandelima@gmail.com",3, null,false,prof1);
		Alunos aluno4 = new Alunos("Diego Godói da Silva", null, "diegogodoi@gmail.com",2, null,false,prof1);
				
		ListaGenerica<Alunos> listaDeAlunas = new ListaGenerica<>();
		listaDeAlunas.adicionar(aluno1);
		listaDeAlunas.adicionar(aluno2);
		System.out.println("LISTA DE ALUNAS:" + listaDeAlunas.listar());
		System.out.println("\n");
		
		ListaGenerica<Alunos> listaDeAlunos = new ListaGenerica<>();
		listaDeAlunos.adicionar(aluno3);
		listaDeAlunos.adicionar(aluno4);
		System.out.println("LISTA DE ALUNAS:" + listaDeAlunas.listar());
		System.out.println("\n");
			
		prof1.adicionarAluno(listaDeAlunas);
		prof2.adicionarAluno(listaDeAlunos);
		System.out.println("\n");
		
		System.out.println("INFORMÇÃO COMPLETA:" + prof1.informacaoCompleta());
		System.out.println("\n");
		System.out.println("INFORMÇÃO COMPLETA:" + prof2.informacaoCompleta());
		System.out.println("\n");
		
		listaDeAlunas.remover(aluno1);
		listaDeAlunos.remover(aluno4);
		
		System.out.println("INFORMÇÃO COMPLETA ATUALIZADA:" + prof1.informacaoCompleta());
		System.out.println("INFORMÇÃO COMPLETA ATUALIZADA:" + prof2.informacaoCompleta());		
	}
}
