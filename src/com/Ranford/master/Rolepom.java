package com.Ranford.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rolepom {
	@FindBy (id="btnRoles")
	WebElement NewRole;
	@FindBy (id="txtRname")
	WebElement Rolename;
	@FindBy (id="lstRtypeN")
	WebElement Roletype;
	@FindBy (id="btninsert")
	WebElement Submit;
	
	public void NRole()
	{
		NewRole.click();
	}
	public void NrolCrt()
	{
		Rolename.sendKeys("txt123");
		Roletype.sendKeys("E");
		Submit.click();
		
	}
}
