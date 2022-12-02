package villanueva_package_PracticalTestUnit6;

import javax.swing.*;

public class Practical_Test_Unit6_No4 {

	public static void main(String[] args) {
		String input =
		JOptionPane.showInputDialog("Input a Number.");

		System.out.print("Input: " + input);
		
		int num = Integer.parseInt(input);
		if (num > 0)
		{
			System.out.println("\nPositive Number");
		}
		else if (num < 0)
		{
			System.out.println("\nNegative Number");
		}
		else
		{
			System.out.println("\nNumber is Zero");
		}
		
	}
	
}
