package instituicao;
public class Notas implements Comparable<Notas> {
	private double peso;
	private double nota;	
	public Notas(double peso,double nota) throws NotasException{
		if(nota < 0) {
			throw new NotasException("Nota menor que 0");
		}else if(nota > 10) {
			throw new NotasException("Nota maior que 10");
		}
		this.peso = peso;
		this.nota = nota;	
	}
	public double getPeso() {
		return (this.peso);
	}
	public void setPeso(double peso) {
		 this.peso = peso;
	}
	public double getNota() {
		return (this.nota);
	}
	public void setNota(double nota) {
		 this.nota = nota;
	}
	@Override
	public String toString() {
		return "\n" + "Peso: " + this.peso +  " Nota: " + this.nota ;
	}
	@Override
	public int compareTo(Notas outraNota) {
		 if (this.nota < outraNota.getNota()) {
	            return -1;
	        } else if (this.nota > outraNota.getNota()) {
	            return 1;
	        } else {
	            return 0;
	        }
	} 
}
