package instituicao;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
public class Alunos extends Pessoa{
	private String matricula;
	private Curso curso;
	private Professores professor;
	private int quantidade;
	private ListaGenerica<Notas> notas;
	private  int contadorNota = 0;
	private static int contadorNovoAno = 0;
	private static  int contadorAluno;
	public Alunos(String nome,String matricula,String email,int quantidade,Curso curso,Boolean sexo,Professores professor){
		super(nome,email,sexo);
		this.quantidade = quantidade;
		this.matricula = getMatricula();
		this.curso = curso;
		this.professor = professor;
	} 
	public void adicionarNotas(ListaGenerica<Notas> listaDeNotas) throws QuantidadeException{
			if(listaDeNotas.size()>getQuantidade()) {
				throw new QuantidadeException("Quantidade de notas maior que a quantidade desejada");
			}
			if(listaDeNotas.size()<getQuantidade()) {
				throw new QuantidadeException("Quantidade de notas menor que a quantidade desejada");
			}
			contadorNota(listaDeNotas.size());
			notas = listaDeNotas;	
	}
	public Double media() {
		try {
			double somaNotas = 0;
			double somaPesos = 0;
			double div;
			for (Notas total : notas) {
				somaNotas += total.getNota() * total.getPeso();	
				somaPesos += total.getPeso();
			}
			div = somaNotas/somaPesos;
			return div;
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		return 0.0;
	}
	public String aprovacao() {
			if(contadorNota == 0){
				return "ALUNO SEM AVALIACAO";
			}else {
			if(media()>=6) {
				return "APROVADO!";
				}
				else {
				return "REPROVADO!";
				}
			}
	}
	public void relatorioCrescente() throws ListaVaziaException{
		try {
			List<Notas> listaDeNotas = notas.listar();
			Collections.sort(listaDeNotas);
			System.out.println(situacaoAluno());
		}
		catch(ListaVaziaException e){
			System.out.println(e.getMessage());
		}			
	}
	public void relatorioDecrescente() throws ListaVaziaException{
		try {
			List<Notas> listaDeNotas = notas.listar();
			Collections.sort(listaDeNotas,Collections.reverseOrder());
			System.out.println(situacaoAluno());	
		}	
		catch(ListaVaziaException e){
			System.out.println(e.getMessage());
		}
	}
	public int contadorNota(int quantidadeNotas) {
		return contadorNota += quantidade;
	}
	public static int contador(){
		contadorAluno+=1;
		return contadorAluno;
	}
	public String getMatricula() { 
		setMatricula(null); 
		return matricula;
	}
	public void setMatricula(String matricula) {
		int yearInicial = 2023;
		Calendar calendario = Calendar.getInstance();
		int year = calendario.get(Calendar.YEAR);
		if(yearInicial != year){
			if(contadorNovoAno == 0){
				contadorAluno = 0;
			}else {
				contadorAluno = contadorNovoAno;
			}
			contadorNovoAno++;
		}
		contador();
		this.matricula = yearInicial + "-" + contadorAluno;
	}
	public int getQuantidade() throws QuantidadeException{
		if(quantidade == 0) {
			throw new QuantidadeException("Quantidade de total notas adicionadas");
		}
		return quantidade;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Professores getProfessor(){
		return professor;
	}
	public void setProfessor(Professores professor) {
		this.professor = professor;
	}
	public String toString() {
		return "\n" + this.matricula + " - " + tratamento()  + this.nome + "\n" + "(" + this.email + ")" ;
	}
	public String situacaoAluno(){
		return "\n" + this.matricula + " - " + tratamento()  + this.nome + "\n" + "(" + this.email + ")" 
				+"\n" +"QUANTIDADE TOTAL DE AVALIÇOES: " + this.contadorNota +"\n" 
				+ "MEDIA DO ALUNO: " + media() + "\n" 
				+ "SITUAÇAO DO ALUNO: " + aprovacao() + "\n";
	}
	public String orientadoresAluno(ListaGenerica<Alunos> listaDeAlunos){
		return "\n" + this.matricula + " - " + tratamento()  + this.nome + "\n" + "(" + this.email + ")" +
	getProfessor();
	}
	public String tratamento() {
		if(getSexo() == true) {
			return  "Aluna ";
		}else {
			return  "Aluno ";
		}
	}
}
