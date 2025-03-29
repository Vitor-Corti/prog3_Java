package model;

public class Curso_2{
	
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
	
	//
	//Método construtor
	//
	
	public Curso_2(int codigo, String nome, int cargaHorária) throws ModelException {
		super();
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setCargaHorária(cargaHorária);
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) throws ModelException {
		Curso_2.validarCodigo(codigo);
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) throws ModelException  {
		Curso_2.validarNome(nome);
		this.nome = nome;
	}

	public int getCargaHorária()  {
		return this.cargaHorária;
	}

	public void setCargaHorária(int cargaHorária) throws ModelException {
		Curso_2.validarCargaHorária(cargaHorária);
		this.cargaHorária = cargaHorária;
	}
	
	//
	//Métodos
	//
	
	public static void validarCodigo(int codigo) throws ModelException  {
		if(codigo < 0 && codigo > 100)
			throw new ModelException("O número do código deve estar entre 1 e 99");
			
	}
	
	public static void validarNome( String nome) throws ModelException {
		if(nome== null || nome.equals(""))
			throw new ModelException("O nome deve haver ao menos 1 caractere");
		if(nome.length() > Tam_Max) 
			throw new ModelException("O limte de caractere foi ultrapsassado(25)");
	}
		
	public static void validarCargaHorária (int cargaHorária) throws ModelException {
		if(cargaHorária<= 2000 && cargaHorária > 8000 )
			throw new ModelException("A carga horária deve ser de igual ou maior a 2000 e menor do que 8000");
		
	}
		
		
					
}
	
	


