package com.akshatha.spring;

public class AddressType {
	private String addrLine1;
	private String addrLine2;
	private String city;
	private String state;
	private int zipCode;
	
	public AddressType() {
		System.out.println("Created : \t"+this.getClass().getSimpleName());
	}
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "AddressType [addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + "]";
	}
}
