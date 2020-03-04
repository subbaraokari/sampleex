package com.cts.model;

public class CustomerDetails {
	private String name;
	private String mobileNo;
	private String carrier;
	private String previousRechargeDate;
	private String previousSelectedPackage;
	public CustomerDetails() {
		
	}
	public CustomerDetails(String name, String mobileNo, String carrier, String previousRechargeDate,
			String previousSelectedPackage) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.carrier = carrier;
		this.previousRechargeDate = previousRechargeDate;
		this.previousSelectedPackage = previousSelectedPackage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getPreviousRechargeDate() {
		return previousRechargeDate;
	}
	public void setPreviousRechargeDate(String previousRechargeDate) {
		this.previousRechargeDate = previousRechargeDate;
	}
	public String getPreviousSelectedPackage() {
		return previousSelectedPackage;
	}
	public void setPreviousSelectedPackage(String previousSelectedPackage) {
		this.previousSelectedPackage = previousSelectedPackage;
	}
}
