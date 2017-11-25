// Quest�o 4a: Crie uma funcionalidade que solicita do usu�rio o nome de um pa�s e retorne
// adiferen�a de medalhas de ouro, de prata e de bronze desse pa�s em rela��o aos EUA, 
// conforme os dados importados dos arquivos.

package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Medalhas;
import view.viewDiferen�a;
import view.viewSolicitaPais;

public class ControleDiferencaEUA {

	private BDSimulado bds;

	public ControleDiferencaEUA(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void DiferencaPais() {

		int diferen�aOuro = 0;
		int diferen�aPrata = 0;
		int diferen�aBronze = 0;
		ArrayList<Medalhas> medalhas = bds.getMedalhas();

		viewSolicitaPais sp = new viewSolicitaPais();
		String pais = sp.getPais();

		String q = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equals(pais)) {
				diferen�aOuro = medalhas.get(i).getQuantidadedeOuro() - medalhas.get(0).getQuantidadedeOuro();
				diferen�aPrata = medalhas.get(i).getQuantidadedePrata() - medalhas.get(0).getQuantidadedePrata();
				diferen�aBronze = medalhas.get(i).getQuantidadedeBronze() - medalhas.get(0).getQuantidadedeBronze();
				q += "A diferen�a de Medalha entre " + pais + " e  os " + medalhas.get(0).getPais()
						+ "\n - Qtd Medalhas de Ouro: " + diferen�aOuro + "\n - Qtd Medalhas de Prata: "
						+ diferen�aPrata + "\n - Qtd Medalhas de Bronze: " + diferen�aBronze;
			}
		}

		viewDiferen�a vde = new viewDiferen�a(q);
	}

}