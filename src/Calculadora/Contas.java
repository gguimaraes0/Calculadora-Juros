package Calculadora;

import java.util.Scanner;

public class Contas {

	@SuppressWarnings("resource")
	public int JurosSimples()

	{
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Digite o Valor Inicial");
			double ValorInicial = in.nextDouble();
			System.out.println("Digite a Taxa de Juros (Apenas digitos)");
			in = new Scanner(System.in);
			double TaxaJuros = in.nextDouble();
			System.out.println("Digite o Período em Meses");
			in = new Scanner(System.in);
			int PeriodoMeses = in.nextInt();

			double result = ValorInicial * (TaxaJuros / 100) * PeriodoMeses + ValorInicial;
			Util util = new Util();
			util.ArredondaValor(result);
			System.out.println(
					"O seu valor inicial foi de: " + ValorInicial + "R$" + "\n" + "A taxa de Juros aplicada foi de: "
							+ TaxaJuros + "%" + "\n" + "O Periódo de Meses utilizado foi de: " + PeriodoMeses + "Meses"
							+ "\n" + "O Valor Calculado foi de: " + result + "R$" + "\n");
			return 1;
		} catch (

		Exception e) {
			System.out.println("Por favor digite números válidos" );
			return 0;
		}
	}

}
