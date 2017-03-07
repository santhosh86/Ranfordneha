package com.Ranford.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Notepad {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Lib Lb=new Lib();
		String Res=Lb.OpenApp("http://192.168.1.200/ranford2/home.aspx");
		System.out.println(Res);
		Res=Lb.Adminlgn("Admin","Admin");
		System.out.println(Res);
		
		//Test data path
        String Fpath = "E:\\Neha\\Ranford\\src\\com\\Ranford\\testdata\\Role.txt";
        // Results path
        String Rpath = "E:\\Neha\\Ranford\\src\\com\\Ranford\\results\\Roleres.txt";
        FileReader FR= new FileReader(Fpath);
        BufferedReader BR = new BufferedReader(FR);
        String SD;
        String Sread = BR.readLine();
        System.out.println(Sread);
      //write
		
      		FileWriter FW=new FileWriter(Rpath);
      		BufferedWriter BW=new BufferedWriter(FW);
      		BW.write(Sread);
      		BW.newLine();
      	//Loop----------------------while loop
    		
    		while((SD=BR.readLine())!=null)
    		{
    		  System.out.println(SD);
    		  String SR[]=SD.split("###");
    		  String Rname=SR[0];
    		  String Rtyp=SR[1];
    		  Res=Lb.Role(Rname,Rtyp);
    		  System.out.println(Res);
    		  
    		  BW.write(Rname+"$$$"+Rtyp+"%%%"+Res);
    		  BW.newLine();
    		  
    		}
    		BW.close();
    		BR.close();
        
        		
   

	}
	

}
