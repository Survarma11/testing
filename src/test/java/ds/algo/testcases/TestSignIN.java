package ds.algo.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ds.algo.pages.SignIn;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import utility.TestBase;
import utility.dataProvider;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;


public class TestSignIN extends TestBase {
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	
	@BeforeClass
	public void logout() throws InterruptedException
	{
		SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
	    Obj.clickGetStarted();
		SignInObj.ClickLogOut();
		
	}

	@BeforeMethod
	 public void OpenPortal() throws InterruptedException
		{
			chromedriver.get("https://dsportalapp.herokuapp.com/");
			welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
		    Obj.clickGetStarted();
		    banner BannerObj = PageFactory.initElements(chromedriver, banner.class);
		    BannerObj.clickSignIn();
			
		}
	
	@Test
	@Severity(SeverityLevel.NORMAL)
	@Epic("Regression Tests")
	@Feature("SignIN Tests")
	public void AllfieldEmpty()
	{
		SignInObj.ClickLogin();
		JavascriptExecutor js = (JavascriptExecutor) chromedriver;
		Boolean isValidInput =(Boolean)js.executeScript("return arguments[0].checkValidity();",SignInObj.UserName);
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;",SignInObj.UserName);
	}
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("SignIN Tests")
	public void PasswrdEmpty()
	{
		SignInObj.EnterUserName("sur");
		SignInObj.ClickLogin();
		JavascriptExecutor js = (JavascriptExecutor) chromedriver;
		Boolean isValidInput =(Boolean)js.executeScript("return arguments[0].checkValidity();",SignInObj.Password);
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;",SignInObj.Password);
	}
	
	@Test
	@Severity(SeverityLevel.NORMAL)
	@Epic("Regression Tests")
	@Feature("SignIN Tests")
	public void EmptyUserPwd()
	{
		SignInObj.EnterUserName("sur");
		SignInObj.ClickLogin();
		
	}
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("SignIN Tests")
	public void InvalidUserPwd()
	{
		SignInObj.EnterUserName("Surbhi12");
		SignInObj.EnterPassword("234");
		SignInObj.ClickLogin();
		SignInObj.ShowInvalidUserPwd();
	}
	
	@Test(dataProvider="InvalidUsername",dataProviderClass=dataProvider.class)
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("SignIN Tests")
	public void InvalidUserName(String username)
	{
		SignInObj.EnterUserName(username);
		SignInObj.EnterPassword("Dongle12");
		SignInObj.ClickLogin();
		SignInObj.ShowInvalidUserPwd();
	}
	
	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Epic("Regression Tests")
	@Feature("SignIN Tests")
	public void SucessLogin() throws InterruptedException
	{
		this.OpenPortal();
		SignIn SignObj = PageFactory.initElements(chromedriver,SignIn.class);
		SignObj.EnterUserName("Surbhi1211");
		SignObj.EnterPassword("Dongle1211");
		SignObj.ClickLogin();
		String mesg=SignObj.ShowSucessMesg();
		System.out.println(mesg);
		Assert.assertEquals(mesg,"You are logged in");

		String ActualUserName= SignObj.GetUserName();
		Assert.assertEquals(ActualUserName,"Surbhi1211");
	}
	
	
}
