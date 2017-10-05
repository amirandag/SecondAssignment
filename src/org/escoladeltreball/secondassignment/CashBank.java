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
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.secondassignment.BankImpl#isBalanceNegative()
	 */
	@Override
	public boolean isBalanceNegative() {
		// TODO Auto-generated method stub
		return false;
	}

}
