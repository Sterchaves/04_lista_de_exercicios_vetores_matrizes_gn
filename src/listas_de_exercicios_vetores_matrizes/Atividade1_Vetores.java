package listas_de_exercicios_vetores_matrizes;

import java.util.Scanner;

public class Atividade1_Vetores {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int number;
		int arr[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};		
		Boolean encontrado = false;
		
		
		System.out.println("Digite o número que você deseja encontrar:  ");
		number = scanner.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(number == arr[i]) {
				System.out.println("O número " + number + " está localizado na posição: " + (i + 1));
				encontrado = true;
				break;
			} 
		}
		
		if (!encontrado){
			System.out.println("O número " + number + " não foi encontrado!");
		}
	}
}
