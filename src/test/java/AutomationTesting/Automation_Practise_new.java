package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass_auto.BaseClass;
import com.baseclass_auto.BaseClass_New;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.sdp.Page_Obj;

public class Automation_Practise_new extends BaseClass {

	public static WebDriver driver = get_Driver("chrome");

	public static Page_Obj pom = new Page_Obj(driver);

	public static void main(String[] args) throws InterruptedException {

		getUrl("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		clickOnElement(pom.getInstance_home().getSignin());

		inputValueElement(pom.getInstance_Login().getUsername(), "Nandhinivaradhan@gmail.com");
		inputValueElement(pom.getInstance_Login().getPassword(), "A@rya123");
		clickOnElement(pom.getInstance_Login().getSubmit());

		Thread.sleep(3000);

		close();

	}

}
