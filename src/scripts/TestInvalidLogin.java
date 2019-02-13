package scripts;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
public class TestInvalidLogin extends BaseTest {
	@Test
	public void testInvalidLogin() {
		LoginPage lp = new LoginPage(driver);
		for (int i = 1; i <= Lib.getRowCount("InvalidLogin"); i++) {
			String username = Lib.getCellValue("InvalidLogin", i, 0);
			lp.setUsername(username);
			String password = Lib.getCellValue("InvalidLogin", i, 1);
			lp.setPassword(password);
			lp.clickLogin();
		}
	}
}
