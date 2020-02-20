package classes;

public class Principal {

	public static void main(String[] args) {
		
		Corrente conta1 = new Corrente();
		
		System.out.println("Saldo conta1: R$ " + conta1.getSaldo());
		
		conta1.setTitular("Maria Joaquina");
		conta1.setAgencia(001);
		conta1.setNumero(1234);
		
		System.out.println("Taxa transação: " + conta1.getTaxaTransacao());
		
		conta1.depositar(100);
		
		System.out.println("Saldo conta1: R$ " + conta1.getSaldo());
		
		conta1.sacar(37);
		
		System.out.println("Saldo conta1: R$ " + conta1.getSaldo());
		
		Poupanca conta2 = new Poupanca();
		
		conta2.depositar(100);
		
		System.out.println("Saldo conta2: R$ " + conta2.getSaldo());
		
		conta2.sacar(37);
		
		System.out.println("Saldo conta2: R$ " + conta2.getSaldo());
		
		System.out.println("Titular conta 2: " + conta2.getTitular());
		
		conta2.transferir(conta1, 20);
		
		conta1.transferir(conta2, 20);
		
		System.out.println("Saldo conta1: R$ " + conta1.getSaldo());
		System.out.println("Saldo conta2: R$ " + conta2.getSaldo());
		
		// Uma classe abstrata NÃO pode ser instanciada
		// Conta conta3 = new Conta();
	}

}
