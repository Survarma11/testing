package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import ds.algo.listeners.TestListener;
import ds.algo.pages.SignIn;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TestBase {

public static WebDriver chromedriver;
public static Boolean initialized=false;
public SignIn SignInObj;

@BeforeSuite
public void initDriver() throws InterruptedException
{
	
	if (!TestBase.initialized) {
		SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		initialization();
		SucessLogin();
	}
}

public static void initialization(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\surbh\\eclipse-workspace\\ds\\src\\test\\resources\\chromedriver.exe");
	chromedriver = new ChromeDriver();
	chromedriver.manage().window().maximize();
	chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

public void SucessLogin() throws InterruptedException
{
	chromedriver.get("https://dsportalapp.herokuapp.com/");
	welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
    Obj.clickGetStarted();
    banner BannerObj = PageFactory.initElements(chromedriver, banner.class);
    BannerObj.clickSignIn();
	SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
	SignInObj.EnterUserName("Surbhi1211");
	SignInObj.EnterPassword("Dongle1211");
	SignInObj.ClickLogin();
	initialized = true;
}

@AfterMethod
public void checkFailures(ITestResult testResult) {
	if (testResult.getStatus() == ITestResult.FAILURE) {
		TestListener listnerObj = new TestListener();;
		listnerObj.saveTextLog("Screenshot captured for test case: " + listnerObj.getTestMethodName(testResult));
		listnerObj.saveScreenshot(((TakesScreenshot)chromedriver).getScreenshotAs(OutputType.BYTES));
	}
}

@AfterSuite
public void closeBrowser() {
	chromedriver.close();
}



}
