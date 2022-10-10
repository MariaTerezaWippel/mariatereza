package ex3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Integer num = Integer.valueOf(leitura.nextLine());
		
		if (num % 2 == 0) {
			System.out.println("É par!");
		}
		else {
			System.out.println("É impar!");
		}
		}
		
	}

	