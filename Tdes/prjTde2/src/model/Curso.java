package model;

public class Curso {
	
	//
	//Constantes
	//
	
	final public static int Tam_Max= 25;
	
	
	//
	//ATRIBUTOS
	//
	
	private int codigo;
	private String nome;
	private int cargaHorária;
	
	public Curso(int codigo, String nome, int cargaHorária) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHorária = cargaHorária;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		if(this.validarCodigo(codigo))
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if( this.validarNome(nome))
		this.nome = nome;
	}

	public int getCargaHorária() {
		return this.cargaHorária;
	}

	public void setCargaHorária(int cargaHorária) {
		if(this.carg_Horaria (cargaHorária))
		this.cargaHorária = cargaHorária;
	}
	
	//
	//Métodos
	//
	
	public boolean validarCodigo(int codigo) {
		if(codigo > 0 && codigo < 100)
			return true;
		return false;
	}
	
	public boolean validarNome( String nome) {
		if(nome== null || nome.equals(""))
			return false;
		if(nome.length() > Tam_Max) 
			return false;
		return true;
	}
		
	public boolean carg_Horaria (int cargaHorária) {
		if(cargaHorária>= 2000 && cargaHorária < 8000 )
			return true;
		return false;
	}
		
		
					
}
	
	


