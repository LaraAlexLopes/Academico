package instituicao;
import java.util.ArrayList;
import java.util.List;

public class Lista<A> {
	private List<A> lista;

	public Lista(List<A> lista) {
		lista = new ArrayList<>();
	}

	public void addElemento(A elemento) {
		lista.add(elemento);
	}
	
	public void removeElemento(A elemento) {
		lista.remove(elemento);
	}
	
	public int quantidadeElementos() {
		return lista.size();
	}
	public List<A> listar(){
		return lista;
	}

	public boolean verificaExistencia() {
		return !lista.isEmpty();
	}
}