package com.example.demo.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BookProduct {
	@Id
	private long productId;
	private String productName;
	private String name;
	
	 private String emailId;
	 private String mobileNo;
	 private String country;
	 private String state;
	 private String district;
	 private String pinCode;
	 private String address;
	
	 private String userId;
	
	 private String amount;
	 
	private Date date;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookProduct [productId=" + productId + ", productName=" + productName + ", name=" + name + ", emailId="
				+ emailId + ", mobileNo=" + mobileNo + ", country=" + country + ", state=" + state + ", district="
				+ district + ", pinCode=" + pinCode + ", address=" + address + ", userId=" + userId + ", amount="
				+ amount + ", date=" + date + "]";
	}

}
