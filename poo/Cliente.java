package poo;

public class Cliente {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica("Ana Carolina",22,"Feminino",6500,"São Paulo",1347892346);
		
		PessoaJuridica pj = new PessoaJuridica("Igor",19,"Masculino",6000,"São Paulo",1232345434);
		
		pf.visualizar();
		
		pj.visualizar();
		
		
	}

}
