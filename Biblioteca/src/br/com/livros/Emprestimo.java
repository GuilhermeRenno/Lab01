package br.com.livros;

import java.time.LocalDate;
import java.time.Period;

public class Emprestimo {
		private Livro livro;
		private LocalDate dataEmprestimo;
		private LocalDate dataDevolucao;
		
		public void construtor(Livro livro,LocalDate dataEmprestimo,LocalDate dataDevolucao){
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
		void diasRestante(Period period) {
			
			if (dataDevolucao.isBefore(LocalDate.now())){
				System.out.println("O livro ja foi devolvido");
			}
			else {
			period = Period.between(LocalDate.now(), dataDevolucao);
			System.out.println("Faltam" + period + "dias ate a devolucao");
			}
		}
		public boolean atrasado() {
			return LocalDate.now().isAfter(dataDevolucao);
		}
	
	}

