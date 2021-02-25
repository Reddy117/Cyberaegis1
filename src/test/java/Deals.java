import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.util.BaseClass;

public class Deals extends BaseClass {
WebDriver driver;
@BeforeMethod
public void openApp(String browser) {
	/*System.out.println(System.getProperty("user.dir"));
	if(browser.equals("chrome")) {
		System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}else if(browser.equals("ff")) {
		System.getProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/test/resources/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
	}else if(browser.equals("ie")) {
		System.getProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/src/test/resources/Drivers/IEDrvierServer.exe");
		driver=new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("");*/
	initialize("");
}

	@Test
	public void createDeal() {
		driver.findElement(By.xpath("//a[@href='/deals']")).click();
	}
}
