package controller;

import java.util.Scanner;

import model.ModelException;
import model.Curso_2;
import model.Disciplina_2;
public class CtrlPrograma {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Curso_2 c1;
		Disciplina_2 d1;
//		
//		while(true) {
//			System.out.println("Entre com o nome do curso");
//			String nome= teclado.nextLine();
//			System.out.println("Digite o código do curso ");
//			int codigoC = teclado.nextInt();
//			System.out.println("Digite a carga horária do curso");
//			int cargaH= teclado.nextInt();
//			
//			try {
//				
//				c1= new Curso_2(codigoC,nome,cargaH);
//				System.out.println(c1);
//				break;
//				
//			} catch (ModelException me) {
//				System.out.println("Deu erro:" + me.getMessage());
//				System.out.println("Tente novamente!!");
//				
//			}
//			
//			
//		}
//		
//		System.out.println("O nome de c1 é:" + c1.getNome());
//		System.out.println("O código de c1 é:" + c1.getCodigo());
//		System.out.println("A carga horária do curso é:" + c1.getCargaHorária());
		
		
		
		while(true) {
			System.out.println("Entre com o nome da disciplina");
			String nomeD= teclado.nextLine();
			System.out.println("Digite o código da disciplina ");
			String codigoD = teclado.nextLine();
			System.out.println("Digite o número de créditos da sua disciplina");
			int numCre= teclado.nextInt();
			
			try {
				d1= new Disciplina_2(codigoD,nomeD,numCre);
				System.out.println(d1);
				break;
				
			}catch(ModelException me){
				System.out.println("Deu erro:" + me.getMessage());
				System.out.println("Tente novamente!!");

				
			}
			
		}
		
		System.out.println("O nome de d1 é:" + d1.getNome());
		System.out.println("O código de d1 é:" + d1.getCódigo());
		System.out.println("O número d3e créditos é:" + d1.getNumCréditos());
		
		
	}

}
