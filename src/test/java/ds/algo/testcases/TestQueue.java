package ds.algo.testcases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ds.algo.listeners.TestListener;
import ds.algo.pages.Queue;
import ds.algo.pages.SignIn;
import ds.algo.pages.Tree;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;
import utility.TestBase;
import utility.Screenshot;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners(TestListener.class)
@Epic("Regression Tests")
@Feature("Queue Tests")
public class TestQueue extends TestBase{
	Queue QueueObj;
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	
	@BeforeClass
	public void Driver() throws InterruptedException
	{
	    QueueObj = PageFactory.initElements(chromedriver,Queue.class);
	    loggerObj.info("Before Suite of Class TestQueue Executing");
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
	    Obj.clickGetStarted();
	    banner BannerObj = PageFactory.initElements(chromedriver, banner.class);
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
		@Feature("Queue Tests")
		public void TestStarted()
		{
			QueueObj.GetStartedQueue();
			Assert.assertEquals(QueueObj.GetTabQueue(), "Queue");
			loggerObj.info("Queue Get Started");
		}
		@Test
		@Severity(SeverityLevel.CRITICAL)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestImplementationofQueueinPython()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationofQueueinPython();
			Assert.assertEquals(QueueObj.GetImplementationofQueueinPython(), "Implementation of Queue in Python");
			loggerObj.info("Clicking ImplementationofQueueinPython");
		}
		@Test
		@Severity(SeverityLevel.CRITICAL)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestImplementationofQueueinPythonTryHere()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationofQueueinPython();
			QueueObj.ClickGetTryHere();
			Assert.assertEquals(QueueObj.GetTabRun(),"Run");
			loggerObj.info("Clicking ImplementationofQueueinPythonTryHere");
		}
		
		@Test
		@Severity(SeverityLevel.CRITICAL)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestImplementationusingcollectionsdeque()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingcollectionsdeque();
			Assert.assertEquals(QueueObj.GetImplementationusingcollectionsdeque(), "Implementation using collections.deque");
			loggerObj.info("Clicking Implementationusingcollectionsdeque");
		}
		@Test
		@Severity(SeverityLevel.NORMAL)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestImplementationusingcollectionsdequeFailed()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingcollectionsdeque();
			Assert.assertEquals(QueueObj.GetImplementationusingcollectionsdeque(), "Implementation using collections.deque  Art");
			loggerObj.info("Failed to find Implementation using collections.deque  Art");
		}
		@Test
		@Severity(SeverityLevel.NORMAL)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestImplementationusingcollectionsdequeTryHere()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingcollectionsdeque();
			QueueObj.ClickGetTryHere();
			Assert.assertEquals(QueueObj.GetTabRun(),"Run");
			loggerObj.info("Clicking ImplementationusingcollectionsdequeTryHere");
		}
		@Test
		@Severity(SeverityLevel.NORMAL)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestImplementationusingarray()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingarray();
			Assert.assertEquals(QueueObj.GetImplementationusingarray(), "Implementation using array");
			loggerObj.info("Clicking Implementationusingarray");
		}
		
		
		@Test
		@Severity(SeverityLevel.CRITICAL)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestImplementationusingarrayTryHere()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingarray();
			QueueObj.ClickGetTryHere();
			Assert.assertEquals(QueueObj.GetTabRun(),"Run");
			loggerObj.info("ClickingUser ImplementationusingarrayTryHere");
		}
		@Test
		@Severity(SeverityLevel.NORMAL)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestQueueOperations()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickQueueOperations();
			Assert.assertEquals(QueueObj.GetQueueOperations(), "Queue Operations");
			loggerObj.info("Clicking QueueOperations");
		}
		@Test
		@Severity(SeverityLevel.MINOR)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestQueueOperationsFailed()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickQueueOperations();
			Assert.assertEquals(QueueObj.GetQueueOperations(), "Queue Operations sucess");
			loggerObj.info("Failed to find Queue Operations sucess");
		}
		@Test
		@Severity(SeverityLevel.MINOR)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestQueueOperationsTryHere()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickQueueOperations();
			QueueObj.ClickGetTryHere();
			Assert.assertEquals(QueueObj.GetTabRun(),"Run");
			loggerObj.info("Clicking QueueOperationsTryHere");
		}
		@Test
		@Severity(SeverityLevel.NORMAL)
		@Epic("Regression Tests")
		@Feature("Queue Tests")
		public void TestPracticeQuestions()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickQueueOperations();
			QueueObj.ClickPracticeQuestions();
			loggerObj.info("Clicking TestPracticeQuestions");
		}
		
}
