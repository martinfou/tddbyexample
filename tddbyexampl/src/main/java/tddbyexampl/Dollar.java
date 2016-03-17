package tddbyexampl;

public class Dollar {

	private int amount;
	
	public Dollar(int amount) {
		this.amount=amount;
	}

	public Dollar times(int multiplyer) {
		return new Dollar(amount*multiplyer);
	}

	@Override
	public boolean equals(Object obj) {
		Dollar dollar=(Dollar) obj;
		return amount==dollar.amount;
	}
	
	

}
