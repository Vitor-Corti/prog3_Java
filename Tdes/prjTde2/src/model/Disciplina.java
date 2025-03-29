package model;

public class Disciplina {
	

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
	public Disciplina(String código, String nome, int numCréditos) {
		super();
		this.código = código;
		this.nome = nome;
		this.numCréditos = numCréditos;
	}
	public String getCódigo() {
		return this.código;
	}
	public void setCódigo(String código) {
		if(this.validar_Codigo(código))
		this.código = código;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if( this.validarNome(nome))
		this.nome = nome;
	}
	public int getNumCréditos() {
		return this.numCréditos;
	}
	public void setNumCréditos(int numCréditos) {
		if(this.validarNum_Cred(numCréditos))
			this.numCréditos = numCréditos;
			
	}
	//
	//Métodos
	//
	
	public boolean validarNome( String nome) {
		if(nome== null || nome.equals(""))
			return false;
		if(nome.length() > Tam_Max) 
			return false;
		return true;
	}
	
	public boolean validar_Codigo(String codigo) {
		if(codigo.length() != 7 )
			return false;
		return true;
	}
	
	public boolean validarNum_Cred( int num_Creditos) {
		if(num_Creditos>= 0 && num_Creditos <= 8)
			return true;
		return false;
	}
	
		
}
