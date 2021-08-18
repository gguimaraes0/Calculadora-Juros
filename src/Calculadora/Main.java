package Calculadora;

public class Main {

	public static void main(String[] args) {

		int result;
		do {
			Util util = new Util();
			util.Menu();
			result = util.ValidaMenu();

			if (result == 0)
				break;
			if (result == 7) {
				continue;
				
			}
		} while (result != 0);

	}

}
