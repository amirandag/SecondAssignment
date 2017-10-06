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
		if (balance - euros < MIN_BALANCE) {
			throw new Exception("You can't go lower than the minimum balance");
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
