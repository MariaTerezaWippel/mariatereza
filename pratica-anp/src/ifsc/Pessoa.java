package ifsc;

public class Pessoa {
	
	private String nome;
	private Long cpf; //em String não estava rodando no MainPessoa
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	

}
