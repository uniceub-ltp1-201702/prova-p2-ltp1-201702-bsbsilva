package view;

import javax.swing.JOptionPane;

public class viewDiferen�a {

	public viewDiferen�a(String diferenca) {

		if (diferenca != "") {
			JOptionPane.showMessageDialog(null, diferenca);
		} else {
			JOptionPane.showMessageDialog(null, "Pa�s n�o encontrado");
		}

	}

}