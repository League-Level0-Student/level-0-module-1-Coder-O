package _99_extra;

import javax.swing.JOptionPane;

public class TestToMoveToMod2 {

	public static void main(String[] args) {
		String popUp = JOptionPane.showInputDialog("What is your favorite animal? Please respond with a single, singular word. (Ex:  not Dogs, but dog.)");
		if (popUp.equalsIgnoreCase("Dog")) {
			JOptionPane.showMessageDialog(null, "Dogs go woof.");
		}
		else if (popUp.equalsIgnoreCase("Cat")) {
			JOptionPane.showMessageDialog(null, "Cats go meow.");
		}
		else if (popUp.equalsIgnoreCase("Pufferfish")) {
			JOptionPane.showMessageDialog(null, "Pufferfish go glub.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You have chosen wrong.");
		}
	}

}
