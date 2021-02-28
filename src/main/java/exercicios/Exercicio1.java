package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		
		boolean primeiroNumeroMaior = x > y;
		if (primeiroNumeroMaior) {
			System.out.println(String.format("O número maior é: %s ", x));
		} else {
			System.out.println(String.format("O número maior é: %s ", y));
		}
	}

}
