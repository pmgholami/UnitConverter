
import java.util.Scanner;


public class unitConverter {

	public static void main(String[] args) {
		double x, y;
		System.out.println("Enter the value of KM/h: ");
		Scanner in = new Scanner(System.in);
		
		x = in.nextDouble();
		y = unitConversion(x);
		System.out.println("The converted result is: " + y);
	}
	
	public static double unitConversion(double n) {
		return n/3.6;
	}
}
