//Nick Pompetti
//Matt Schlogel
import java.util.Scanner;


/*This program is a Retirement simulator. It will recieve user input for the amount of years the user wants to work,
 *average return on investment, how many years they want to draw and required income as well as SSI.
 *Variables:
 * years_retired, byte, the amount of years the user wants to draw from the account
 * years_work, short, the amount of years the user wants to work.
 * investement_return, float, expected average return on investment
 * required_income, int, income they need to live "comfortably"
 * SSI_income, int, expected income from Social Security
 * RETURNS:
 * amount_needed, float, the amount needed for the user to retire in their ideal conditions.
 */
public class Lab1 {
	

	

	

public static double totalSaved(String[] args) {
	//sub t in for 0 make t whether it is paid at the beginning of the month or end
	Scanner input = new Scanner(System.in);
	
	
	
	//How long the user wants to draw from savings once retired
	System.out.print("How many years do you want to withdraw from your retirement savings: ");
	int yearsRetired = input.nextInt();
	
	//The annual return on their savings account, between 0-3%
	System.out.print("How much of an return rate will be applied to your savings(between 0-3%): ");
	double annualReturn = input.nextDouble();
	
	//The users required income
	System.out.print("What is your required income per month: ");
	int requiredIncome = input.nextInt();
	
	//SSI income
	System.out.print("What is your expected SSI income: ");
	int SSI = input.nextInt();
	
	int f = 0;
	
	
	//Is the payment at the beginning or end of the month, 0 is end of the period 1 is the beginning
	System.out.print("Are payments made at the beginning or end of the period? (0 for the end, 1 for the beginning): ");
	int t = input.nextInt();
	
	if (annualReturn == 0){
		double PV= (f+( (requiredIncome - SSI)*(yearsRetired*12) ));
		//Console printout of total savings in retirement fund
		return PV;
	}
	
	else {
	double PV = (( ( requiredIncome - SSI ) * (1+((annualReturn/100)/12)*t) * ( (Math.pow( 1 + ((annualReturn/100)/12) , yearsRetired*12)) -1)
			/ ((annualReturn /100)/12) ) - f)/ Math.pow(1+((annualReturn/100)/12), yearsRetired*12);
	
	// Console printout of total savings in retirement fund
	return PV;
		}
}
	
public static double PMT(String[] args1){
	Scanner input = new Scanner(System.in);
	
	double PV= totalSaved(args1);
	
	//How long the user wants to work
		System.out.print("How many years do you plan on working: ");
		int yearsWorking = input.nextInt();
		
		//Amount of interest when investing
		System.out.print("How much interest will be applied to your investments(between 0-20%): ");
		double invIntrest = input.nextDouble();
		
		PMT= PV / 
		

}





public static void main(String[] args){
	System.out.println(PMT(args));
}
}
