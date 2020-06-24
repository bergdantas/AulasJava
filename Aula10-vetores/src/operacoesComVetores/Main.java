/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas com orientação a objetos)
 * Vetores
 */

package operacoesComVetores;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//DECLARA O VETOR		
		Aluno[] vetAlunos = new Aluno[10];

//ENTRADA DE DADOS		
		int nQuartosAlugados;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de apartamento alugados ");
		nQuartosAlugados = entrada.nextInt();
		
		for (int i=0; i<nQuartosAlugados; i++){		
			System.out.println("Digite o número do quarto ");
			int nQuarto = entrada.nextInt(); 
			System.out.println("Digite o nome do estudante ");			
			String nomeAluno = entrada.next(); 
			System.out.println("Digite o e-mail do estudante ");
			String email = entrada.next(); 
			vetAlunos[nQuarto] = new Aluno(nomeAluno, email);
		}
	
//ESCREVE O VETOR DE ALUNOS, NAS POSIÇÕES QUE EXISTE ALGO
		for (int i=0; i<vetAlunos.length; i++){		
			if(vetAlunos[i] != null) {
				System.out.println(i + " " + vetAlunos[i].getNome() + " " + vetAlunos[i].getEmail());
			}
		}
		entrada.close();
	}
}
