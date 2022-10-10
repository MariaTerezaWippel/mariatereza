package poo;

public class Contacorrente {
	
	public String nomeTitular;
	public Long cpf;
	public Long numeroConta;
	public Double saldo;

	public Double sacar (Double valor) {
		Double result = null;
		if (valor > saldo) {
			System.out.println("Saldo não suficiente");
		}
		else {
		result = saldo - valor;
		}
		
		return result;
	}
	
	public Double depositar (Double valor2) {
		Double result2;
		
		result2 = saldo + valor2;
		
		return result2; 
	}
	
	public void mostrarDados() {
		System.out.println("Titular:" + nomeTitular);
		System.out.println("Cpf:" + cpf);
		System.out.println("Conta:" + numeroConta);
		System.out.println("Saldo conta:" + saldo);
	}
	
}
