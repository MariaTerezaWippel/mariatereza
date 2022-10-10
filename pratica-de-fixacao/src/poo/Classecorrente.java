package poo;

public class Classecorrente {
	public static void main(String[] args) {
		
        Contacorrente c = new Contacorrente();
		
		c.nomeTitular = "Maria";
		c.cpf = 123456789l;
		c.numeroConta = 123456789l;
		c.saldo = 15935.7;
		
		c.mostrarDados();
		
		c.depositar(108.0);
		c.sacar (3.0);
		
		c.mostrarDados();

	}

}