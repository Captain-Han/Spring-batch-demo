package jp.co.sysevo.Spring_Batch;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName	name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
    }

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("Running all tests.");
		suite.addTestSuite(AppTest.class);
		suite.addTestSuite(OutputProcessorTest.class);
		return suite;
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {

		System.out.println("<------test begin-------->");

	}
}
