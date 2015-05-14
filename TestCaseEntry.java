package com.github.ashikuzzaman.javaapichecks.mocks;

/**
 * To compile: javac -d . TestCaseEntry.java
 *
 * @author ashik
 */
public interface TestCaseEntry {

	String getTestCaseIdentifier();
	void setTestCaseIdentifier(String id);
	String getTestCaseType();
	void setTestCaseType(String type);
	String getMessage();
	void setMessage(String msg);
	String getProvisioningStatus();
	void setProvisioningStatus(String prov);
	String getOrgStatus();
	void setOrgStatus(String status);
	String getOrgEdition();
	void setOrgEdition(String edition);
}

