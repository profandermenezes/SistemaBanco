package classes;

// extends -> Corrente extende Conta (especializa Conta)
public class Corrente extends Conta{

	// Construtor da classe
	
	/* 
	 * Construtor Default
	 * - público
	 * - sem parâmetros
	 */
	public Corrente() {
		// hard coded
		taxaTransacao = 0.07;
		taxaAdministracao = 5;
		rendimento = 0;
	}
	
}
