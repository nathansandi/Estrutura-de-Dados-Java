package com.listas.model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Aluno 1");
		a2.setNome("Aluno 2");
		
		ArrayClass lista = new ArrayClass();
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a2);
		lista.add(a2);
		lista.add(a2);
		lista.remove(3);
		lista.addAt(2, a1);
		
		//Get�
		Aluno aluno1 = (Aluno)lista.get(0);
		Aluno aluno2 = (Aluno)lista.get(1);
		System.out.println(aluno1);
		System.out.println(aluno2);
		
		lista.remove(0);
		System.out.println(lista.toString());
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ana");
		System.out.println(lista.contain(aluno));
		
		System.out.println(lista.size());
	}

}
