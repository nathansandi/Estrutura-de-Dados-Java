import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {
	private LinkedList<T> object = new LinkedList<T>();
	
	public void insere(T Object) {
		this.object.add(Object);
	}
	public T remove() {
		return this.object.remove(this.object.size()-1);
	}
	public boolean vazia() {
		return this.object.size()==0;
	}
}
