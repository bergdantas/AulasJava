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
		System.out.println("Original: " + original);
		
//TRANSFORMO CARACTERES EM MINUSCULOS	
		String stringToLowerCase = original.toLowerCase();
		System.out.println("toLowerCase: " + stringToLowerCase);

//TRANSFORMO CARACTERES EM MAIUSCULOS			
		String stringToUpperCase = original.toUpperCase();
		System.out.println("toUpperCase: " + stringToUpperCase);

//ELIMINA ESPAÇOS EM BRANCO NO INICIO E FIM DA STRING		
		String stringTrim = original.trim(); 
		System.out.println("trim: " + stringTrim);

//CORTA A STRING, PASSANDO A POSIÇÃO INCIAL 
		String stringSubstringI = original.substring(2); 
		System.out.println("substring(2): " + stringSubstringI);
		
//CORTA A STRING, PASSANDO AS POSIÇOES INCIAL E FINAL  	
		String stringSubstringIF = original.substring(2,9); 
		System.out.println("substring(2,9): " + stringSubstringIF);
		
//SUBSTITUI UMA LETRA
		String stringReplaceChar = original.replace('a','x'); 
		System.out.println("Replace(a,x): " + stringReplaceChar);
		
//SUBSTITUI UMA SUBSTRING
		String stringReplaceString = original.replace("abc","xyz"); 
		System.out.println("Replace(abc,xyz): " + stringReplaceString);

//DESCOBRE A POSIÇÃO INICIAL DE UMA SUBSTRING
		int i = original.indexOf("bc");
		System.out.println("indexOf(bc): " + i);

//DESCOBRE A POSIÇAO FINAL DE UMA SUBSTRING
		int j = original.lastIndexOf("bc");
		System.out.println("lastIndexOf(bc): " + j);

//DIVIDE A STRING EM VARIAS SUBSTRINGS, SEMPRE QUE ACHAR O MARCADOR <space> (" ")
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
	}
}