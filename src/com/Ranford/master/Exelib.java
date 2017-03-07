package com.Ranford.master;

import java.io.IOException;

public class Exelib {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Lib Lb=new Lib();
		String Res=Lb.OpenApp("http://192.168.1.200/ranford2/home.aspx");
		System.out.println(Res);
		
		Res= Lb.Adminlgn("Admin","Admin");
		
		System.out.println(Res);
	//Lb.Role();
	//	Lb.employee();
	//	Lb.logout();
	}

}
