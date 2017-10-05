/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author alex
 *
 */
public class CreditBank extends BankImpl {

	/**
	 * @param owner
	 * @param balance
	 */
	public CreditBank(String owner, double balance) {
		super(owner, balance);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.BankImpl#withdraw(double)
	 */
	@Override
	public void withdraw(double euros) throws Exception {
		if (balance == MIN_BALANCE) {
			System.out.println("You're at the minimum balance you can have");
		} else if (balance - euros < MIN_BALANCE) {
			System.out.println("You're now at the minimum balance you can have");
			balance = MIN_BALANCE;
		} else {
			balance -= euros;
		}
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.BankImpl#isBalanceNegative()
	 */
	@Override
	public boolean isBalanceNegative() {
		if (balance < 0) {
			return true;
		}
		return false;
	}

}
