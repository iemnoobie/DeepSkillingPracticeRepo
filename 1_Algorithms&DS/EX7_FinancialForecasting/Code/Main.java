package financialForecast;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principal Amount: ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the Growth Rate: ");
		double rate = sc.nextDouble()/100;
		
		System.out.println("Enter the number of years: ");
		int time = sc.nextInt();
		
		FinancialForecast invstmnt = new FinancialForecast(principal, rate, time);
		
		double result = FinancialForecast.calculateInvestment(principal, rate, time);
		
		System.out.println("The future investment stands to be: " + result);
	}
}
