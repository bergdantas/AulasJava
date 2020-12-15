/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula String
 */

package operacoesComStrings;

public class Main {

	public static void main(String[] args) {

		
		//CRIO UMA STRING
		String original = "abcde FGHIJ ABC abc DEFGH    ";
		System.out.println("A string original é : " + original);
		

		//COMPARO STRINGS COM O OPERADOR ==
		if(original == "abcde FGHIJ ABC abc DEFGH    ") {
			System.out.println("As Strings são iguais");
		}else {
			System.out.println("As Strings não são iguais");
		}


		//COMPARO STRINGS COM A FUNÇÃO EQUALS 		
		if(original.equals("abcde FGHIJ ABC abc DEFGH   ")) { //removi um espaço do final para ser diferente
			System.out.println("As Strings são iguais");
		}else {
			System.out.println("As Strings não são iguais");
		}


		//COMPARO STRINGS COM A FUNÇÃO EQUALSIGNORECASE, QUE IGNORA O CASE 		
		if(original.equalsIgnoreCase("abcde fghij abc abc defgh    ")) { 
			System.out.println("As Strings são iguais");
		}else {
			System.out.println("As Strings não são iguais");
		}


		//TRANSFORMO CARACTERES EM MINUSCULOS	
		String stringToLowerCase = original.toLowerCase();
		System.out.println("toLowerCase: " + stringToLowerCase);


		//TRANSFORMO CARACTERES EM MAIUSCULOS			
		String stringToUpperCase = original.toUpperCase();
		System.out.println("toUpperCase: " + stringToUpperCase);


		//ELIMINO ESPAÇOS EM BRANCO NO INICIO E FIM DA STRING		
		String stringTrim = original.trim(); 
		System.out.println("trim: " + stringTrim);


		//CORTO A STRING, PASSANDO A POSIÇÃO INCIAL 
		String stringSubstringI = original.substring(2); 
		System.out.println("substring(2): " + stringSubstringI);
		

		//CORTO A STRING, PASSANDO AS POSIÇOES INCIAL E FINAL  	
		String stringSubstringIF = original.substring(2,9); 
		System.out.println("substring(2,9): " + stringSubstringIF);
		

		//SUBSTITUO UMA LETRA
		String stringReplaceChar = original.replace('a','x'); 
		System.out.println("Replace(a,x): " + stringReplaceChar);
		

		//SUBSTITUO UMA SUBSTRING
		String stringReplaceString = original.replace("abc","xyz"); 
		System.out.println("Replace(abc,xyz): " + stringReplaceString);


		//BUSCO A POSIÇÃO INICIAL DE UMA SUBSTRING
		int i = original.indexOf("bc");
		System.out.println("indexOf(bc): " + i);


		//BUSCO A POSIÇAO FINAL DE UMA SUBSTRING
		int j = original.lastIndexOf("bc");
		System.out.println("lastIndexOf(bc): " + j);


		//OTIMIZANDO A BUSCA
		char busca = 'a';
		int inicio = 0;
		int posicao = original.indexOf(busca);
		System.out.println("Existe a nas posições: ");
		while (inicio < original.length() && posicao != -1) {
			System.out.println(posicao);
			inicio = posicao + 1;
			posicao = original.indexOf(busca, inicio);
		}	
		

		//DIVIDO A STRING EM VARIAS SUBSTRINGS, SEMPRE QUE ACHAR O MARCADOR <space> (" ")
		String[] vect = original.split(" ");
		String  p1 = vect[0];
		String  p2 = vect[1];
		String  p3 = vect[2];
		String  p4 = vect[3];
		String  p5 = vect[4];
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);		


		//CONVERTO UMA STRING PARA UM VETOR DE CARACTERES
		String p6 = "teste conversão: ";
		char[] p6inChar = p6.toCharArray();
		System.out.print(p6inChar);
		System.out.print(p6.length() + " " + p6.charAt(0)); //tamanho e primeiro elemento do vetor 
	}
}