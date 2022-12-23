package conta;

public class Conta {
	
	public double saldo;
	public double nu_agencia;
	public String titular;
	
	
	public void depositar (double valor) 
	{
		this.saldo += valor; 
	}
	
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
	
	public boolean sacar(double valor) 
	{
		if (this.saldo >= valor)
		{
			this.saldo -= valor;
			return true;
		}
			return false;
	}
	
	public void exibir() 
	{
		System.out.println("Nome: "+ this.titular);
		System.out.println("Agencia e Conta: "+ this.nu_agencia);
		System.out.println("Saldo atual: "+ this.saldo);
	}
	
}
