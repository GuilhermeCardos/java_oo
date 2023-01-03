package main;

import classes.Conta;

public class TesteSacaValoresNegativos {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.depositar(500);
		//System.out.println(conta.sacar());
		
		System.out.println(conta.getSaldo());
	}

}
