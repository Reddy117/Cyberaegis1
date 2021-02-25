package com.freecrm.util;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

public class projectSpecificfunctions extends BaseClass{

	public static void doLogin() {
		try {
			driver.findElement(By.xpath(uNamex)).sendKeys(p.getProperty("uName"));
			driver.findElement(By.xpath(passWordx)).sendKeys(p.getProperty("passWord"));
			driver.findElement(By.xpath(loginBtnx)).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void createCompany(String cName,String cWeb,String Address,String city,String state,String zip,String country) {
		try {
			driver.findElement(By.xpath(companiesX)).click();
			driver.findElement(By.xpath(newBtnx)).click();
			driver.findElement(By.xpath(companyNameX)).sendKeys(cName);
			driver.findElement(By.xpath(companyUrlx)).sendKeys(cWeb);
			driver.findElement(By.xpath(companyAddressx)).sendKeys(Address);
			driver.findElement(By.xpath(cityx)).sendKeys(city);
			driver.findElement(By.xpath(statex)).sendKeys(state);
			driver.findElement(By.xpath(zipX)).sendKeys(zip);
			selectDropLooklike(countryXpath,boxXpath,country); 
			driver.findElement(By.xpath(saveBtnx)).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public void editCompany() {
		try {
			driver.findElement(By.xpath(companiesX)).click();
			driver.findElement(By.xpath(editCompanyX)).click();
			driver.findElement(By.xpath(companiesX)).sendKeys("");
			driver.findElement(By.xpath(saveBtnx)).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}


public void deleteCompany() {
	try {
		driver.findElement(By.xpath(companiesX)).click();
		driver.findElement(By.xpath(deleteLinkx)).click();
		driver.findElement(By.xpath(deletebtnx)).click();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

public static void selectDropLooklike(String dropX,String boxX,String value) {
	try {
		driver.findElement(By.xpath(dropX)).click();
		WebElement box=driver.findElement(By.xpath(boxX));
		List<WebElement> items=box.findElements(By.tagName("span"));
		for(WebElement item:items) {
			System.out.println(item.getText());
			if(item.getText().equals(value)) {
				item.click();
				
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	}
}
}
