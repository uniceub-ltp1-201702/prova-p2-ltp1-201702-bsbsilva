package view;

import javax.swing.JOptionPane;

public class viewEncontrarEsporte {

	@SuppressWarnings("unused")
	public viewEncontrarEsporte(String esportes) {

		if (esportes != "") {
			JOptionPane.showMessageDialog(null, esportes);
			viewPrincipal vp = new viewPrincipal();
		} else {
			JOptionPane.showConfirmDialog(null, "Esporte não cadastrado");
		}
	}

}