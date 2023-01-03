package main;

import classes.Conta;
import classes.Cliente;

public class testaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo SIlveira";
		paulo.cpf = "222.151.669-26";
		paulo.profissao = "programador"; 

		Conta contaPaulo = new Conta();
		contaPaulo.depositar(100);
		
		// Associação entre CONTA e CLIENTE
		contaPaulo.titular= paulo;
		
		contaPaulo.exibir();
		
	}

}
