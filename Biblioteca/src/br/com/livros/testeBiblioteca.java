package br.com.livros;

import java.time.LocalDate;

//import java.time.format.DateTimeFormatter;

public class testeBiblioteca {
//funcao metodo principal
	public static void main(String[]args) {
		Livro livro1 = new Livro();
		livro1.construtorLivro(0001, "Alto da compadecida", "Ariano Suasuna", false); 
		Emprestimo emprestimo1 = new Emprestimo();
		emprestimo1.construtor(livro1,LocalDate.now(),LocalDate.now().plusDays(3));
	//	System.out.println(emprestimo1.getdataEmprestimo());
		
		Livro livro2 = new Livro();
		livro2.construtorLivro(0001, "Filhos do eden", "Eduardo Spohr", false); 
		Emprestimo emprestimo2 = new Emprestimo();
		emprestimo2.construtor(livro2,LocalDate.now(),LocalDate.now().plusDays(7));
		
		livro1.emprestar();
		System.out.println("Dias restantes para devolucao do livro "+ livro1.getTitulo()+" : " + emprestimo1.diasRestante());	
		livro2.emprestar();
		System.out.println("Dias restantes para devolucao do livro "+ livro2.getTitulo()+" : " + emprestimo2.diasRestante());
		
		emprestimo1.getLivro().devolver();
		 System.out.println("Dias restantes para devolução do livro "+livro2.getTitulo()+" : " + emprestimo2.diasRestante());
	     System.out.println("Emprestimo está atrasado? " + emprestimo2.atrasado());
	}
	}

//


//DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/mm/yyyy");
//Ssdt1 = LocalDate.parse(dataDevolucao,formatadorBarra);
