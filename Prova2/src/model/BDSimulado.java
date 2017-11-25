package model;

import java.util.ArrayList;

import util.DocumentReader;

public class BDSimulado {

	// Atributo
	private ArrayList<Esportes> esportes;
	private ArrayList<Medalhas> medalhas;
	private String fileEsportes = "esportes.txt";
	private String FileMedalhas = "medalhas.txt";

	// Metodo Construtor
	public BDSimulado() {

		// Instancia ArrayList
		this.esportes = new ArrayList<Esportes>();
		this.medalhas = new ArrayList<Medalhas>();

		// Instanciar o DocumentReader
		DocumentReader dr1 = new DocumentReader();
		DocumentReader dr2 = new DocumentReader();

		// Ler linhas do arquivo esportes.txt
		ArrayList<String> leitura1 = dr1.read(fileEsportes);

		// Ler linhas do arquivo medalhas.txt
		ArrayList<String> leitura2 = dr2.read(FileMedalhas);

		

		// Percorre o ArrayList Criando esportes
		for (int i = 0; i < leitura1.size(); i++) {
			String[] linhaEsportes = leitura1.get(i).split(";");

			// Cria esporte com os dados da linha
			Esportes e1 = new Esportes(linhaEsportes[0], linhaEsportes[1]);

			// coloca o esporte no Arraylist
			this.esportes.add(e1);
		}

		// Percorre o Arraylist criando medalha
		for (int i = 0; i < leitura2.size(); i++) {

			// Separa a linha em um array de String
			String[] linhaMedalhas = leitura2.get(i).split(";");

			// Cria Musica com dados da linha
			Medalhas m1 = new Medalhas(linhaMedalhas[0], Integer.parseInt(linhaMedalhas[1]),
					Integer.parseInt(linhaMedalhas[2]), Integer.parseInt(linhaMedalhas[3]),
					Integer.parseInt(linhaMedalhas[4]));

			// Coloca Medalhas no ArrayList
			this.medalhas.add(m1);
		}
	}

	public ArrayList<Esportes> getEsportes() {
		return esportes;
	}

	public ArrayList<Medalhas> getMedalhas() {
		return medalhas;
	}

}
