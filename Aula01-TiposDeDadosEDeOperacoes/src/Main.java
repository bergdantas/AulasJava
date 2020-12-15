/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula tipos de dados e operações 
 */
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		//TIPOS DE DADOS - byte (1 byte), short (2 bytes),  int (4 bytes),  long (8 bytes),  float (4 bytes),  double (8 bytes),  char (1 byte),  boolean (4 bytes).
		int numeroInteiro;
		float numeroDecimalComPrecisaoSimples;
		double numeroDecimalComPrecisaoDupla;
		char caractere;
		boolean valorBooleano;
		
		
		//OPERAÇÕES ARITMÉTICAS
		numeroInteiro = 587 + 345;
		numeroDecimalComPrecisaoSimples = (float) (numeroInteiro-1.90); //casting
		numeroDecimalComPrecisaoDupla = numeroDecimalComPrecisaoSimples %  5;
		numeroDecimalComPrecisaoDupla = numeroDecimalComPrecisaoSimples /  5;
		numeroDecimalComPrecisaoDupla = numeroDecimalComPrecisaoDupla * numeroInteiro;
		System.out.println(numeroInteiro + numeroDecimalComPrecisaoSimples + numeroDecimalComPrecisaoDupla);
		
		
		//OPERAÇÕES RELACIONAIS (< > <= >= =!)
		valorBooleano = numeroInteiro == numeroDecimalComPrecisaoSimples;
		System.out.println(valorBooleano);
		valorBooleano = numeroInteiro != numeroDecimalComPrecisaoSimples;
		System.out.println(valorBooleano);
		valorBooleano = numeroInteiro < numeroDecimalComPrecisaoSimples;
		System.out.println(valorBooleano);
		valorBooleano = numeroInteiro <= numeroDecimalComPrecisaoSimples;
		System.out.println(valorBooleano);
		valorBooleano = numeroInteiro > numeroDecimalComPrecisaoSimples;
		System.out.println(valorBooleano);
		valorBooleano = numeroInteiro >= numeroDecimalComPrecisaoSimples;
		System.out.println(valorBooleano);
		
		
		// PROPOSIÇÕES and, or E not 
		valorBooleano = numeroInteiro == numeroDecimalComPrecisaoSimples && numeroInteiro != numeroDecimalComPrecisaoSimples;
		System.out.println("&&: " + valorBooleano);
		valorBooleano = numeroInteiro == numeroDecimalComPrecisaoSimples || numeroInteiro != numeroDecimalComPrecisaoSimples;
		System.out.println("||: " + valorBooleano);
		valorBooleano = !(numeroInteiro == numeroDecimalComPrecisaoSimples);
		System.out.println("!: " + valorBooleano);
		
		
		//ENTRADA DE DADOS 
		/** 
		 * Se eu quiser que as variáveis numéricas sejam escritas com 'ponto' e não com 'vírgula', devo usar:
		 * Locale.setDefault(Locale.US);
		 * e importar a biblioteca
		 * import java.util.Locale;
		 */
		System.out.println("Digite um símbolo");
		Scanner ouvido = new Scanner(System.in);
		caractere = ouvido.next().charAt(0);		
		System.out.println("O caractere digitado foi: " + caractere);
		ouvido.close();
	}
}