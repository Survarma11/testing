package ds.algo.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ds.algo.pages.welcomepage;
import utility.TestBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


public class TestDsAlgoPortal extends TestBase {
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	
	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Epic("Regression Tests")
	@Feature("Portal Tests")

	public void TestOpenPortal() throws InterruptedException 
	{
    chromedriver.get("https://dsportalapp.herokuapp.com/");
    welcomepage WelcomepageObj =  PageFactory.initElements(chromedriver, welcomepage.class);
    WelcomepageObj.clickGetStarted();
    WelcomepageObj.validateGetStarted();
    WelcomepageObj.validateheading1();
    WelcomepageObj.validateheading2();
	loggerObj.info("User Succesfully open the Welcome Page");
	}
	
	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Epic("Regression Tests")
	@Feature("Portal Tests")

	public void TestGetStarted() throws InterruptedException
	{
	welcomepage PageObj =  PageFactory.initElements(chromedriver, welcomepage.class);
	chromedriver.get("https://dsportalapp.herokuapp.com/");
	loggerObj.info("User Succesfully Click on Get started");
	PageObj.clickGetStarted();
	
	}
}
