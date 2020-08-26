/*
 * Nome: Lucas Bernardes dos Santos
 * Matrícula: 0050016045
 * 
 * */

import java.util.Scanner;

public class Ex1_LucasBernardes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int i = 1, tab = 0;
		
		System.out.println("Tabuada: ");
		tab = input.nextInt();
		
		for(i = 1; i <= 10; i++) {
			System.out.println(tab+"x"+i+"="+tab*i);
		}
		

	}

}
