package main;

import classes.Conta;
import classes.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		Cliente guilherme = new Cliente();
		guilherme.nome ="Guilherme Cardoso";
		primeiraConta.titular = guilherme;
		
		System.out.println("Primeira Conta: "+ primeiraConta.titular.nome);
		
		//------------ Conta | Cliente -----------------
		Conta segundaConta = new Conta();
		Cliente karol = new Cliente();
		
		karol.nome="Karollinny";
		segundaConta.saldo = 50;
		segundaConta.saldo *= 10;
		segundaConta.titular = karol;
		
		System.out.println("Segunda Conta: "+ segundaConta.saldo);
		
		
		// teste de referência
		
		System.out.println("------------ Teste De Referencia ---------------");
		
		System.out.println(primeiraConta.titular); // conta.Conta@368102c8
		System.out.println(guilherme);
		
		System.out.println(segundaConta.titular); // conta.Conta@6996db8
		System.out.println(karol);
		
		
		/* if(primeiraConta == segundaConta) 
		{	System.out.println(true); }
		else 
		{	System.out.println(false);}	*/
		
	}

}
