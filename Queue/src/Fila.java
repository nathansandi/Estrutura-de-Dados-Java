import java.util.LinkedList;
import java.util.List;

public class Fila<T> {
	private LinkedList<T> object = new LinkedList<T>();
	
	public void insere(T Object) {
		this.object.add(Object);
	}
	public T remove() {
		return this.object.remove(0);
	}
	public boolean vazia() {
		return this.object.size()==0;
	}
}
