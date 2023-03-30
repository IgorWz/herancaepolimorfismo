package poo;

public class PessoaJuridica extends TestaCliente {
	
	private int cnpj;

	public PessoaJuridica(String nome, int idade, String genero, int salario, String endereço, int cnpj) {
		super(nome, idade, genero, salario, endereço);
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println("O cnpj da pessoa jurídica é: "+cnpj);
	}
	
	

}
