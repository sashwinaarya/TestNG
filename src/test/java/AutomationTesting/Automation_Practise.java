package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass_auto.BaseClass;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.sdp.Page_Object_Manager;

public class Automation_Practise extends BaseClass {
	

	public static WebDriver driver=get_Driver("chrome");
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	
	
	public static void main(String[] args) throws InterruptedException {
			
		getUrl("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//clickOnElement(hp.getSignin());
		
		clickOnElement(pom.getInstance_home().getSignin());
	
		inputValueElement(pom.getInstance_Login().getUsername(), "Nandhinivaradhan@gmail.com");
		inputValueElement(pom.getInstance_Login().getPassword(), "A@rya123");
		clickOnElement(pom.getInstance_Login().getSubmit());
		
		Thread.sleep(3000);
		
		close();
		
	}

}
