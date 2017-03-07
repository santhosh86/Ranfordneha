package com.Ranford.master;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseng {
	public Lib lb =new Lib();
	
	@BeforeTest
	public void beforeTest() throws Exception{
		lb.Adminlgn("Admin", "Admin");
			
	}
	 @AfterTest
	  public void afterTest() 
	  {
	  lb.logout();
	  }
	 
	 @BeforeSuite
	  public void beforeSuite()  
	  {
	  lb.OpenApp("http://192.168.1.200/ranford2/home.aspx");
	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
	  lb.Aclose();
	  }
}
