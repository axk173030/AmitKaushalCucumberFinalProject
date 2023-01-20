package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class skyBlueBackground extends TestBase {
	WebDriver driver;

	public skyBlueBackground(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SkyBlue_Button_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement White_Button_Element;
	@FindBy(how = How.CSS, using = "body[style='background-color: skyblue;']")
	WebElement Background_color_Element;
	@FindBy(how = How.CSS, using = "body[style='background-color: white;']")
	WebElement White_Background_color_Element;

	public void clickSkyBlueButton() {
		SkyBlue_Button_Element.click();
	}

	public void BackgroundColor() {
		String color = Background_color_Element.getAttribute("style");
		System.out.println("background color is:" + color);
	}

	public void clickWhiteButton() {
		White_Button_Element.click();
	}

	public void WhiteBackgroundColor() {
		String color1 = White_Background_color_Element.getAttribute("style");
		System.out.println("background color is:" + color1);

	}
}