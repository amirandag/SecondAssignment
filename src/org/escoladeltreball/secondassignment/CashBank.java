/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author alex
 *
 */
public class CashBank extends BankImpl {

	/**
	 * @param owner
	 * @param balance
	 */
	public CashBank(String owner, double balance) {
		super(owner, balance);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.BankImpl#withdraw(double)
	 */
	@Override
	public void withdraw(double euros) throws Exception {
		if (balance - euros < 0) {
			System.out.println("Balance can not be negative");
		} else {
			balance -= euros;
		}
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.BankImpl#isBalanceNegative()
	 */
	@Override
	public boolean isBalanceNegative() {
		return false;
	}

}
