package Steps;

import org.openqa.selenium.support.PageFactory;

import Pages.TestBase;
import Pages.skyBlueBackground;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class skyBlueBackgroundStep extends TestBase {

	static skyBlueBackground sBB;

	@Before
	public static void before() {

		initDriver();
		try {
			sBB = PageFactory.initElements(driver, skyBlueBackground.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("^the user is on techfios test page$")
	public void the_user_is_on_techfios_test_page() {
		driver.get("https://techfios.com/test/101/");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@When("^user presses the sky blue Background button$")
	public void user_presses_the_sky_blue_Background_button() {
		sBB.clickSkyBlueButton();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		sBB.BackgroundColor();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("^user presses the White Background button$")
	public void user_presses_the_White_Background_button() {
		sBB.clickWhiteButton();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("^the background color will change to White$")
	public void the_background_color_will_change_to_White() {
		sBB.WhiteBackgroundColor();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() {
		driver.close();

		driver.quit();
	}
}