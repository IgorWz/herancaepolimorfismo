package poo;

public class Farmacia {
	
	private String endereco;
	private String numero;
	private String cep;
	private String telefone;
	private String nome;
	
	public Farmacia(String endereco, String numero, String cep, String telefone, String nome) {
	super();
	this.endereco = endereco;
	this.numero = numero;
	this.cep = cep;
	this.telefone = telefone;
	this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void Visualizar() {
		System.out.println("\nO endereço da Farmácia é: "+endereco+"\nNúmero da Farmácia: "+numero+"\nCep do local: "+cep+"\nTelefone do Estabelecimento: "+telefone+"\nNome da Farmácia: "+nome);
	}
	
}
