package tddbyexampl;

public class Dollar extends Money{

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplyer) {
		return  Money.dollar(amount*multiplyer);
	}
	
	public String currency(){
		return currency;
	}
}
