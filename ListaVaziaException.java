package instituicao;
import java.lang.Exception;
public class ListaVaziaException extends Exception{
	private static final long serialVersionUID = 1L;
	public ListaVaziaException(String msg){
		super(msg);
	}
}
