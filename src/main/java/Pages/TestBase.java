package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	public  static WebDriver driver;
	public static void initDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	}
/*	public void takeScreenShots(WebDriver driver) {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourceFile =ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter= new SimpleDateFormat("MMddyy_HHmmss");
	Date date = new Date();
	String label= formatter.format(date);
	
	try {
		FileUtils.copyFile(sourceFile,File(System.getProperty("user.dir")+"/screenshots/"+label+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	
	}


