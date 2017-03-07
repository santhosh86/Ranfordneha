package com.Ranford.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class RoleNG extends Baseng {
	@Test(dataProvider="Rdata")
	public void ExeRole(String Rn,String Rt){
		lb.Role(Rn,Rt);
		
	}
	@DataProvider

	public Object[][] Rdata()
	{
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="teller702";
		obj[0][1]="E";
		
		obj[1][0]="teller802";
		obj[1][1]="E";
		
		obj[2][0]="teller902";
		obj[2][1]="E";
		
		return obj;
	}
}
