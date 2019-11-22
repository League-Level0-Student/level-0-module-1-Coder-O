package _02_unbirthday;

import java.sql.Date;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class hnubYug {

	public static void main(String[] args) {
		String birthdate = JOptionPane.showInputDialog("What is your date of birth? Please awnser in mm/dd format. Ex: 11/09");
		if (birthdate.equals(LocalDate.now())) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		}

	}

}
