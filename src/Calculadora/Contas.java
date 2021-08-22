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
			System.out.println("Ocorreu um erro no cálculo do Juros Simples" + e);
		}
	}

	public void JurosCompostos()

	{
		try {
			System.out.println("Digite o Valor Inicial");
			double ValorInicial = Util.DigiteValor();

			System.out.println("Digite a Taxa de Juros (Apenas digitos)");
			double TaxaJuros = Util.DigiteValor();

			System.out.println("Digite o Período em Meses");
			double PeriodoMeses = Util.DigiteValor();

			double result = ValorInicial * Math.pow((1 + TaxaJuros / 100), PeriodoMeses);
			Util util = new Util();
			System.out.println(
					"O seu valor inicial foi de: " + ValorInicial + "R$" + "\n" + "A taxa de Juros aplicada foi de: "
							+ TaxaJuros + "%" + "\n" + "O Periódo de Meses utilizado foi de: " + PeriodoMeses + "Meses"
							+ "\n" + "O Valor Calculado foi de: " + util.ArredondaValor(result) + "R$" + "\n");
		} catch (

		Exception e) {
			System.out.println("Ocorreu um erro no cálculo do Juros Compostos" + e);
		}
	}

	public void SalarioLiquido()

	{
		try {
			System.out.println("Digite o Valor do Salário Bruto");
			double SalarioBruto = Util.DigiteValor();

			double result = ValorINSS(SalarioBruto);
			result = ValorIRRF(result);

			Util util = new Util();
			System.out.println("O Valor bruto é de: " + SalarioBruto + "O seu Salário Líquido é de: "
					+ util.ArredondaValor(result) + "R$" + "\n");
		} catch (

		Exception e) {
			System.out.println("Ocorreu um erro no cálculo do Salário Líquido" + e);
		}
	}

	public double ValorINSS(double salario) {
		if (salario <= 1556.94) {
			double inss = salario * 0.08;
			return salario -= inss;
		} else if (salario > 1556.94 && salario <= 2594.92) {
			double inss = salario * 0.09;
			return salario -= inss;
		} else if (salario > 2594.92 && salario <= 5189.82) {
			double inss = salario * 0.11;
			return salario -= inss;
		} else {
			double inss = 570.88;
			return salario -= inss;
		}
	}

	public double ValorIRRF(double salario) {

		if (salario <= 1903.38) {
			return salario;
		} else if (salario > 1903.38 && salario <= 2826.65) {

			double aliquota = 0.075;
			double taxa = 142.80;

			double irrf = (salario * aliquota) - taxa;
			return salario -= irrf;
		} else if (salario > 2826.65 && salario <= 3751.05) {

			double aliquota = 0.15;
			double taxa = 354.80;

			double irrf = (salario * aliquota) - taxa;
			return salario -= irrf;
		} else if (salario > 3751.05 && salario <= 4664.68) {

			double aliquota = 0.225;
			double taxa = 636.13;

			double irrf = (salario * aliquota) - taxa;
			return salario -= irrf;
		} else {

			double aliquota = 0.275;
			double taxa = 869.36;

			double irrf = (salario * aliquota) - taxa;
			return salario -= irrf;
		}

	}

}
