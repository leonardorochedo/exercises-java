package util;

public class CurrencyConverter {

	public static double convert(double usd, double real) {
		return (usd * 0.06 + usd)*real;
	}
	
}
