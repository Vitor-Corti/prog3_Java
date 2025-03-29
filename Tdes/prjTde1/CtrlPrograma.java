package controller;


import java.util.stream.IntStream;

import javax.swing.JOptionPane;

public class CtrlPrograma {
	
	

	public static void main(String[] args) {
        int res = validarCPF(JOptionPane.showInputDialog("Informe o CPF"), true);
        JOptionPane.showMessageDialog(null, "CPF " + (res == 1 ? "válido" : res == 0 ? "inválido" : "Formato errado"));
    }
    //para iniciar a validação marque como true
    private static int validarCPF(String cpf, boolean inicio) {
        
        if (cpf.matches("\\d{11}")) {
            boolean excecao = IntStream.range(0, 9).boxed().filter(num -> (((11111111111L*num) + "").equals(cpf))).findFirst().orElse(-1) != -1;            
            int soma = 0, peso = inicio ? 10 : 11;
            //somando os digitos por um peso decrescente
            for (int i = 0; i < (inicio ? 9 : 10); i++) {
                soma += Integer.parseInt(cpf.charAt(i) + "") * peso--;
            }
            //calculando o resto
            peso = soma * 10 % 11 == 10 ? 0 : soma * 10 % 11;
            //se inicio = true a validação ocorre no index 9 do array, se não no index 11
            return excecao || !(peso + "").equals(cpf.charAt(inicio ? 9 : 10) + "") ? 0 : inicio ? validarCPF(cpf, false) : 1;
        } else {
            return 3;
        }
    }
    
}