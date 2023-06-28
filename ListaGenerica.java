package instituicao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListaGenerica<T> implements Iterable<T> {
    private List<T> lista;
   
    public ListaGenerica() {
        lista = new ArrayList<>();
    }
    public void adicionar(T objeto) {
        lista.add(objeto);
    }
    public void remover(T objeto) {
        lista.remove(objeto);
    }
    public List<T> listar() throws ListaVaziaException {
    	if(lista == null) {
    		throw new ListaVaziaException("Lista Vazia");
    	}
    	return lista;    	
    }
    public int size() {
		return lista.size();
	}
    public T item(int i) {
    	return lista.get(i);
    }
    
    public boolean verificaExistencia() {
		return !lista.isEmpty();
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		 return lista.iterator();
	}
}