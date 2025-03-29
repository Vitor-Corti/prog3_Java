package model;

public class Disciplina_2 {
	
	//
	//Constantes
	//
	
	final public static int Tam_Max= 40;

	
	//
	//ATRIBUTOS
	//
	
	private String código;
	private String nome;
	int numCréditos;
	
	//
	//Método construtor
	//
	public Disciplina_2(String código, String nome, int numCréditos) throws ModelException {
		super();
		this.setCódigo(código);
		this.setNome (nome);
		this.setNumCréditos(numCréditos);
	}
	public String getCódigo() {
		return this.código;
	}
	public void setCódigo(String código) throws ModelException {
		Disciplina_2.validar_Codigo(código);
		this.código = código;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) throws ModelException {
		Disciplina_2.validarNome(nome);
		this.nome = nome;
	}
	public int getNumCréditos() {
		return this.numCréditos;
	}
	public void setNumCréditos(int numCréditos) throws ModelException {
		Disciplina_2.validarNum_Cred(numCréditos);
			this.numCréditos = numCréditos;
			
	}
	//
	//Métodos
	//
	
	public static void validarNome(String nome) throws ModelException  {
		if(nome== null || nome.equals(""))
			throw new ModelException("O nome da disciplina não pode ser nulo!!");
		if(nome.length() > Tam_Max) 
			throw new ModelException("O limite de caractere foi ultrapssado(40)");
	}
	
	public static void validar_Codigo(String codigo) throws ModelException  {
		if(codigo.length() != 7 )
			throw new ModelException("o código deve ter exatos 7 caracteres");
	}
	
	public static void validarNum_Cred( int num_Creditos) throws ModelException  {
		if(num_Creditos<= 0 && num_Creditos > 8)
			throw new ModelException("Os créditos precisam ser maior do que 0 e menores ou iguais a 8");
		
	}
	
		
}

