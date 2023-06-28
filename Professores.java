package instituicao;
public class Professores extends Pessoa{
	private ListaGenerica<Alunos> listaDeAlunos ;
	public Professores(String nome, String email,boolean sexo){
		super(nome,email,sexo);
	}
	public void adicionarAluno(ListaGenerica<Alunos> lista) {
		listaDeAlunos = new ListaGenerica<Alunos>();
		listaDeAlunos = lista;
	}
	public void orientadoresAluno(ListaGenerica<Alunos> listaDeAlunos) throws ListaVaziaException{
		System.out.println("\n" + toString() + listaDeAlunos.listar());
	}
	@Override
	public String toString() {
			return  tratamento() + nome + "\n" + "(" + email + ")";
	}
	public String tratamento() {
		if(getSexo() == true) {
			return "\n" +"Professora ";
		}else {
			return "\n"	+ "Professor ";
		}
	}
	public String informacaoCompleta() throws ListaVaziaException {
		if(getSexo() == true) {
			return "\n" + tratamento() + nome + "\n"  + "(" + email + ")" + "\n" + "LISTA DE ALUNOS DO PROFESSOR:" + "\n" + listaDeAlunos.listar();
		}else {
			return "\n" + tratamento() + nome + "\n" + "(" + email + ")" + "\n" + "LISTA DE ALUNOS DO PROFESSOR:" + "\n" + listaDeAlunos.listar();
		}
	}
}
