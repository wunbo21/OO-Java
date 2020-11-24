package Semana_08;

import java.util.Scanner;

public class CalculadoraTela1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matematica mat = new Matematica();
		Scanner input = new Scanner(System.in);
		
		int num_1 = 0, num_2 = 0;
		
		System.out.println("Entre com num 1:");
		num_1 = input.nextInt();
		
		System.out.println("Entre com num 2:");
		num_2 = input.nextInt();
		
		System.out.println(num_1 + " + "+ num_2 + " = " + mat.soma(num_1, num_2));
		
	}
}