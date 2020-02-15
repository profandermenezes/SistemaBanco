package classes;

public class Conta {

	private String titular;
	private int numero;
	private int agencia;
	private double saldo;
	private double taxaTransacao;
	private double taxaAdministracao;
	
	// Métodos de comportamento
	public void depositar(double valor) {
		//saldo = saldo + valor;
		saldo += valor;
	}
	
	public void transferir(Conta destino, double valor) {
		
		saldo -= valor;
		destino.depositar(valor);
		
	}
	
	// Métodos de acesso
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getTaxaTransacao() {
		return taxaTransacao;
	}
	public void setTaxaTransacao(double taxaTransacao) {
		this.taxaTransacao = taxaTransacao;
	}
	public double getTaxaAdministracao() {
		return taxaAdministracao;
	}
	public void setTaxaAdministracao(double taxaAdministracao) {
		this.taxaAdministracao = taxaAdministracao;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
}
