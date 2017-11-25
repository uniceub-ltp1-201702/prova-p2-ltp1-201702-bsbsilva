// Questão 4a: Crie uma funcionalidade que solicita do usuário o nome de um país e retorne
// adiferença de medalhas de ouro, de prata e de bronze desse país em relação aos EUA, 
// conforme os dados importados dos arquivos.

package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Medalhas;
import view.viewDiferença;
import view.viewSolicitaPais;

public class ControleDiferencaEUA {

	private BDSimulado bds;

	public ControleDiferencaEUA(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void DiferencaPais() {

		int diferençaOuro = 0;
		int diferençaPrata = 0;
		int diferençaBronze = 0;
		ArrayList<Medalhas> medalhas = bds.getMedalhas();

		viewSolicitaPais sp = new viewSolicitaPais();
		String pais = sp.getPais();

		String q = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equals(pais)) {
				diferençaOuro = medalhas.get(i).getQuantidadedeOuro() - medalhas.get(0).getQuantidadedeOuro();
				diferençaPrata = medalhas.get(i).getQuantidadedePrata() - medalhas.get(0).getQuantidadedePrata();
				diferençaBronze = medalhas.get(i).getQuantidadedeBronze() - medalhas.get(0).getQuantidadedeBronze();
				q += "A diferença de Medalha entre " + pais + " e  os " + medalhas.get(0).getPais()
						+ "\n - Qtd Medalhas de Ouro: " + diferençaOuro + "\n - Qtd Medalhas de Prata: "
						+ diferençaPrata + "\n - Qtd Medalhas de Bronze: " + diferençaBronze;
			}
		}

		viewDiferença vde = new viewDiferença(q);
	}

}