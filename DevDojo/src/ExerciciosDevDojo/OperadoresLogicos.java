package ExerciciosDevDojo;

public class OperadoresLogicos {

	public static void main(String[] args) {
		double ValorTotalContaCorrente = 4000;
		double ValorTotalContaPoupanca = 500;
		float ValorPlaystationCinco = 4000;
		
		boolean isPlaystationCincoCompravel = ValorTotalContaCorrente > ValorPlaystationCinco ||
				ValorTotalContaPoupanca <= ValorPlaystationCinco;
		
		System.out.println (isPlaystationCincoCompravel);                                                                          

	}

}
