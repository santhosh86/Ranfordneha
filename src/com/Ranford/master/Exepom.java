package com.Ranford.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom {
	@Test 
	public void exelogin(){
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.200/ranford2/home.aspx");
		
		HomePage HP= PageFactory.initElements(driver,HomePage.class);
		HP.login();
		//Adminpage AP= PageFactory.initElements(driver, Adminpage.class);
		//AP.Rol();
		//Rolepom RP= PageFactory.initElements(driver,Rolepom.class);
		//RP.NRole();
		//RP.NrolCrt();
		Adminpage AP= PageFactory.initElements(driver, Adminpage.class);
		AP.Emp();
		Employepom EP= PageFactory.initElements(driver, Employepom.class);
		EP.NewEmp();
		EP.EmpDetails();
	}

}
