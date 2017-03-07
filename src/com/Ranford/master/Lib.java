package com.Ranford.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
public class Lib {
	public static WebDriver driver;
	public static String Expval,Actval;
	public static Properties Pr;
	public static FileInputStream Fis;
	
	public String OpenApp(String Url)
	{
		Expval="Ranford Bank";
		driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get(Url);
		 Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if (Expval.equalsIgnoreCase(Actval))
		{
		System.out.println("Ranford home page is displayed");	
		return "Pass";
		}
		else
		{
			System.out.println("Ranford home page doesn't displayed");
			return "Fail";
		}
	}
	public String Adminlgn(String UN, String PWD) throws IOException
	{
		Pr=new Properties();
		Fis=new FileInputStream("E:\\sridevi\\Ranford\\src\\com\\ranford\\properties\\Rep.properties");
		Pr.load(Fis);
		Expval="Welcome to Admin";
		 driver.findElement(By.id(Pr.getProperty("Uname"))).sendKeys(UN);
		 driver.findElement(By.id(Pr.getProperty("Pwd"))).sendKeys(PWD);
		 driver.findElement(By.id(Pr.getProperty("Lgn"))).click();
		 Actval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	   if (Expval.equalsIgnoreCase(Actval))
	   {
		System.out.println("Admin home page is displayed");
		return ("Pass");
	}
	   else
		   {
		   System.out.println("Not displayed");
		   }
		return ("Fail");
		   
	}
	public String Role(String RN,String Rtyp)
	{
		 Expval="Sucessfully";
		 Sleeper.sleepTightInSeconds(4);
		 driver.findElement(By.xpath(Pr.getProperty("Rbutton"))).click();
		 Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.id(Pr.getProperty("NRbutton"))).click();
			driver.findElement(By.id("txtRname")).sendKeys(RN);
			//driver.findElement(By.id("txtRname");
			Sleeper.sleepTightInSeconds(4);
			new Select(driver.findElement(By.id("lstRtypeN"))).selectByVisibleText(Rtyp);
			driver.findElement(By.id("btninsert")).click();
			Sleeper.sleepTightInSeconds(9);
			Actval=driver.switchTo().alert().getText();
			//System.out.println(Actval);
			driver.switchTo().alert().accept();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
			Sleeper.sleepTight(5);
			if (Actval.contains(Expval)) 
			{
			System.out.println("Role created");	
			return Actval;
			}
			else
			{
				System.out.println("Role already exist");
				return Actval;
			}
			

	}
	public void employee(String EName, String EPwd, String Erole, String Ebranch){
	
		Expval= "Successfully";
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.xpath(Pr.getProperty("Ebutton"))).click();
		driver.findElement(By.id(Pr.getProperty("NEbutton"))).click();
		driver.findElement(By.id(Pr.getProperty("EUname"))).sendKeys(EName);
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.id(Pr.getProperty("EPwd"))).sendKeys(EPwd);
		//driver.findElement(By.id("lst_Roles"))
		Sleeper.sleepTightInSeconds(4);
		new Select(driver.findElement(By.id(Pr.getProperty("ERole")))).selectByVisibleText(Erole);
		Sleeper.sleepTightInSeconds(4);
		//driver.findElement(By.id("lst_Branch"))
		new Select(driver.findElement(By.id(Pr.getProperty("EBranch")))).selectByVisibleText(Ebranch);
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.id(Pr.getProperty("ESubmit"))).click();
		Sleeper.sleepTightInSeconds(4);
		Actval= driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(Actval);
		if(Actval.contains(Expval) )
		{
			System.out.println("Employee created");
			
		}
		else
		{
			System.out.println("Employee already existed");
		}
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		
	}
	public void logout(){
		
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
	}
	public void Aclose(){
		driver.close();
	}
}
