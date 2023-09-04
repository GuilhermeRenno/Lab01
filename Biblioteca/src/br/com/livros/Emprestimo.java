package br.com.livros;

public class Emprestimo {
		private Livro livro;
		private String dataEmprestimo;
		private String dataDevolucao;
		
		public Livro getLivro() {
			return livro;
		}
		public void setLivro(Livro livro) {
			this.livro = livro;
		}
		public String getdataEmprestimo() {
			return dataEmprestimo;
		}
		public void setdataEmprestimo(String dataEmprestimo){
			this.dataEmprestimo = dataEmprestimo;
		}
		public String getdataDevolucao() {
			return dataDevolucao;
		}
		public void setdataDevolucao(String dataDevolucao) {
			this.dataDevolucao = dataDevolucao;
		}
}
