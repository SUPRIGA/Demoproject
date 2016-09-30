package com.niit.homeshop.modal;

public class CardPayment {
		private String cardholder_name;
		private int card_number ; 
		private int cvv_number ; 
		private String cardtype;
		
	 public String getCardHolder_Name() {
		 return cardholder_name;
	 }
	public void setCardHolder_Name(String cardholder_name) {
		this.cardholder_name = cardholder_name;
	}
	public int getCard_Number() {
		return card_number;
	}
	public void setCard_Number(int card_number) {
	   this.card_number = card_number;
	}
	public int getCvv_Number() {
		return cvv_number;
	}
	public void setcvv_number(int cvv_number) {
	   this.cvv_number = cvv_number;
	}
	public String getCardType() {
		 return cardtype;
	}
	public void setCardType(String cardtype) {
		this.cardtype = cardtype;
	}
	}



