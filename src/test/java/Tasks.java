import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.util.BaseClass;

public class Tasks extends BaseClass{
	@BeforeMethod
	public void openApp(String browser) {
		
		initialize("");
	}
	
	@Test
	public void createTask() {
		
	}
	
}
