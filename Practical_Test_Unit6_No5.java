package villanueva_package_PracticalTestUnit6;

import javax.swing.JOptionPane;

public class Practical_Test_Unit6_No5 {

	public static void main(String[] args) {
		
		String input =
				JOptionPane.showInputDialog("Input the number(Table to be calculated)");
		
		int num = Integer.parseInt(input);
		for(int i = 1; i <=num;i++)
		{
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
	}

}
