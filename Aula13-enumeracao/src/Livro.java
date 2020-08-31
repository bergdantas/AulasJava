/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula enumeração
 */

public class Livro {
	private String titulo;
	private String autor;
	private double id;
	private Enum<EstatusDoLivro> status;
	private int qdeEmEstoque;

//CONSTRUTOR
	public Livro() {
		
	}		
	public Livro(double _id, String _titulo, String _autor, int _qdeEmEstoque) {
		autor=_autor;
		titulo=_titulo;
		setId(_id);
		status = EstatusDoLivro.DISPONIVEL;
		alterarQuantidadeDeLivro(_qdeEmEstoque);
	}

//MÉTODOS DA CLASSE
@Override	
	public String toString() {
		return autor
				+ " - "
				+ titulo 
				+ "["
				+ status
				+ "]";
	}
	
	public void EmprestarLivro() {
		status=EstatusDoLivro.EMPRESTADO;
	}
	
	public void alterarQuantidadeDeLivro(int quantidade) {
		qdeEmEstoque=+quantidade;
	}
//SETTERS E GETTERS
	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public int getQdeEmEstoque() {
		return qdeEmEstoque;
	}
	
}
