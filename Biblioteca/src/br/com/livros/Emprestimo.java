package br.com.livros;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



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
		public long diasRestante() {
					if (dataDevolucao.isBefore(dataEmprestimo)){
						return 0;
			}
			else {
			long dias = ChronoUnit.DAYS.between(dataEmprestimo,dataDevolucao);
			 return dias;
			}
		}
		public String atrasado() {
			boolean atr = LocalDate.now().isAfter(dataDevolucao);
			if(atr == false) {
				return "Nao";
			}else {
				return "Sim";
			}
		}
	
	}

