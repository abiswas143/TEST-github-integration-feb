package scripts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin(){
		LoginPage lp = new LoginPage(driver);
		//enter username -  admin
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		lp.setUsername(username);
		//enter password - manager
		lp.setPassword(Lib.getCellValue("ValidLogin", 1, 1));
		//click on Login button
		lp.clickLogin();
		//Apply Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 13);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		
		String actHomePageTitle = driver.getTitle();
		/*if (actHomePageTitle.equals("I dont know")) {
			System.out.println("Login successfull..");
		} else {
			System.out.println("Login Failed..");
		}*/
		Assert.assertEquals(actHomePageTitle, "actiTIME - Enter Time-Track");
	}
}
