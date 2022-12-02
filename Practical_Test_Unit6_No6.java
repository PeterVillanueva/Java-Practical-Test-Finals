package villanueva_package_PracticalTestUnit6;

import javax.swing.JOptionPane;

public class Practical_Test_Unit6_No6 {

	public static void main(String[] args) {
		
		String input =
				JOptionPane.showInputDialog("Input the number");
		int day = Integer.parseInt(input);
		System.out.println(getDayName(day));
		
	}
	public static String getDayName(int day) {
	String dayName = "";
	switch (day) {
	case 1: dayName= "Monday";
	break;
	case 2: dayName= "Tuesday";
	break;
	case 3: dayName= "Wednesday";
	break;
	case 4: dayName= "Thursday";
	break;
	case 5: dayName= "Friday";
	break;
	case 6: dayName= "Saturday";
	break;
	case 7: dayName= "Sunday";
	break;
	default: dayName= "Invalid Input";
	
	}
	return dayName;
	

}
}
