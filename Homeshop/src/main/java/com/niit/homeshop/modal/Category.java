package com.niit.homeshop.modal;

public class Category {
	   private int category_id;
	   private String category_name;  
	   private String category_description; 

    public int getCategory_Id() {
	     return category_id;
    }
	public void setCategory_Id(int category_id) {
		 this.category_id = category_id;
	}
    public String getCategory_Name() {
        return category_name;
    }
    public void setCategory_Name(String category_name) {
	    this.category_name = category_name;
    }
    public String getCategory_Description() {
	     return category_description ;
	}
	public void setCategory_Description(String category_description) {
		 this.category_description = category_description;
	}
}



 