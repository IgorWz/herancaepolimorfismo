package poo;

public class TestaCliente {
	
	private String nome;
	private int idade;
	private String genero;
	private int salario;
	private String endereço;
	
	public TestaCliente(String nome, int idade, String genero, int salario, String endereço) {
	super();
	this.nome = nome;
	this.idade = idade;
	this.genero = genero;
	this.salario = salario;
	this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public void visualizar() {
		System.out.println("\nNome do funcionário: "+nome+"\nIdade: "+idade+"\nGênero: "+genero+"\nSalário: "+salario+"\nEndereço: "+endereço);
	}
	

}
