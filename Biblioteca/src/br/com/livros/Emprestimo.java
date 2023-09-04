package br.com.livros;

import java.time.LocalDate;
import java.time.Period;

public class Emprestimo {
		private Livro livro;
		LocalDate dataEmprestimo;
		LocalDate dataDevolucao;
		
		public void constructor(Livro livro,LocalDate dataEmprestimo,LocalDate dataDevolucao){
			this.livro = livro;
			this.dataEmprestimo = dataEmprestimo;
			this.dataDevolucao = dataDevolucao;
		}
		public Livro getLivro() {
			return livro;
		}
		public void setLivro(Livro livro) {
			this.livro = livro;
		}
		public LocalDate getdataEmprestimo() {
			return dataEmprestimo;
		}
		public void setdataEmprestimo(LocalDate dataEmprestimo){
			this.dataEmprestimo = dataEmprestimo;
		}
		public LocalDate getdataDevolucao() {
			return dataDevolucao;
		}
		public void setdataDevolucao(LocalDate dataDevolucao) {
			this.dataDevolucao = dataDevolucao;
		}
		void diasRestante(Period period, LocalDate dataAtual) {
			
			if (dataDevolucao.isBefore(LocalDate.now())){
				System.out.println("O livro ja foi devolvido");
			}
			else {
			period = Period.between(LocalDate.now(), dataDevolucao);
			System.out.println("Faltam" + period + "dias ate a devolucao");
			}
		}
		public void main(String[]args) {
			
		}
}
