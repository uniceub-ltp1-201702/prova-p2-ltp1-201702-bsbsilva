package model;

public class Esportes {

	// Atributos
	private String esportes;
	private String modalidade;
	
	// Metodo ToString
		@Override
		public String toString() {
			return "Esportes: " + esportes + " - " + "Modalidade: " + modalidade;
	
		}
	// Metodo Construtor
		public Esportes(String esporte, String modalidade) {
			super();
			this.esportes = esportes;
			this.modalidade = modalidade;
		}

		// gets e sets 
		public String getEsportes() {
			return esportes;
		}

		public void setEsporte(String esporte) {
			this.esportes = esportes;
		}

		public String getModalidade() {
			return modalidade;
		}

		public void setModalidade(String modalidade) {
			this.modalidade = modalidade;
		}

	}


