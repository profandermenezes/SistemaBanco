package classes;

// A classe Conta não deve ser instanciada.
// Ela serve apenas de "molde" para as especialistas
public abstract class Conta {

	private String titular;
	private int numero;
	private int agencia;
	private double saldo;
	protected double taxaTransacao;
	protected double taxaAdministracao;
	protected double rendimento;
	
	// Métodos de comportamento
	public void depositar(double valor) {
		//saldo = saldo + valor;
		saldo += valor;
	}
	
	public void transferir(Conta destino, double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			destino.depositar(valor);
			
			aplicarTaxaTransacao(valor);
		}	
	}
	
	public void sacar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			aplicarTaxaTransacao(valor);
		}
	}
	
	// A taxaTransacao está em porcentagem
	private void aplicarTaxaTransacao(double valorTransacao) {
		double valorDesconto = taxaTransacao * valorTransacao;
		saldo -= valorDesconto;
	}
	
	// A taxaAdministracao está em reais
	public void aplicarTaxaAdministracao() {
		saldo -= taxaAdministracao;
	}
	
	// O rendimento está em porcentagem
	public void aplicarRendimento() {
		double valorAcrescimo = rendimento * saldo;
		saldo += valorAcrescimo;
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

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	
	
	
}
