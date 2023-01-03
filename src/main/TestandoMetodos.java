package main;

import classes.Conta;
//import classes.Cliente;

public class TestandoMetodos {
	
	public static void main (String[] args ) {
		
		
		// CONTA PAULO SILVA	
		Conta contaPaulo = new Conta();

		// CONTA MARCELA REIS
		Conta contaMarcela = new Conta();

		
		//ATRIBUTOS - PAULO
		contaPaulo.saldo = 1500;
		/*contaPaulo.titular="Paulo Silva";*/
		contaPaulo.nu_agencia = 0.001;
		
		//ATRIBUTOS - MARCELA
		contaMarcela.saldo=2000;
		/*contaMarcela.titular ="Marcela Reis";*/
		contaMarcela.nu_agencia = 0.002;

		
		//MÉTODOS - PAULO
		contaPaulo.exibir();
		contaPaulo.transferir(300, contaMarcela);
			
		System.out.println("----------------");
		contaPaulo.exibir();
		
		System.out.println("----------------");
		//MÉTODOS MARCELA
		contaMarcela.exibir();
		
		
		
	}
}
