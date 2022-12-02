package entities;

public class CompanyPayer extends Payer {

	private Integer numberEmployees;
	
	public CompanyPayer() {
		super();
	}
	
	public CompanyPayer(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double calcTaxes() {
		if(getNumberEmployees() > 10) {
			return super.getAnualIncome() * 0.14;
		}
		return super.getAnualIncome() * 0.16;
	}

}
