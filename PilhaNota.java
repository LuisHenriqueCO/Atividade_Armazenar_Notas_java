package atividade_pilha;

import java.util.ArrayList;

public class PilhaNota {
	
	private ArrayList<Double> pilha = new ArrayList<Double>();
	
	public void push(double elemento) {
	    pilha.add(elemento);
	}

	public double pop() {
	    if (pilha.isEmpty()) {
	        throw new RuntimeException("A pilha está vazia");
	    }
	    return pilha.remove(pilha.size() - 1);
	}

	public double top() {
	    if (pilha.isEmpty()) {
	        throw new RuntimeException("A pilha está vazia");
	    }
	    return pilha.get(pilha.size() - 1);
	}

	public boolean isEmpty() {
	    return pilha.isEmpty();
	}

	public double size() {
	    return pilha.size();
	}
	
	public double elementAt(int index) {
	    if (index < 0 || index >= pilha.size()) {
	        throw new IndexOutOfBoundsException("Índice inválido");
	    }
	    return pilha.get(index);
	}


}
