/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author alex
 *
 */
public abstract class BankImpl implements Bank {
	
	protected String owner;
	protected double balance;

	/**
	 * @param owner
	 * @param balance
	 */
	public BankImpl(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#withdraw(double)
	 */
	@Override
	public abstract void withdraw(double euros) throws Exception;

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#deposit(double)
	 */
	@Override
	public void deposit(double euros) {
		balance += euros;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#toDollars()
	 */
	@Override
	public double toDollars() {
		return balance * DOLAR_RATE;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#getBalance()
	 */
	@Override
	public double getBalance() {
		return balance;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.Bank#isBalanceNegative()
	 */
	@Override
	public abstract boolean isBalanceNegative();

}
