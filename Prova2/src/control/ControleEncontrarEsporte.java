//Questão 3:Concebaum conjunto de classes e funções quereceba do usuário o nome de um esporte e exiba uma coleção
//com todas as modalidades do esporte informado.

package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Esportes;
import view.viewEncontrarEsporte;
import view.viewSolicitarEsportes;

public class ControleEncontrarEsporte {

	private BDSimulado bds;

	public ControleEncontrarEsporte(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void BuscaModalidade() {

		ArrayList<Esportes> esportes = bds.getEsportes();

		viewSolicitarEsportes se = new viewSolicitarEsportes();

		String nomeEsporte = se.getEsporte();

		String e = "";
		for (int i = 0; i < esportes.size(); i++) {

			if (esportes.get(i).equals(nomeEsporte)) {
				e += "Esporte: " + esportes.get(i).getEsportes() + " - " + "Modalidade: "
						+ esportes.get(i).getModalidade();
			}
		}
		viewEncontrarEsporte ee = new viewEncontrarEsporte(e);

	}
}