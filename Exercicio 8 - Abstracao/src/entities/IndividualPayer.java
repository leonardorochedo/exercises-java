package entities;

public class IndividualPayer extends Payer {

	private Double healthExpenditures;
	
	public IndividualPayer() {
		super();
	}
	
	public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double calcTaxes() {
		
		double taxes = 0;
		
		if(super.getAnualIncome() < 20000.0) {
			taxes += super.getAnualIncome() * 0.15;
		} else if(super.getAnualIncome() > 20000.0) {
			taxes += super.getAnualIncome() * 0.25;
		}
		
		if(getHealthExpenditures() > 0) {
			taxes -= getHealthExpenditures()/2;
		}
		
		return taxes;
	}

}
