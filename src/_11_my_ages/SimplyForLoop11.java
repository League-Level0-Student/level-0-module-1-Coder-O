package _11_my_ages;

import javax.swing.JOptionPane;

public class SimplyForLoop11 {

	public static void main(String[] args) {
		int m = Integer.parseInt(JOptionPane.showInputDialog("What is you're current age? Please only enter a whole number."));
		for (int i = 1; i <= m; i++) {
			JOptionPane.showMessageDialog(null, i);
		}

	}

}
