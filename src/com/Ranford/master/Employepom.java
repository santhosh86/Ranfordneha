package com.Ranford.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employepom {
	@FindBy (id="BtnNew")
	WebElement NewEmployee;
	@FindBy (id="txtUname")
	WebElement EmpName;
	@FindBy (id="txtLpwd")
	WebElement LoginPasswrd;
	@FindBy (id="lst_Roles")
	WebElement Role;
	@FindBy (id="lst_Branch")
	WebElement Branch;
	@FindBy (id="BtnSubmit")
	WebElement Submit;
	
	public void NewEmp(){
		NewEmployee.click();
	}
	public void EmpDetails(){
		EmpName.sendKeys("abcdi2");
		LoginPasswrd.sendKeys("abcde23");
		Role.sendKeys("TManager");
		Branch.sendKeys("E");
		Submit.click();
		}

}
