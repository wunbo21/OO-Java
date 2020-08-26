/*
 * Nome: Lucas Bernardes dos Santos
 * Matrícula: 0050016045
 * 
 * */

import java.util.Scanner;

public class Ex2_LucasBernardes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
				
		int num = 0;
		
		System.out.println("Digite um numero: ");
		num = input.nextInt();
		
		if((num % 2) != 0) {
			System.out.println("É ímpar.");
		} else {
			System.out.println("É par.");
		}
	}

}
