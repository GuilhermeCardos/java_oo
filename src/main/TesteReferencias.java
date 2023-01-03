package main;

import classes.Conta;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: "+ primeiraConta.saldo);
		
		// Neste caso não foi instânciado um objeto, apenas referênciando o endereço de memória
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta); // conta.Conta@368102c8 (endereço de memoria)
		
		segundaConta.saldo +=100;
		
		System.out.println("Saldo da Segunda conta: "+ segundaConta.saldo);
		System.out.println("Saldo da primeira conta: "+ primeiraConta.saldo);
		
		
		// Teste de referência 
		
		if(primeiraConta == segundaConta) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
