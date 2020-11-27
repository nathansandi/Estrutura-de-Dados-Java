package com.listas.model;

import java.util.Arrays;

public class ArrayClass {
	private Aluno[] object = new Aluno[100];
	private int totalObject = 0;
	public void add(Aluno aluno) {
		this.object[totalObject] = aluno;
		this.totalObject++;
	}
	//Ordem linear
	public void addAt(int pos, Aluno aluno) {
		this.garantirEspaco();
		if(!this.isBusy(pos)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i = this.totalObject -1 ; i>= pos; i--) {
			this.object[i+1]=this.object[i];
			
		}
		this.object[pos] = aluno;
		this.totalObject++;
		
	}
	

	public Aluno get(int pos) {
		if(!this.isBusy(pos)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.object[pos];
	}
	public boolean isBusy(int pos) {
		return pos>=0 && pos < this.totalObject;
	}
	public void remove(int pos) {
		if(!this.isBusy(pos)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i=pos ; i < this.totalObject -1 ; i++) {
			this.object[i]=this.object[i+1];	
		}
		this.totalObject--;
	}
	public boolean contain(Aluno aluno) {
		//Compara a Referência ao objeto usando o equals
		for(int i=0; i < this.totalObject;i++) {
			if(aluno.equals(this.object[i])) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return this.totalObject;
	}
	public String toString() {
		if(this.totalObject == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for(int i=0; i < this.totalObject-1;i++) {
			builder.append(this.object[i]);
			builder.append(", ");
		}
		builder.append(this.object[this.totalObject-1]);
		builder.append("]");
		return builder.toString();
	}
	//Alocação Dinamica
	private void garantirEspaco() {
		//this.garantirEspaco();
		if(this.totalObject == this.object.length) {
			Aluno[] novaArray = new Aluno[this.object.length*2];
			for(int i = 0; i < this.object.length; i++) {
				novaArray[i]=this.object[i];
			}
			this.object=novaArray;
		}
	}
}
