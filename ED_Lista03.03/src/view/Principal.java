/*
 * Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres  
(Ex.: entrada = teste ; saída = etset)
 */

package view;

import java.util.Scanner;
import controller.InverterString;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe InverterString
		InverterString metodo = new InverterString();
		
		// Criando o método de leitura com Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a palavra que deseja inverter: ");
		String invertida, palavra = ler.nextLine();
		
		invertida = metodo.inverter(palavra, 0, 1);
		System.out.println("A palavra "+palavra+" invertida é: "+invertida);
		
		ler.close();

	}

}
