package ds.algo.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ds.algo.pages.Queue;
import ds.algo.pages.SignIn;
import ds.algo.pages.Stack;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;
import utility.TestBase;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


public class TestStack extends TestBase {
	private static Logger loggerObj = LogManager.getLogger(TestStack.class);
	Stack StackObj;
	
@BeforeClass
public void Driver()
{
	StackObj = PageFactory.initElements(chromedriver,Stack.class);
    StackObj.driver= chromedriver;
}
	
	@BeforeMethod
	public void OpenPortal() throws InterruptedException
	{
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
		Obj.clickGetStarted();
		loggerObj.info("Before Method Executing");
	}
	
	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestGetStartedStack()
	{
		StackObj.ClickStackGetStarted();
	}
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestOperationsinStack()
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickOperationsinStack();
	}
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestOperationsinStackTryHere()
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickOperationsinStack();
		StackObj.ClickTryHere();
	}
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestWriteInTextBox() throws InterruptedException
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickOperationsinStack();
		StackObj.ClickTryHere();
		Thread.sleep(1000);
		StackObj.WriteInTextBox();
	}
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestclickRun() throws InterruptedException
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickOperationsinStack();
		StackObj.ClickTryHere();
		StackObj.WriteInTextBox();
		StackObj.ClickRun();
	}
	@Test
	@Severity(SeverityLevel.NORMAL)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestImplementation()
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickImplementation();
	}
	@Test
	@Severity(SeverityLevel.NORMAL)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestImplementationTryHere()
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickImplementation();
		StackObj.ClickTryHere();
	}
	@Test
	@Severity(SeverityLevel.NORMAL)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestImplementationTextBox() throws InterruptedException
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickImplementation();
		StackObj.ClickTryHere();
		StackObj.WriteInTextBox();
		StackObj.ClickRun();
	}
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestApplictions()
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickApplications();
	}
	
	@Test
	@Severity(SeverityLevel.MINOR)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestApplictionsTryHere()
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickApplications();
		StackObj.ClickTryHere();
	}
	
	@Test
	@Severity(SeverityLevel.MINOR)
	@Epic("Regression Tests")
	@Feature("Stack Tests")
	public void TestAppilcationsRun() throws InterruptedException
	{
		StackObj.ClickStackGetStarted();
		StackObj.ClickApplications();
		StackObj.ClickTryHere();
		StackObj.WriteInTextBox();
		StackObj.ClickRun();
	}
}