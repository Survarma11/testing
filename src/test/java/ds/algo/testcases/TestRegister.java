package ds.algo.testcases;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
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

import ds.algo.pages.SignIn;
import ds.algo.pages.banner;
import ds.algo.pages.registerpage;
import ds.algo.pages.welcomepage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import utility.TestBase;
import utility.dataProvider;


public class TestRegister extends TestBase {
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	banner BannerObj;
	SignIn SignInObj;
	
	@BeforeClass
	public void BannerPortal() throws InterruptedException
	{
		loggerObj.info("Starting before class");
	    BannerObj = PageFactory.initElements(chromedriver, banner.class);
	    loggerObj.info("Completed before suite");
		SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
	    Obj.clickGetStarted();
		SignInObj.ClickLogOut();
	}
	
	@AfterClass
	public void LoginAgain() throws InterruptedException
	{
		TestHome HomeObj = new TestHome();
		HomeObj.SucessLogin();
	}
	
	@BeforeMethod
	public void OpenPortal() throws InterruptedException
	{
	loggerObj.info("Starting before method");
	chromedriver.get("https://dsportalapp.herokuapp.com/");
	welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
    Obj.clickGetStarted();
    BannerObj.clickRegister();
	}

	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Register Tests")
	public void TestAllFieldsEmpty()
	{
		loggerObj.info("Starting test case TestAllFieldsEmpty");
		registerpage RegisterObj = PageFactory.initElements(chromedriver, registerpage.class);
		RegisterObj.ClickRegisterButton();
		JavascriptExecutor js = (JavascriptExecutor) chromedriver;
		Boolean isValidInput = (Boolean)js.executeScript("return arguments[0].checkValidity();", RegisterObj.UserName);
		loggerObj.info("Asserting valid input or not");
		Assert.assertFalse(isValidInput);
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;", RegisterObj.UserName);
		loggerObj.info("Asserting error message");
		Assert.assertEquals(validationMessage, "Please fill out this field.");
		loggerObj.info("Completed test case TestAllFieldsEmpty");
	}

	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Register Tests")
	
	public void TestUserNameInField()
	{
	registerpage RegisterObj = PageFactory.initElements(chromedriver, registerpage.class);
	RegisterObj.SetUserName("Surbhi");
	RegisterObj.ClickRegisterButton();
	JavascriptExecutor js = (JavascriptExecutor) chromedriver;
	Boolean isValidInput = (Boolean)js.executeScript("return arguments[0].checkValidity();",RegisterObj.Password);
	String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;",RegisterObj.Password);
	Assert.assertEquals(validationMessage, "Please fill out this field.");
	loggerObj.info("Completed test case with only UserName");
		
	}
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Register Tests")
	public void TestPassword()
	{
		registerpage RegisterObj = PageFactory.initElements(chromedriver, registerpage.class);
		RegisterObj.SetUserName("Surbhi");
		RegisterObj.SetPassword("H12345678");
		RegisterObj.ClickRegisterButton();
		JavascriptExecutor js = (JavascriptExecutor) chromedriver;
		Boolean isValidInput = (Boolean)js.executeScript("return arguments[0].checkValidity();",RegisterObj.PasswordConfirm);
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;",RegisterObj.PasswordConfirm);
		Assert.assertEquals(validationMessage, "Please fill out this field.");
		loggerObj.info("Completed test case without entering ConfirmPassword");
	}
	@Test(dataProvider="WrongConfirmPasswrd",dataProviderClass=dataProvider.class)
	@Severity(SeverityLevel.NORMAL)
	@Epic("Regression Tests")
	@Feature("Register Tests")
	public void TestwrongPasswordConfirm(String usr, String pwd, String Cnpwd)
	{
		registerpage RegisterObj = PageFactory.initElements(chromedriver, registerpage.class);
		RegisterObj.SetUserName(usr);
		RegisterObj.SetPassword(pwd);
		RegisterObj.SetPasswordConfirm(Cnpwd);
		RegisterObj.ClickRegisterButton();
		String messg = RegisterObj.geterrormessage();
		Assert.assertEquals(messg,"password_mismatch:The two password fields didn’t match.");
		loggerObj.info("Completed test case with wrong password");
	}
	@Test(priority = 2, description="lower number")
	@Severity(SeverityLevel.NORMAL)
	@Epic("Regression Tests")
	@Feature("Register Tests")
	public void TestLessDigitPassword()
	{
        registerpage RegisterObj = PageFactory.initElements(chromedriver, registerpage.class);
		RegisterObj.SetUserName("Surbhi");
		RegisterObj.SetPassword("H123");
		RegisterObj.SetPasswordConfirm("H123");
		RegisterObj.ClickRegisterButton();
		String messg = RegisterObj.geterrormessage();
		Assert.assertEquals(messg,"password_mismatch:The two password fields didn’t match.");
		loggerObj.info("Completed test case with invalid type password ");
	}
	
	
	@Test(dataProvider="numberedPassword", dataProviderClass=dataProvider.class)
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Register Tests")
	public void TestOnlyNumberPaswrd(String pwd)
	{
		registerpage RegisterObj = PageFactory.initElements(chromedriver, registerpage.class);
		RegisterObj.SetUserName("Surbhi");
		RegisterObj.SetPassword(pwd);
		RegisterObj.SetPasswordConfirm(pwd);
		RegisterObj.ClickRegisterButton();
		String messg = RegisterObj.geterrormessage();
		Assert.assertEquals(messg,"password_mismatch:The two password fields didn’t match.");
		loggerObj.info("Completed test case with only numbers in password");
	}
	
	@Test(priority = 3, description="all input correct")
	@Severity(SeverityLevel.BLOCKER)
	@Epic("Regression Tests")
	@Feature("Register Tests")
	public void TestAllInputCorrect() throws InterruptedException
	{
		Random rand = new Random();
		int var = rand.nextInt(10000);
		registerpage RegisterObj = PageFactory.initElements(chromedriver, registerpage.class);
		RegisterObj.SetUserName("Surbhi"+String.valueOf(var));
		RegisterObj.SetPassword("Dongle957");
		RegisterObj.SetPasswordConfirm("Dongle957");
		RegisterObj.ClickRegisterButton();
		Thread.sleep(2000);
		String Mesg=RegisterObj.GetSuccessMesg();
		System.out.println(Mesg);
		Assert.assertTrue(Mesg.contains("New Account Created. You are logged in as"));
		BannerObj.clickSignOut();
		loggerObj.info("Completed test case with all correct input");
	}
}






