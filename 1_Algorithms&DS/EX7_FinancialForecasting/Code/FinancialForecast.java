package financialForecast;

public class FinancialForecast {
	double principal;
	double rate;
	int time;
	
	public FinancialForecast(double principal, double rate, int time) {
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}
	
	public static double calculateInvestment(double principal, double rate, int time) {
		
		if(time == 0) {
			return principal;
		}
		return calculateInvestment(principal * (1+rate), rate, time - 1);
	}

}
