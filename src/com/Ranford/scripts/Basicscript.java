package com.Ranford.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basicscript {


	public static void main(String[] args) throws IOException
	{
		Properties Pr=new Properties();
		FileInputStream Fis=new FileInputStream("E:\\Neha\\Ranford\\src\\com\\Ranford\\properties\\Rep1.properties");
		Pr.load(Fis);
		//Firefox
		String Expval="Ranford Bank";
		WebDriver driver=new 																																						FirefoxDriver();
		//maximise
		
		driver.manage().window().maximize();
		//passing URL
		driver.get("http://192.168.1.200/ranford2/home.aspx");
		String Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		System.out.println(Actval);
		System.out.println(driver.getTitle());
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Ranford home page is displayed");	
		}
		else
		{
			System.out.println("Ranford home page is not displayed");
		}

		//Admin login
		
		driver.findElement(By.id(Pr.getProperty("Uname"))).sendKeys("Admin");
		driver.findElement(By.id(Pr.getProperty("Pwd"))).sendKeys("Admin");
		driver.findElement(By.id(Pr.getProperty("Lgn"))).click();
		
		driver.findElement(By.xpath(Pr.getProperty("Role"))).click();
	}
	

}
