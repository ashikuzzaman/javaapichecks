package com.github.ashikuzzaman.javaapichecks.mocks;

/**
 * To compile: javac -d . BaseTestCaseEntry.java
 *
 * @author ashik
 */
public class BaseTestCaseEntry implements TestCaseEntry {

	private String testCaseIdentifier;
	private String testCaseType;
	private String message;
	private String provisioningStatus;
	private String orgStatus;
	private String orgEdition;

	private String accountId;
	private String tenantId;
	private String tenantType;
	private TestCaseFactory testCaseFactory;

	public String getTestCaseIdentifier() {
		return this.testCaseIdentifier;
	}
	public void setTestCaseIdentifier(String id) {
		this.testCaseIdentifier = id;
	}

	public String getTestCaseType() {
		return this.testCaseType;
	}
	public void setTestCaseType(String type) {
		this.testCaseType = type;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String msg) {
		this.message = msg;
	}

	public String getProvisioningStatus() {
		return this.provisioningStatus;
	}

	public void setProvisioningStatus(String prov) {
		this.provisioningStatus = prov;
	}

	public String getOrgStatus() {
		return this.orgStatus;
	}

	public void setOrgStatus(String status) {
		this.orgStatus = status;
	}

	public String getOrgEdition() {
		return this.orgEdition;
	}

	public void setOrgEdition(String edition) {
		this.orgEdition = edition;
	}

}




