package com.Ranford.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Lib LB=new Lib();
		LB.OpenApp("http://192.168.1.200/ranford2/home.aspx");
		LB.Adminlgn("Admin", "Admin");
		
		FileInputStream fis = new FileInputStream("E:\\Neha\\Ranford\\src\\com\\ranford\\testdata\\Role.xlsx");
		
		// create workbook
		XSSFWorkbook WB = new XSSFWorkbook(fis);
		//sheet
		XSSFSheet WS = WB.getSheet("Roledata");
		
		//Row count
		int RC= WS.getLastRowNum();
		System.out.println(RC);
		for(int i=1; i<=RC; i++)
		{
			XSSFRow WR=WS.getRow(i);
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			XSSFCell WC2=WR.createCell(2);
			
			String Rname=WC.getStringCellValue();
			System.out.println(Rname);
			
			String Rtyp=WC1.getStringCellValue();
			System.out.println(Rtyp);
			String Res=LB.Role(Rname,Rtyp);
			WC2.setCellValue(Res);
			
			
		}
		FileOutputStream Fos=new FileOutputStream("E:\\Neha\\Ranford\\src\\com\\ranford\\results\\Roleres.xlsx");
		WB.write(Fos);
		WB.close();

	}

}
