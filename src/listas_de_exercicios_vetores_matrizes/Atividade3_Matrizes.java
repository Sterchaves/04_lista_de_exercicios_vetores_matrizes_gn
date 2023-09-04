package listas_de_exercicios_vetores_matrizes;

import java.util.Scanner;

public class Atividade3_Matrizes {
	
	public static void main(String[] args) {	
		
		int[][] matrix = {
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9}
				};
		int[] diagonalPrincipal = new int[matrix.length];
		int[] diagonalSecundaria = new int[matrix.length]; 
		int x =0, y =0;
		int soma1 =0, soma2=0;
		
		for(int i =0; i<matrix.length; i++) {
			for(int j =0; j<matrix.length; j++) {
				if(i==j) {
					diagonalPrincipal[x] = matrix[i][j];
					soma1 += diagonalPrincipal[x];
					x++;				
				}
				
				if((i+j) == (matrix.length - 1)){
					diagonalSecundaria[y] = matrix[i][j];
					soma2 += diagonalSecundaria[y];	
					y++;
				}
			}		
		} 
		
		System.out.printf("\nElementos da Diagonal Principal:%d, %d,  " + diagonalPrincipal[0], diagonalPrincipal[1], diagonalPrincipal[2]); 
		System.out.printf("\nElementos da Diagonal Secundária:%d, %d, " + diagonalSecundaria[0], diagonalSecundaria[1], diagonalSecundaria[2]);

		System.out.println("\n Soma dos Elementos da Diagonal Principal: " + soma1);
		System.out.println("\n Soma dos Elementos da Diagonal Secundária: " + soma2); 

		
	}
	
}
