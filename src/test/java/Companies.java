import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.util.BaseClass;
import com.freecrm.util.projectSpecificfunctions;

public class Companies extends projectSpecificfunctions{

	
	@Test(dataProvider="getCreateCompanyData")
	public void tc1_createCompany(String col1,String col2,String col3,String col4,String col5,String col6,String col7,String col8) {
		/*driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys(p.getProperty("uName"));
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys(p.getProperty("passWord"));
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();*/
		if(col8.equals("N"))
			throw new SkipException("Test data Runmode set to no, so skipping");
		
		doLogin();
		
		/*driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[4]/a/span")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("");
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();*/
		createCompany(col1,col2,col3,col4,col5,col6,col7) ;
		
	}
	
	//@Test
	public void tc2_editCompany() {
		/*driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[4]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr/td[4]/a[2]")).click();
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("");
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();)*/
		editCompany();
	}
	
	//@Test
	public void deleteCompany() {
		try {
			deleteCompany();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getCreateCompanyData() throws IOException{
		return BaseClass.getData("Sheet3", "TC1_createCompany", x);
	}
}
