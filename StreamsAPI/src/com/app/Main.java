package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	//Criar Strams
	public static void main(String arg[]){
		// TODO Auto-generated method stub
		
		//https://www.oracle.com/br/technical-resources/articles/java/processing-streams-java-se-8.html
		
		List<String> items = new ArrayList<String>();
		
		items.add("um");
		items.add("deux");
		items.add("throa");
		
		Stream<String> stream  = items.stream();
		/*
		 * O m�todo stream() tamb�m foi adicionado a outras interfaces, como a java.util.map, a partir da qual tamb�m podemos obter streams da mesma forma que vimos anteriormente.

			Al�m disso, uma stream pode ser gerada a partir de I/O, arrays e valores. Para isso, basta chamar os m�todos est�ticos Files.lines(), Stream.of(), Arrays.stream(), respectivamente, como mostra o c�digo a seguir:
			
			Stream <String> lines= Files.lines(Paths.get(�myFile.txt�),       Charset.defaultCharset());
			Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4, 5);
			IntStream numbersFromArray = Arrays.stream(new int[] {1, 2, 3, 4, 5});
		 */
		
		//****ITERANDO
		items.stream().forEach(item -> System.out.println(item));
		
		//Operacoes
		//Equals
		Stream<String> operateEquals = items.stream().filter(item -> item.equals("deux"));
		System.out.println(operateEquals.count());
		
		//Average
		
		/*
		 * De forma semelhante, tamb�m � poss�vel realizar outras opera��es, como obter os valores m�ximo, m�nimo e a soma dos elementos, sempre utilizando m�todos simples e sem a necessidade de aplicar explicitamente la�os de repeti��o.
		 */
		List<Integer> items1 = new ArrayList<Integer>();
		
		items1.add(1);
		items1.add(2);
		items1.add(3);
		double media = items1.stream().
		mapToInt(item1 -> item1).
		average().
		getAsDouble();
		
		System.out.println("media - "+media);
		
		
		
		
	}

	
	
}
