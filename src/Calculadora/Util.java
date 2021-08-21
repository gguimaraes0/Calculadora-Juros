package Calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Util {

	public Scanner teclado = new Scanner(System.in);

	public void Menu() {
		System.out.println("Calculadora\n");
		System.out.println("1- Juros Simples");
		System.out.println("2- Juros Compostos");
		System.out.println("3- Hora Extra");
		System.out.println("4- Sal�rio");
		System.out.println("5- F�rias");
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
			System.out.println("Digite um n�mero v�lido");
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
			System.out.println("Digite um n�mero v�lido");
			return 7;
		}
		default: {
			System.out.println("Digite um n�mero v�lido");
			return 7;
		}
		}
	}

	public String ArredondaValor(double valor) {
		DecimalFormat formatador = new DecimalFormat("0.000");
		return formatador.format(valor);
	}

	public void ExecutaOperacao(int operacao) {
		switch (operacao) {

		case 1: {

			Contas conta = new Contas();
			conta.JurosSimples();
		}
		case 2: {
			Contas conta = new Contas();
			conta.JurosCompostos();
			break;
		}
		case 3: {
			break;
		}
		case 4: {
			break;
		}
		case 5: {
			break;
		}

		}
	}

	public static double DigiteValor() {
		try {
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			double result = teclado.nextDouble();
			return result;
		} catch (Exception e) {
			System.out.println("Por favor digite n�meros v�lidos");
			return DigiteValor();
		}
	}

}
