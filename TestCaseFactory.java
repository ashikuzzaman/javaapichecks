package com.github.ashikuzzaman.javaapichecks.mocks;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * To compile: javac -d . TestCaseFactory.java
 *
 * @author ashik
 */
public class TestCaseFactory {

	private static Map<String, String> categoryToMockData = new HashMap<String, String>();
	static {
		categoryToMockData.put("TC-001", "Quote Creation");
		categoryToMockData.put("TC-002", "Quote Creation");
		categoryToMockData.put("TC-003", "Quote Creation");
		categoryToMockData.put("TC-004", "Quote Creation");
		categoryToMockData.put("TC-005", "Quote Creation");
		categoryToMockData.put("TC-006", "Org Provision");
		categoryToMockData.put("TC-007", "Org Provision");
		categoryToMockData.put("TC-008", "Org Provision");
		categoryToMockData.put("TC-009", "Org Provision");
		categoryToMockData.put("TC-010", "Org Provision");
		categoryToMockData.put("TC-011", "Checkout");
		categoryToMockData.put("TC-012", "Checkout");
		categoryToMockData.put("TC-013", "Checkout");
		categoryToMockData.put("TC-014", "Checkout");
		categoryToMockData.put("TC-015", "Checkout");
		categoryToMockData.put("TC-016", "Order Provision");
		categoryToMockData.put("TC-017", "Order Provision");
		categoryToMockData.put("TC-018", "Order Provision");
		categoryToMockData.put("TC-019", "Order Provision");
		categoryToMockData.put("TC-020", "Order Provision");
		categoryToMockData.put("TC-021", "Quote Conversion");
		categoryToMockData.put("TC-022", "Quote Conversion");
		categoryToMockData.put("TC-023", "Quote Conversion");
		categoryToMockData.put("TC-024", "Quote Conversion");
		categoryToMockData.put("TC-025", "Quote Conversion");
	}

	private static List<TestCaseEntry> entries = new ArrayList<TestCaseEntry>();

	/** Make cross org rest api call to get the list of entries */	
	public static List<TestCaseEntry> getEntriesByCategory(String category) {
		TestCaseEntry entry;
		if ( "Quote Creation".equalsIgnoreCase(category) ) {
			// entry = new QuoteCreationTestCaseEntry();
			// entries.add(entry);
		} else if ( "Org Provision".equalsIgnoreCase(category) ) {
			// entries = new OrgProvisioingTestCaseEntry();
			// entries.add(entry);
		} else if ( "Checkout".equalsIgnoreCase(category) ) {
			// entries = new CheckoutTestCaseEntry();
			// entries.add(entry);
		} else if ( "Order Provision".equalsIgnoreCase(category) ) {
			// entries = new OrderProvisioingTestCaseEntry();
			// entries.add(entry);
		} else if ( "Quote Conversion".equalsIgnoreCase(category) ) {
			// entries = new QuoteConversionTestCaseEntry();
			// entries.add(entry);
		} else {
			entries = new ArrayList<TestCaseEntry>();
		}

		return entries;
	}

	/** Make cross org rest api call to get the entry */
	public static TestCaseEntry getSingleEntry(String id) {
		TestCaseEntry entry = null;
		String cat = categoryToMockData.get(id);
		if ( "Quote Creation".equalsIgnoreCase(cat) ) {
			entry = new QuoteCreationTestCaseEntry();
		} else if ( "Org Provision".equalsIgnoreCase(cat) ) {
			// entry = new OrgProvisioingTestCaseEntry();
		} else if ( "Checkout".equalsIgnoreCase(cat) ) {
			// entry = new CheckoutTestCaseEntry();
		} else if ( "Order Provision".equalsIgnoreCase(cat) ) {
			// entry = new OrderProvisioingTestCaseEntry();
		} else if ( "Quote Conversion".equalsIgnoreCase(cat) ) {
			// entry = new QuoteConversionTestCaseEntry();
		} else {
			entry = null;
		}

		return entry;
	}

}



