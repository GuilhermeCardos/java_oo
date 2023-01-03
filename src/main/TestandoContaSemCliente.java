package main;

import classes.Cliente;
import classes.Conta;

public class TestandoContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaMariana = new Conta();
		System.out.println(contaDaMariana);
		
		contaDaMariana.titular = new Cliente();
		System.out.println(contaDaMariana.titular);
				
		
		contaDaMariana.titular.nome = "Mariana Silva Santos";
		//System.out.println(contaDaMariana.titular);
		
		
	}
	
}
