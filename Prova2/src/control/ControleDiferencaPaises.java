// Questão 4b: Crie uma funcionalidade que solicita do usuário o nome de dois países
// e exiba a diferença total de medalhas entre eles.


package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Medalhas;
import view.viewDiferença;
import view.viewSolicitaPais;

public class ControleDiferencaPaises {

	private BDSimulado bds;

	public ControleDiferencaPaises(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void DiferencaPaises() {

		int diferençaOuroPais1 = 0;
		int diferençaPrataPais1 = 0;
		int diferençaBronzePais1 = 0;
		// -------------------------
		int diferençaOuroPais2 = 0;
		int diferençaPrataPais2 = 0;
		int diferençaBronzePais2 = 0;
		// -------------------------

		ArrayList<Medalhas> medalhas = bds.getMedalhas();

		// solicitar pais
		viewSolicitaPais sp1 = new viewSolicitaPais();
		String pais1 = sp1.getPais();

		
		//outro pais 
		viewSolicitaPais sp2 = new viewSolicitaPais();
		String pais2 = sp2.getPais();

		String q = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equals(pais1)) {
				diferençaOuroPais1 = medalhas.get(i).getQuantidadedeOuro();
				diferençaPrataPais1 = medalhas.get(i).getQuantidadedePrata();
				diferençaBronzePais1 = medalhas.get(i).getQuantidadedeBronze();
			}

			if (medalhas.get(i).getPais().equals(pais1)) {
				diferençaOuroPais2 = medalhas.get(i).getQuantidadedeOuro();
				diferençaPrataPais2 = medalhas.get(i).getQuantidadedePrata();
				diferençaBronzePais2 = medalhas.get(i).getQuantidadedeBronze();
			}

		}

		diferençaOuroPais2 -= diferençaOuroPais1;
		diferençaPrataPais2 -= diferençaPrataPais1;
		diferençaBronzePais2 -= diferençaBronzePais1;

		q += "A diferença de Medalha entre " + pais1 + " e " + pais2 + "\n - Qtd Medalhas de Ouro: "
				+ diferençaOuroPais2 + "\n - Qtd Medalhas de Prata: " + diferençaPrataPais2
				+ "\n - Qtd Medalhas de Bronze: " + diferençaBronzePais2;

		viewDiferença vde = new viewDiferença(q);
	}

}
