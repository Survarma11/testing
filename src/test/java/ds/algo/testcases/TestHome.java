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

import ds.algo.pages.ArrayPage;
import ds.algo.pages.SignIn;
import ds.algo.pages.banner;
import ds.algo.pages.homepage;
import ds.algo.pages.registerpage;
import ds.algo.pages.welcomepage;
import utility.TestBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TestHome extends TestBase{
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	homepage HomeObj;
	banner BannerObj;
	
	
	@BeforeClass
	public void Driver() throws InterruptedException
	{
		loggerObj.info("Before Class of Class Home Executing");
		HomeObj = PageFactory.initElements(chromedriver, homepage.class);
		BannerObj = PageFactory.initElements(chromedriver, banner.class);
		HomeObj.driver = chromedriver;
	}
	
	@BeforeMethod
	public void OpenPortal() throws InterruptedException
	{
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
	    Obj.clickGetStarted();
	    loggerObj.info("Running Before Method");
	}
		 
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Home Tests")
	public void TesthomeTitle() throws InterruptedException
	{
	    Thread.sleep(2000);
	    
	    HomeObj.validateDataStructureTitle();
	    HomeObj.validateArrayTitle();
	    HomeObj.validateLinkedListTitle();
	    HomeObj.validateStackTitle();
	    HomeObj.validateQueueTitle();
	    HomeObj.validateTreeTitle();
	    HomeObj.validateGraphTitle();
	    }
	
	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Epic("Regression Tests")
	@Feature("Home Tests")
	public void TestDropDown() throws InterruptedException
	{
	    BannerObj.clickDataStructureDropDown();
	    BannerObj.validatingArray();
	    BannerObj.validatingStack();
	    BannerObj.validatingLinkedList();
	    BannerObj.validatingQueue();
	    BannerObj.validatingTree();
	    BannerObj.validatingGraph();
	    loggerObj.info("Validating Banner Title");
	    }
	
	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Epic("Regression Tests")
	@Feature("Home Tests")
	public void TestClickDropDownArry() throws InterruptedException
	{
	    
	    BannerObj.clickDataStructureDropDown();
	    BannerObj.ClickArray();
	    HomeObj.ValidateMesg();
	    loggerObj.info("Checking DropDrown Button");
	}
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Home Tests")
	public void TestDataStructureGetStarted() throws InterruptedException
	{ 
	    HomeObj.clickDataStructureGetStarted();
	    HomeObj.ValidateMesg();
	    loggerObj.info("Clicking GetStarted Button");
	}
	
	public void TestClickSignIn() throws InterruptedException
	{
	    BannerObj.clickSignIn();
	    SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
	    SignInObj.ValidateSignInPage();
	    loggerObj.info("Clicking SignIn");
	}
	
	public void TestClickRegister() throws InterruptedException
	{
		BannerObj.clickRegister();
		registerpage RegiObj = PageFactory.initElements(chromedriver,registerpage.class);
		RegiObj.ValidateRegister();
		loggerObj.info("Clicking Register");
	}

}
