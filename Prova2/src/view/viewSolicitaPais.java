package view;

import javax.swing.JOptionPane;

public class viewSolicitaPais {

	private String pais;

	public viewSolicitaPais() {
		pais = JOptionPane.showInputDialog("Infome o nome do Esporte: ");
	}

	public String getPais() {
		return pais;
	}
}