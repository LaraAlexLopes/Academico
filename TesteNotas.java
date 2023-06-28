package instituicao;
public class TesteNotas {
	public static void main(String[] args) throws NotasException, ListaVaziaException {
		ListaGenerica<Notas> listaDeNotas = new ListaGenerica<>();
		try {
			Notas nota1 = new Notas(2,3);
			Notas nota2 = new Notas(2,2);
			Notas nota3 = new Notas(2,1);
			Notas nota4 = new Notas(2,0);
			
			listaDeNotas.adicionar(nota1);
			listaDeNotas.adicionar(nota2);
			listaDeNotas.adicionar(nota3);
			listaDeNotas.adicionar(nota4);	
		}
		catch(NotasException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(listaDeNotas.listar());	
		}
	}
}
