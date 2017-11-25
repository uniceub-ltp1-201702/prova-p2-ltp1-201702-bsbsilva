package model;

public class Medalhas {

	// Atributos
	private String pais;
	private int QuantidadedeOuro;
	private int QuantidadedePrata;
	private int QuantidadedeBronze;
	private int Classificacao;
	
	
	
	
	// Metodo ToString
		@Override
		public String toString() {
			return "<<< Quadro de Medalhas >>> \nPaís: " + pais + " - Qtd Melhas de Ouro: " + QuantidadedeOuro
					+ " - Qtd Melhas de Prata: " + QuantidadedePrata + " - Qtd Melhas de Bronze: " + QuantidadedeBronze + "- Classificacao: "
					+ Classificacao;
		}



	
	public Medalhas(String pais, int quantidadedeOuro, int quantidadedePrata, int quantidadedeBronze,
			int classificacao) {
		super();
		this.pais = pais;
		QuantidadedeOuro = quantidadedeOuro;
		QuantidadedePrata = quantidadedePrata;
		QuantidadedeBronze = quantidadedeBronze;
		Classificacao = classificacao;
	}



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public int getQuantidadedeOuro() {
		return QuantidadedeOuro;
	}



	public void setQuantidadedeOuro(int quantidadedeOuro) {
		QuantidadedeOuro = quantidadedeOuro;
	}



	public int getQuantidadedePrata() {
		return QuantidadedePrata;
	}



	public void setQuantidadedePrata(int quantidadedePrata) {
		QuantidadedePrata = quantidadedePrata;
	}



	public int getQuantidadedeBronze() {
		return QuantidadedeBronze;
	}



	public void setQuantidadedeBronze(int quantidadedeBronze) {
		QuantidadedeBronze = quantidadedeBronze;
	}



	public int getClassificacao() {
		return Classificacao;
	}



	public void setClassificacao(int classificacao) {
		Classificacao = classificacao;
	}

}