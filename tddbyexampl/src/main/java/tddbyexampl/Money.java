package tddbyexampl;

public abstract class Money {
	protected int amount;
	protected String currency;
	
	
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Money dollar(int amount) {
		return new Dollar(amount,"USD");
	}
	
	static Money franc(int amount){
		return new Franc(amount,"CHF");
	}
	
	public boolean equals(Object obj) {
		Money money=(Money) obj;
		return amount==money.amount && getClass().equals(money.getClass());
	}

	abstract Money times(int i);

	abstract String currency();
	
}
