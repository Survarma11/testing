package ds.algo.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ds.algo.listeners.TestListener;
import ds.algo.pages.ArrayPage;
import ds.algo.pages.DataStructure;
import ds.algo.pages.SignIn;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;
import utility.TestBase;

import java.io.IOException;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel; 


@Listeners(TestListener.class)
@Epic("Regression Tests")
@Feature("Array Tests")
public class TestArray extends TestBase {

	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	ArrayPage TestArrayObj;
	
	
	@BeforeClass
	public void Driver() throws InterruptedException
	{
	    TestArrayObj = PageFactory.initElements(chromedriver,ArrayPage.class);
	    TestArrayObj.driver = chromedriver;
	    loggerObj.info("Before Suite of Class TestQueue Executing");
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
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Array Tests")
    public void GetStarted(){
    	TestArrayObj.CkArrayGetSt();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Array Tests")
    public void ArraysinPython(){
    	TestArrayObj.CkArrayGetSt();
    	TestArrayObj.CkArrayPython();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Array Tests")
    public void ArrayTryHere(){
    	TestArrayObj.CkArrayGetSt();
    	TestArrayObj.CkArrayPython();
    	TestArrayObj.CkTryHere();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Array Tests")
    public void ClickRun1(){
    	TestArrayObj.CkArrayGetSt();
    	TestArrayObj.CkArrayPython();
    	TestArrayObj.CkTryHere();
    	TestArrayObj.CkPyRun();
    }
   @Test
   @Severity(SeverityLevel.CRITICAL)
   @Epic("Regression Tests")
   @Feature("Array Tests")
    public void ClickRun2() throws InterruptedException{
	   TestArrayObj.CkArrayGetSt();
	   TestArrayObj.CkArrayPython();
	   Thread.sleep(1000);
	   TestArrayObj.ClickArrayUsingList();
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Array Tests")
    public void ClickBasOperList() throws InterruptedException {
    	TestArrayObj.CkArrayGetSt();
    	TestArrayObj.CkArrayPython();
    	TestArrayObj.BasicOperationList();
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Array Tests")
    public void ClickApplicationArray() throws InterruptedException {
    	TestArrayObj.CkArrayGetSt();
    	TestArrayObj.CkArrayPython();
    	TestArrayObj.ApplicationOfArray();
    }

}

