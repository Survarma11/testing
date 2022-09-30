package ds.algo.testcases;

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
import org.testng.annotations.Test;
import ds.algo.pages.SignIn;
import ds.algo.pages.Tree;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;
import utility.TestBase;
import utility.Screenshot;
import java.io.IOException;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


public class TestTree extends TestBase{
	Tree TreeObj;
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	
	@BeforeClass
	public void Driver()
	{
	    TreeObj = PageFactory.initElements(chromedriver,Tree.class);
	    TreeObj.driver = chromedriver;
	}
	
	@BeforeMethod

	public void OpenPortal() throws InterruptedException
	{
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
	    Obj.clickGetStarted();
	    loggerObj.info("BeforeClass Executing");
}
	@AfterMethod
	public void takeScreenshotOnFailure(ITestResult testResult) throws IOException
	{
		if(testResult.getStatus()== ITestResult.FAILURE) {
		String Filename = "data\\screenshots\\"+testResult.getName()+"-"
				+Arrays.toString(testResult.getParameters())+".png";
		Screenshot scr = new Screenshot();
		scr.CaptureScreenShot(chromedriver, Filename);
	   }	
	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Epic("Regression Tests")
	@Feature("Tree Tests")
	public void TestTreeStarted()
	{
		TreeObj.ClickGetStarted();
		Assert.assertEquals(TreeObj.GetTitleTreePage(), "Tree");
		loggerObj.info("Tree Get Started Succesfully");
	}
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Tree Tests")
	public void TestOverview()
	{
		TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		Assert.assertEquals(TreeObj.GetOverviewTreeTab(),"Overview of Trees");
		loggerObj.info("Succesfully open Overview of Trees");
	}
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Regression Tests")
	@Feature("Tree Tests")
    public void TestClickGetTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		Thread.sleep(1000);
    	TreeObj.ClickGetTryHere();
    	loggerObj.info("Succesfully open OverviewOfTreeTryHere");
    }
	
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestGetTabRun() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    	loggerObj.info("Clicking Run Tab ");
    }
    
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTerminologies()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickTerminologies();
    	Assert.assertEquals(TreeObj.GetTabTerminologies(), "Terminologies");
    	loggerObj.info("Succesfully open Test Terminologies");
    }
    
    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTerminologiesTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickTerminologies();
    	TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    
    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTypesOfTree()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickTypesOfTree();
    	Assert.assertEquals(TreeObj.GetTabTypesofTrees(),"Types of Trees");
    	loggerObj.info("Succesfully open TypesOfTree");
    }
    
    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTypesOfTreeTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickTypesOfTree();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    	
    }
    
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTraversal()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTreeTraversals();
		Assert.assertEquals(TreeObj.GetTabTreeTraversals(),"Tree Traversals");
		loggerObj.info("Succesfully open Traversal");
    
}
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTraversalTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTreeTraversals();
		Assert.assertNotNull(TreeObj.GetTryHere);
		TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    
}
    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTraversalsIllustration()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTraversalsIllustration();
		Assert.assertEquals(TreeObj.GetTabTraversalsIllustration(),"Traversals-Illustration");
		loggerObj.info("Succesfully open TraversalsIllustration");
    
}
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTraversalsIllustrationTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTraversalsIllustration();
		Assert.assertNotNull(TreeObj.GetTryHere);
		TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    }
    
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestBinaryTrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinaryTrees();
		Assert.assertEquals(TreeObj.GetTabBinaryTrees(),"Binary Trees");
		loggerObj.info("Succesfully open  TestBinaryTrees");
}
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestBinaryTreesTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinaryTrees();
		Assert.assertNotNull(TreeObj.GetTryHere);
		TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    }
    
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTypesOfBinaryTrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTypesOfBinaryTrees();
		Assert.assertEquals(TreeObj.GetCompleteBinarytree(),"Complete Binary tree");
		loggerObj.info("Succesfully open TypesOfBinaryTrees");
}
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestTypesOfBinaryTreesTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTypesOfBinaryTrees();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    }
    
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestImplementationinPython()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationinPython();
		Assert.assertEquals(TreeObj.GetTabImplementationinPython(),"Implementation in Python");
		loggerObj.info("Succesfully open ImplementationinPython");
}
    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestImplementationinPythonTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationinPython();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    	loggerObj.info("Clicking ImplementationinPythonTryHere");
    }
    
    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestBinaryTreeTraversals()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinaryTreeTraversals();
		Assert.assertEquals(TreeObj.GetTabBinaryTreeTraversals(),"Binary Tree Traversals");
		loggerObj.info("Succesfully open BinaryTreeTraversals");
    }
    
    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestBinaryTreeTraversalsTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinaryTreeTraversals();
    	Assert.assertNotNull(TreeObj.GetTryHere);
		TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    }
    
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestImplementationofBinaryTrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationofBinaryTrees();
		Assert.assertEquals(TreeObj.GetTabImplementationofBinaryTrees(),"Implementation of Binary Trees");
		loggerObj.info("Succesfully open ImplementationofBinaryTrees");
    } 
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestImplementationofBinaryTreesTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationofBinaryTrees();
    	Assert.assertNotNull(TreeObj.GetTryHere);
		TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    	loggerObj.info("Clicking ImplementationofBinaryTreesTryHere");
    }
    
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestApplicationsofBinarytrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickApplicationsofBinarytrees();
		Assert.assertEquals(TreeObj.GetTabApplicationsofBinarytrees(),"Applications of Binary trees");
		loggerObj.info("Succesfully open ApplicationsofBinarytrees");
    }
    
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestApplicationsofBinarytreesTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickApplicationsofBinarytrees();
		TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestBinarySearchTrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinarySearchTrees();
		Assert.assertEquals(TreeObj.GetTabBinarySearchTrees(),"Binary Search Trees");
		loggerObj.info("Succesfully open BinarySearchTrees");
    } 
    
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestBinarySearchTreesTryHere() throws InterruptedException
    {   
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinarySearchTrees();
		TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestImplementationOfBST()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationOfBST();
		Assert.assertEquals(TreeObj.GetTabImplementationOfBST(),"Implementation Of BST");
		loggerObj.info("Succesfully open ImplementationOfBST");
    } 
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestImplementationOfBSTTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationOfBST();
    	Assert.assertNotNull(TreeObj.GetTryHere);
		TreeObj.ClickGetTryHere();
    	TreeObj.ClickRunTree();
    	Assert.assertEquals(TreeObj.TreeRunButt.getText(),"Run");
    	loggerObj.info("Clicking ImplementationOfBSTTryHere");
    }
    
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Regression Tests")
    @Feature("Tree Tests")
    public void TestPracticeQuestions()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickPracticeQuestions();
		loggerObj.info("Succesfully open PracticeQuestions");
    } 
}
