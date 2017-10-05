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
		// TODO Auto-generated constructor stub
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
