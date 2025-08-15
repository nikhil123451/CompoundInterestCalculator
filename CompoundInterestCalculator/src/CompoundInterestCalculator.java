import java.util.Scanner;

public class CompoundInterestCalculator {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Initial Amount: ");
		double initialInterestAmount = scn.nextDouble();
		System.out.print("Annual Interest Rate (as a decimal): ");
		double interestRate = scn.nextDouble();
		System.out.print("Contributions? (Y/N): ");
		String contributionStatus = scn.next();
		
		double monthlyContribution = 0;
		boolean isContributing = contributionStatus.toUpperCase().contains("Y");
		if (isContributing) {
			System.out.print("Monthly Contributions: ");
			monthlyContribution = scn.nextDouble();
		}
		
		System.out.print("Years Saved: ");
		int years = scn.nextInt();
		
		double balance = initialInterestAmount;
		
		for (int year = 1 ; year <= years ; year++) {
			for (int month = 1 ; month <= 12 ; month++) { //12 months in a year
				balance += monthlyContribution;
				if (month == 12) { //end of the year
					balance *= 1 + interestRate;
				}
			}
		}
		
		System.out.printf("%.2f%n", balance); //round to 2 decimals
	}
}
