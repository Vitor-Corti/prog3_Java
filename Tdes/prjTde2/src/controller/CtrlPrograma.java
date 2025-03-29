package controller;


/*Você deverá criar um novo projeto onde vamos ter as classes de dados Curso e Disciplina.
  Os atributos de Curso são: int código (número maior que zero e menor que 100), String nome (com até 25 caracteres) e
  int cargaHorária (número maior ou igual a 2000 e menor que 8000).
 * Já Disciplina tem os seguintes atributos: String código (String com exatamente 7 caracteres alfanuméricos), 
  String nome (String com até 40 caracteres alfanuméricos e espaço em branco) e int numCréditos (inteiro maior ou igual a zero e menor ou igual a 8).
  Adicione às classes os métodos get/set, além dos métodos de validação.

Crie a classe CtrlPrograma que instancie dois objetos Curso e dois objetos Disciplina. 
Chame os métodos get e set para esses objetos e represente duas situações onde os métodos set não faram a promoção da atribuição 
por invalidar os valores passados por parâmetro.

Na postagem deste TDE, anexe os arquivos das classes Curso, Disciplina e CtrlPrograma.*/

import model.Curso;
import model.Disciplina;
public class CtrlPrograma {

	public static void main(String[] args) {
		Curso c1= new Curso(14,"Sistemas",3000);
		Curso c2 = new Curso(43, "Engenharia", 777);
		Disciplina d1= new Disciplina("23f","java aplicattion",5);
		Disciplina d2= new Disciplina("2rt","pyton",9);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("o Curso de c1 é: " + c1.getNome());
		System.out.println("sua carga horária é:" + c1.getCargaHorária());
		System.out.println("o Curso de c2 é: " + c2.getNome());
		System.out.println("sua carga horária é:" + c2.getCargaHorária());
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(" a disciplina de d1 é: " + d1.getNome());
		System.out.println("seu número de créditos é:" + d1.getNumCréditos());
		System.out.println(" a disciplina  de d2 é: " + d2.getNome());
		System.out.println("o seu código é:" + d2.getCódigo());
		
		
		Curso c3= c1;
		
		c3.setCargaHorária(4);
		
		System.out.println("a carga horária do objeto apontado por c1, foi alterado pelo pnteiro c3");
		System.out.println("A carga horária atual é " + c1.getCargaHorária());
		
		Disciplina d3 = d1;
		
		d3.setNumCréditos(6);
		System.out.println("O num de créditos do objeto apontado por d1, foi alterado pelo ponteito d3 ");
		System.out.println("O número de créditos atual é:" + d1.getNumCréditos());

	}

}
