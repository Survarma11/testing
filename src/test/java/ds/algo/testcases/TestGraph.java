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
import org.testng.annotations.Test;

import com.google.common.graph.Graph;

import ds.algo.pages.DataStructure;
import ds.algo.pages.GraphPage;
import ds.algo.pages.SignIn;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;
import utility.TestBase;

import java.io.IOException;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TestGraph extends TestBase {
	
	private static Logger loggerObj = LogManager.getLogger(TestGraph.class);
	GraphPage GraphPageObj;
	
	@BeforeClass
	public void Driver() throws InterruptedException
	{
	    GraphPageObj = PageFactory.initElements(chromedriver, GraphPage.class);
	    GraphPageObj.driver = chromedriver;
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
    @Severity(SeverityLevel.BLOCKER)
    @Epic("Regression Tests")
    @Feature("Graph Tests")
    public void ClickGrpStdButton(){
    	GraphPageObj.GrGetStarted();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Graph Tests")
    public void ClickGraphTryHere() throws InterruptedException {
    	GraphPageObj.GrGetStarted();
    	GraphPageObj.InGraphClick();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Graph Tests")
    public void GraRun() throws InterruptedException{
    	GraphPageObj.GrGetStarted();
    	GraphPageObj.InGraphClick();
    	Thread.sleep(1000);
    	GraphPageObj.ClickRunGraph();
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Graph Tests")
    public void GraRep() throws InterruptedException {
    	GraphPageObj.GrGetStarted();
    	GraphPageObj.clickInnerGraph();
    	GraphPageObj.GrapPres();
    }

}

