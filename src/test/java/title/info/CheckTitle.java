package title.info;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTitle {
	
	@Test
	public void searchTitle() throws InterruptedException {
		
		System.setProperty( "webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("it's done!!");
		Thread.sleep(4000);
		driver.quit();
	}
	

}
