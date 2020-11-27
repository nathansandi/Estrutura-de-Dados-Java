import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Fila<Peca> fila = new Fila<Peca>();
		
		Peca pecaInsere = new Peca();
		fila.insere(pecaInsere);
		
		Peca pecaRemove = fila.remove();
		
		if(fila.vazia()) {
			System.out.println("A fila está vazia");
		}
		Fila<String> fila2 = new Fila<String>();
		
		fila2.insere("Teste");
		fila2.insere("Teste 1");
		
		String teste = fila2.remove();
		String teste1 = fila2.remove();
		
		System.out.println(teste);
		System.out.println(teste1);
		
		
		//Utilizando o Queue
		Queue<Peca> filaN= new LinkedList<Peca>();
		Peca peca = new Peca();
		//Adiciona
		filaN.offer(peca);
		//Remove
		Peca removido = filaN.poll();
		System.out.println(filaN.isEmpty());
		
	}
}
