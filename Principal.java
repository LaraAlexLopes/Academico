package instituicao;
public class Principal {
	public static void main(String[] args) throws NotasException  {
		CursoTecnico curso1 = new CursoTecnico("Ricardo","Bsi","Curso Tecnico","CT","Integrado"); 
		CursoSuperior curso2 = new CursoSuperior("Marcelo","Mecatronica","Curso Superior","CS","Por Cota");
		
		Professores prof1 = new Professores("Pedro", "pedro@gmail.com",false);
		Professores prof2 = new Professores("Wanessa", "wanessa@gmail.com",true);
		
		Alunos aluno1 = new Alunos("Lara Alexandra Lopes Alves",null,"laraalexandra@gmail.com",4,curso1,true,prof1);		
		Alunos aluno2 = new Alunos("Juan de Lima",null,"juandelima@gmail.com",4,curso2,false,prof2);
		Alunos aluno3 = new Alunos("Helena Pereira Rodrigues", null, "helenapereirarodrigues@gmail.com",2, null,true,prof2);
		
		ListaGenerica<Notas> listaDeNotas1 = new ListaGenerica<>();
		ListaGenerica<Notas> listaDeNotas2 = new ListaGenerica<>();
		ListaGenerica<Alunos> listaDeAlunos = new ListaGenerica<>();
		try {
			Notas nota1 = new Notas(2,3);
			Notas nota2 = new Notas(2,2);
			Notas nota3 = new Notas(2,1);
			Notas nota4 = new Notas(2,0);
			
			listaDeNotas1.adicionar(nota1);
			listaDeNotas1.adicionar(nota2);
			listaDeNotas1.adicionar(nota3);
			listaDeNotas1.adicionar(nota4);
			listaDeNotas2.adicionar(nota1);
			listaDeNotas2.adicionar(nota2);
			listaDeNotas2.adicionar(nota3);
			listaDeNotas2.adicionar(nota4);
			
			listaDeAlunos.adicionar(aluno1);
			listaDeAlunos.adicionar(aluno2);
			listaDeAlunos.adicionar(aluno3);
			
			aluno1.adicionarNotas(listaDeNotas1);
			aluno2.adicionarNotas(listaDeNotas2);
			
			System.out.println("LISTA: " );
			aluno2.relatorioCrescente();
			System.out.println("LISTA: ");
			aluno1.relatorioCrescente();
			System.out.println("MÉDIA: " + aluno1.media());
			System.out.println("MÉDIA: " + aluno2.media());
			
			System.out.println("LISTA DE ALUNOS" + listaDeAlunos.listar());
		}
		catch(NotasException e){
			System.out.println(e.getMessage());
		}
		catch(ListaVaziaException e){
			System.out.println(e.getMessage());
		}
		catch(QuantidadeException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(aluno1.toString());
			System.out.println("\n");
			System.out.println(aluno2.toString());
			
			System.out.println("\n");
			System.out.println("QUANTIDADE DE ALUNO ADICIONADO:" + Alunos.contador()); 
			
			Professores prof = new Professores("Diego da Silva Godói","diegogodoi@gmail.com",true);
			System.out.println(prof.toString());
		}
		aluno1.orientadoresAluno(listaDeAlunos);
		aluno2.orientadoresAluno(listaDeAlunos);
	}
}
