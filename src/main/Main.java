package main;

import conta.Conta;

public class Main {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		primeiraConta.titular="Guilherme Cardoso";
		
		System.out.println("Primeira Conta: "+primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		segundaConta.saldo *= 10;
		segundaConta.titular = "Karollinny Cardoso";
		
		System.out.println(segundaConta.titular+"Segunda Conta: "+ segundaConta.saldo);
		
		
		// teste de referência
		
		System.out.println(primeiraConta); // conta.Conta@368102c8
		
		System.out.println(segundaConta); // conta.Conta@6996db8
		
		if(primeiraConta == segundaConta) 
		{	System.out.println(true); }
		
		else 
		{	System.out.println(false);}
		
	}

}
