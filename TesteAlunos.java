package instituicao;
public class TesteAlunos {
	public static void main(String[] args) throws QuantidadeException {
		ListaGenerica<Alunos> listaDeAlunos = new ListaGenerica<>();
		ListaGenerica<Notas> notasLara = new ListaGenerica<>();
		ListaGenerica<Notas> notasHelena = new ListaGenerica<>();
		
		Professores prof1 = new Professores("Wanessa", "wanessa@gmail.com",true);
		Professores prof2 = new Professores("Joao Pedro", "joaopedro@gmail.com",false);
		
		Alunos aluno1 = new Alunos("Lara Alexandra Lopes Alves", null, "laraalexandralopes919@gmail.com",4, null,true,prof1);
		Alunos aluno2 = new Alunos("Helena Pereira Rodrigues", null, "helenapereirarodrigues@gmail.com",2, null,true,prof2);
		
		listaDeAlunos.adicionar(aluno1);
		listaDeAlunos.adicionar(aluno2);
		try {
			Notas nota1 = new Notas(2,3);
			Notas nota2 = new Notas(2,2);
			Notas nota3 = new Notas(2,1);
			Notas nota4 = new Notas(2,0);
			
			notasLara.adicionar(nota1);
			notasLara.adicionar(nota2);
			notasLara.adicionar(nota3);
			notasLara.adicionar(nota4);
			notasHelena.adicionar(nota1);
			notasHelena.adicionar(nota2);	
			
			aluno1.adicionarNotas(notasLara);
			aluno2.adicionarNotas(notasHelena);
						
			System.out.println("ALUNO 4 INFORMAÇÕES COMPLETASS:" + "\n" + aluno1.situacaoAluno());
			System.out.println("MÉDIA: " + aluno1.media());
			System.out.println("ALUNO 4 INFORMAÇÕES COMPLETASS:" + "\n" + aluno2.situacaoAluno());
			System.out.println("MÉDIA: " + aluno2.media());
			
			System.out.println("RELATÓRIO ORDEM CRESCENTE: ");
			aluno1.relatorioCrescente();
			System.out.println("RELATÓRIO ORDEM DECRESCENTE: ");
			aluno2.relatorioDecrescente();		
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
			System.out.println("\n");
			System.out.println(aluno1.toString());
			System.out.println("\n");
			System.out.println("\n");
			System.out.println(aluno2.toString());
			System.out.println("\n");	
		}
	}
}
