/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula enumeração
 */

public class Main {

	public static void main(String[] args) {
//CRIO O OBJETO LIVRO
		Livro livro = new Livro(1, "O mistério da cripta amaldiçoada", "Eduardo Mendonza", 1);	
		System.out.println(livro);

//CHAMA O MÉTODO QUE EMPRESTA O LIVRO
		livro.EmprestarLivro();
		System.out.println(livro);
		
	}

}
