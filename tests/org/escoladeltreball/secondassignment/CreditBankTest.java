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
public class CreditBankTest {
	
	CreditBank creditBank;

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
		creditBank = new CreditBank("Alex", 40.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		creditBank = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.CreditBank#isBalanceNegative()}.
	 */
	@Test
	public void testIsBalanceNegative() {
		assertEquals(false, creditBank.isBalanceNegative());
		try {
			creditBank.withdraw(60.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(true, creditBank.isBalanceNegative());
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#toDollars()}.
	 */
	@Test
	public void testToDollars() {
		assertEquals(56.0, creditBank.toDollars(), 1.0e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		assertEquals(40.0, creditBank.getBalance(), 1-0e-4);
		try {
			creditBank.withdraw(100.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(-60.0, creditBank.getBalance(), 1-0e-4);
		try {
			creditBank.withdraw(20.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(-80.0, creditBank.getBalance(), 1-0e-4);
		creditBank.deposit(500.0);
		assertEquals(420.0, creditBank.getBalance(), 1-0e-4);
	}

}
