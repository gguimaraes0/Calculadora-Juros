package Calculadora;

public class Contas {

	public void JurosSimples()

	{
		try {
			System.out.println("Digite o Valor Inicial");
			double ValorInicial = Util.DigiteValor();

			System.out.println("Digite a Taxa de Juros (Apenas digitos)");
			double TaxaJuros = Util.DigiteValor();

			System.out.println("Digite o Período em Meses");
			double PeriodoMeses = Util.DigiteValor();

			double result = ValorInicial * (TaxaJuros / 100) * PeriodoMeses + ValorInicial;
			Util util = new Util();
			util.ArredondaValor(result);
			System.out.println(
					"O seu valor inicial foi de: " + ValorInicial + "R$" + "\n" + "A taxa de Juros aplicada foi de: "
							+ TaxaJuros + "%" + "\n" + "O Periódo de Meses utilizado foi de: " + PeriodoMeses + "Meses"
							+ "\n" + "O Valor Calculado foi de: " + result + "R$" + "\n");
		} catch (

		Exception e) {
			System.out.println("Por favor digite números válidos");
		}
	}

}
