package com.niit.homeshop.modal;

public class ShippingAddress {
		private int product_id;
		private String product_name;
		private String user_name ; 
		private int price;
		private int mobile_number;
		private String address;
	   
		
	public int getProduct_Id() {
		return product_id;
	}
	public void setProduct_Id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_Name() {
		return product_name;
	}
	public void setProduct_Name(String product_name) {
		this.product_name = product_name;
	}
	public String getUser_Name() {
		return user_name;
	}
	public void setUser_Name(String user_name) {
		this.user_name = user_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMobile_Number() {
		return mobile_number;
	}
	public void setMobile_Number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	}


