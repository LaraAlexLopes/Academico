package instituicao;
import java.lang.Exception;
public class NotasException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public NotasException(String msg) {
		super(msg);
	}
}
