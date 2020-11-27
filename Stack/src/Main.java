import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Pilha<Peca> pilha = new Pilha<Peca>();
		
		Peca pecaInsere = new Peca();
		pilha.insere(pecaInsere);
		
		Peca pecaRemove = pilha.remove();
		
		if(pilha.vazia()) {
			System.out.println("A pilha está vazia");
		}
		Pilha<String> pilha2 = new Pilha<String>();
		
		pilha2.insere("Teste");
		pilha2.insere("Teste 1");
		
		String teste = pilha2.remove();
		String teste1 = pilha2.remove();
		
		System.out.println(teste);
		System.out.println(teste1);
		
		//Estrutura de dados
		Stack<Peca> novaPilha = new Stack<Peca>();
		Peca pecaO = new Peca();
		novaPilha.push(pecaO);
		novaPilha.pop();
		System.out.println(novaPilha.isEmpty());
		
	}
}
