package instituicao;

public abstract class Pessoa{
	protected String nome;
	protected String email;
	protected Boolean sexo;
	
	public Pessoa(String nome,String email,Boolean sexo) {
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean getSexo(){
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public abstract String tratamento();
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n"+ "Email: " + this.email;
	}
	
}
