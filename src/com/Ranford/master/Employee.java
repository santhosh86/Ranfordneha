package com.Ranford.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employee extends Baseng{
	@Test(dataProvider="getEmployeeData")
	public void Empexe(String EName, String EPwd, String Erole, String Ebranch)
	{
		lb.employee( EName,EPwd,Erole,Ebranch);
	}
		@DataProvider
		public Object[][] getEmployeeData()
		{
			Object[][] obj= new Object[3][4];
			
			obj[0][0]= "Bev1";
			obj[0][1]= "abcd";	
			obj[0][2]= "TManager";
			obj[0][3]= "1hyderabad";
					
			obj[1][0]= "Bev2";	
			obj[1][1]= "qrsy";	
			obj[1][2]= "TManager";
			obj[1][3]= "abcd11";
	 
			obj[2][0]= "Bev3";
			obj[2][1]= "wxyz";	
			obj[2][2]= "TManager";
			obj[2][3]= "abcd11";
			return obj;
					
					
					

		}
		

}
