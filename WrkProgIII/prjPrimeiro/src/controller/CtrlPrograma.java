package controller;

import java.util.Scanner;

public class CtrlPrograma {

	public static boolean ehPar(int numero) {
		if(numero % 2 == 0)
			return true;
		return false;
	}
	
	public static int contaVogais(String texto) {
		int contador = 0;
		for(int i = 0 ; i< texto.length() ; i++ ) {
			char c = texto.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
			contador++;
		}
		return contador;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//escrver sysout faz um System.out.println
		
		/*int i = 10;
		System.out.println(i);
		i= i * 2;
		System.out.println("A variável 'i' está com o valor = " + i);
		
		
		for(int i = 1 ; i <= 10 ; i++ ) 
			if(i % 2 == 0) 
				System.out.println(i + " é um número par!");
		    else
				System.out.println(i + " é um número ímpar");
				*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o texto");
		String frase= teclado.nextLine();
		System.out.println("O texto possui" + contaVogais(frase) + " vogais!");
		
		System.out.print("Entre com um valor");
		int valor = teclado.nextInt();
		if(ehPar(valor))
			System.out.println(valor + " é um numero par!");
		else
			System.out.println(valor + " é um número ímpar");
		
		// ctrl + shft + o traz os importes 
		// Scanner é uma clase para pegar info do teclado
		// nextInt para ler valores inteiros
		// nextLine para ler strings
		
		
		
	}
}
		
		
	




