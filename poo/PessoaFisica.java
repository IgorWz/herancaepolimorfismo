package poo;

public class PessoaFisica extends TestaCliente {
	
	private int cpf;

	public PessoaFisica(String nome, int idade, String genero, int salario, String endereço, int cpf) {
	super(nome, idade, genero, salario, endereço);
	this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		System.out.println("O cpf da pessoa física é: "+cpf);
	}
	
}
