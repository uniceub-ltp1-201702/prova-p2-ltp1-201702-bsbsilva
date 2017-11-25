package view;

import javax.swing.JOptionPane;

public class viewSolicitarEsportes {

	private String esporte;

	public viewSolicitarEsportes() {

		esporte = JOptionPane.showInputDialog("Infome o nome do Esporte: ");
	}

	public String getEsporte() {
		return esporte;
	}
}