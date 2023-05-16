package atividade_pilha;

import java.util.Scanner;

public class notas {
	
	static PilhaNota notas = new PilhaNota();
	static PilhaNota notasInversa = new PilhaNota();
	
	public static void inverterNotas(PilhaNota notas) {
        while (notas.isEmpty() == false) {
        	notas.top();
            notasInversa.push(notas.pop());
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Quantas notas deseja inserir: ");
		int qtd_notas = input.nextInt();
		
		for (int i = 1; i <= qtd_notas; i++) {
			System.out.print("Insira a " + i + "º nota: ");
			Double nota = input.nextDouble();
			notas.push(nota);
		}
		
		inverterNotas(notas);
		
		System.out.println("Notas da mais recente para a mais antiga:");
		for (int i = 0; i < notasInversa.size(); i++) {
			System.out.println(notasInversa.elementAt(i));
		}

	}

}
