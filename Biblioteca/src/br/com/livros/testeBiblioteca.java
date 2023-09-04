package br.com.livros;

//import java.time.format.DateTimeFormatter;

public class testeBiblioteca {

	public void main(String[]args) {
		Livro livro1 = new Livro();
		livro1.construtorLivro(0001, "Alto da compadecida", "Ariano Suasuna", false); 
		Livro livro2 = new Livro();
		livro2.construtorLivro(0001, "Alto da compadecida", "Edua", false); 
	}
}




//DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/mm/yyyy");
//Ssdt1 = LocalDate.parse(dataDevolucao,formatadorBarra);
