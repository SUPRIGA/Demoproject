package com.niit.homeshop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.homeshop.modal.UserAccount;
import com.niit.homeshop.service.UserAccountDAO;

public class UserAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		System.out.println("system.....");
		 
		UserAccountDAO useraccountDAO=(UserAccountDAO) context.getBean("UserAccountDAO");
		
		UserAccount userAccount = (UserAccount) context.getBean("userAccount");
		
		userAccount.setFirst_Name("sup");
		userAccount.setLast_Name("raj");
		userAccount.setGender("female");
		userAccount.setEmail_id("suprigavivek03@gmail.com");
		userAccount.setPassword("aravind");
		userAccount.setMobile_Number(8124);
		userAccount.setAddress("hudco colony");
	
		
		 
		useraccountDAO.insertUserAccount(userAccount);
	}

}
