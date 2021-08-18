package Calculadora;

import java.util.Scanner;

public class Util {
	
	public Scanner teclado = new Scanner(System.in);
	
	public void Menu() {
		System.out.println("Calculadora\n");
		System.out.println("1- Juros Compostos");
		System.out.println("2- Juros Simples");
		System.out.println("3- Hora Extra");
		System.out.println("4- Salário");
		System.out.println("5- Férias");
		System.out.println("0- Sair\n");
	}
	
	public int ValidaMenu() {

		int result;
		try {
			teclado = new Scanner(System.in);
			result = teclado.nextInt();
		} catch (Exception ex) {
			result = 7;
		}

		if (result == 7) {
			System.out.println("Digite um número válido");
			return 7;
		}
		switch (result) {

		case 1: {
			return result;
		}
		case 2: {
			return result;
		}
		case 3: {
			return result;
		}
		case 4: {
			return result;
		}
		case 5: {
			return result;
		}		
		case 0: {
			return result;
		}
		case 7: {
			System.out.println("Digite um número válido");
			return 7;
		}
		default: {
			System.out.println("Digite um número válido");
			return 7;
		}
		}
	}

}
