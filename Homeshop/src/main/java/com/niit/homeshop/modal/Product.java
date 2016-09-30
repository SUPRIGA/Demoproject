package com.niit.homeshop.modal;

public class Product {
		private int product_id;
		private String product_name;
		private String description;
		private int quantity;
		private int price ; 
		private int category_id;
		private int supplier_id;
		private int sub_category_id;
		private int liters;
		private int weight ; 

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
		
		public String getDescription() {
		  return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getQuantity() {
			 return quantity;
		}
		public void setQuantity(int quantity) {
		  this.quantity = quantity;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getCategory_Id() {
			return category_id;
		}
		public void setCategory_Id(int category_id) {
			this.category_id = category_id;
		}
		public int getSupplier_Id() {
			return supplier_id;
		}
	    public void setSupplier_Id(int supplier_id) {
			this.supplier_id = supplier_id;
		}
	    public int getSub_Category_Id() {
			return sub_category_id;
		}
	    public void setSub_Category_Id(int sub_category_id) {
			this.sub_category_id = sub_category_id;
		}
	    public int getLiters() {
		  return liters;
		}
		public void setLiters(int liters) {
			this.liters =liters;
		}
		public int getWeight() {
		  return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
	}
							
	


