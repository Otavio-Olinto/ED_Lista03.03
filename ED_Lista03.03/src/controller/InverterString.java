package controller;

public class InverterString {

	public InverterString() {
		super();
	}
	
	public String inverter(String palavra, int ind, int fim) {
		
		String letra;
		
		// A função substring() retorna uma string menor de acordo com o indice entre os 
		// parenteses. Caso este retorno seja vazio(""), significa que a string atingiu seu fim
		// Portanto este será nossa condição de parada, quando o retorno da substring for ""
		// a recursiva também retornará ""
		if(palavra.substring(ind)=="") return "";
		
		letra = palavra.substring(ind, fim);
		
		// Para inverter a ordem a String recebida, basta inverter a ordem que a letra atual
		// estará no retorno concatenado.
		// É necessário adicionar um fim na substring para que ela não retorne mais 
		// do que uma letra.
		return inverter(palavra, ind+1, fim+1)+letra;
	}

}
