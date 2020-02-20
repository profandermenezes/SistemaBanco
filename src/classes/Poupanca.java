package classes;

public class Poupanca extends Conta{
	
	public Poupanca() {
		taxaTransacao = 0.03;
		taxaAdministracao = 0;
		rendimento = 3;
	}
	
	// A poupança não permite transferências
	public void transferir(Conta destino, double valor) {
		System.out.println("Você não pode transferir.");
	}

}
