/**
 * 
 */
package org.escoladeltreball.secondassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author alex
 *
 */
public class CashBankTest {
	
	CashBank cashBank;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cashBank = new CashBank("Alex", 100.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		cashBank = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.CashBank#isBalanceNegative()}.
	 */
	@Test
	public void testIsBalanceNegative() {
		assertEquals(false, cashBank.isBalanceNegative());
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#toDollars()}.
	 */
	@Test
	public void testToDollars() {
		assertEquals(140.0, cashBank.toDollars(),1.0e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		assertEquals(100.0, cashBank.getBalance(),1.0e-4);
		try {
			cashBank.withdraw(40.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(60.0, cashBank.getBalance(),1.0e-4);
		cashBank.deposit(80.0);
		assertEquals(140.0, cashBank.getBalance(),1.0e-4);
	}

}
