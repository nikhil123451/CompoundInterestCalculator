import java.util.Scanner;

public class CompoundInterestCalculator {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Initial Amount: ");
		double ini = scn.nextDouble();
		System.out.print("Annual Interest Rate: ");
		double intRate = scn.nextDouble();
		System.out.print("Contributions? (Y/N): ");
		String contr = scn.next();
		
		double Mcontr = 0;
		boolean isContr = contr.toUpperCase().contains("Y");
		if (isContr) {
			System.out.print("Monthly Contributions: ");
			Mcontr = scn.nextDouble();
		}
		
		System.out.print("Years Saved: ");
		int years = scn.nextInt();
		
		double balance = ini;
		
		for (int year = 1 ; year <= years ; year++) {
			for (int month = 1 ; month <= 12 ; month++) { //12 months in a year
				balance += Mcontr;
				if (month == 12) { //end of the year
					balance *= 1 + intRate;
				}
			}
		}
		
		System.out.printf("%.2f%n", balance); //round to 2 decimals
	}
}
