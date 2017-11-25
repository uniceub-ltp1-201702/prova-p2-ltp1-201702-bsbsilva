// Quest�o 4b: Crie uma funcionalidade que solicita do usu�rio o nome de dois pa�ses
// e exiba a diferen�a total de medalhas entre eles.


package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Medalhas;
import view.viewDiferen�a;
import view.viewSolicitaPais;

public class ControleDiferencaPaises {

	private BDSimulado bds;

	public ControleDiferencaPaises(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void DiferencaPaises() {

		int diferen�aOuroPais1 = 0;
		int diferen�aPrataPais1 = 0;
		int diferen�aBronzePais1 = 0;
		// -------------------------
		int diferen�aOuroPais2 = 0;
		int diferen�aPrataPais2 = 0;
		int diferen�aBronzePais2 = 0;
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
				diferen�aOuroPais1 = medalhas.get(i).getQuantidadedeOuro();
				diferen�aPrataPais1 = medalhas.get(i).getQuantidadedePrata();
				diferen�aBronzePais1 = medalhas.get(i).getQuantidadedeBronze();
			}

			if (medalhas.get(i).getPais().equals(pais1)) {
				diferen�aOuroPais2 = medalhas.get(i).getQuantidadedeOuro();
				diferen�aPrataPais2 = medalhas.get(i).getQuantidadedePrata();
				diferen�aBronzePais2 = medalhas.get(i).getQuantidadedeBronze();
			}

		}

		diferen�aOuroPais2 -= diferen�aOuroPais1;
		diferen�aPrataPais2 -= diferen�aPrataPais1;
		diferen�aBronzePais2 -= diferen�aBronzePais1;

		q += "A diferen�a de Medalha entre " + pais1 + " e " + pais2 + "\n - Qtd Medalhas de Ouro: "
				+ diferen�aOuroPais2 + "\n - Qtd Medalhas de Prata: " + diferen�aPrataPais2
				+ "\n - Qtd Medalhas de Bronze: " + diferen�aBronzePais2;

		viewDiferen�a vde = new viewDiferen�a(q);
	}

}
