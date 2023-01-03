package classes;

public class Conta {
	
	public double saldo;
	public double nu_agencia;
	public Cliente titular; // Atributo de referência a Classe Cliente
	
	
	//------> DEPOSITAR <---------
	public void depositar (double valor) 
	{
		this.saldo += valor; 
	}
	
	
	//------> TRANSFERIR <---------
	public boolean transferir(double valor, Conta destino) 
	{
		if (this.saldo >= valor)
		{
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		}
		
			return false;		
	}
	
	// ------> SACAR <---------
	public boolean sacar(double valor) 
	{
		if (this.saldo >= valor)
		{
			this.saldo -= valor;
			return true;
		}
			return false;
	}
	
	//--------> EXIBIR <---------
	public void exibir() 
	{
		System.out.println("Nome: "+ this.titular.nome);
		System.out.println("Agencia e Conta: "+ this.nu_agencia);
		System.out.println("Saldo atual: "+ this.saldo);
	}
	
	// -------> method Getters, Setters - SALDO <-------------
	
	public double getSaldo(){
		return this.saldo;
	}
	
	
}
