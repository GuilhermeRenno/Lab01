package br.com.livros;

public class Livro {

	private int Codigo;
	private static String Titulo;
	private String Autor;
	private boolean estaEmprestado;
	
	public void construtorLivro(int Codigo, String Titulo,String Autor, boolean estaEmprestado) {
		this.Codigo = Codigo;
		Livro.Titulo = Titulo;
		this.Autor = Autor;
		this.estaEmprestado = estaEmprestado;
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int Codigo) {
		this.Codigo = Codigo;
	}
	//
	public String setTitulo(String Titulo) {
		return Livro.Titulo = Titulo;
	}
	public String getTitulo() {
		return Titulo;
	}
	//
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String Autor) {
		this.Autor = Autor;
	}
	//
	public void setestaEmprestado(boolean estaEmprestado) {
		this.estaEmprestado = estaEmprestado;
	}
	public boolean getestaEmprestado() {
		return estaEmprestado;
	}
	//
	public void emprestar() {
		if (estaEmprestado==true) {
			System.out.println("O livro já esta emprestado"); 
		}
		else {
			System.out.println("livro emprestado com sucesso!!"); 
			this.estaEmprestado=true;
		}
	}
	public void devolver() {
		if (estaEmprestado==true) {
				System.out.println("Devolvido com sucesso!!!!"); 
				this.estaEmprestado=false;
			}
		else {
			System.out.println("O livro não esta emprestado!!!!"); 
		}	
	}
	public static void main(String[]args) {

		Livro livro1 = new Livro();
		Livro.Titulo= livro1.getTitulo();
		
		System.out.println(Livro.Titulo);
		
	}
}

