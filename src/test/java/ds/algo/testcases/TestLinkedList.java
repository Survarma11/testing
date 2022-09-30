package ds.algo.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ds.algo.pages.Linked_List;
import ds.algo.pages.Queue;
import ds.algo.pages.SignIn;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;
import utility.TestBase;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("Regression Tests")
@Feature("Linked List Tests")
public class TestLinkedList extends TestBase {
	Linked_List LLObj;
	
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	
	@BeforeClass
	public void Driver()
	{
	    LLObj = PageFactory.initElements(chromedriver,Linked_List.class);
	    loggerObj.info("Before Suite of Class TestQueue Executing");
	}
	

@BeforeMethod
public void OpenPortal() throws InterruptedException
	{
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
	    Obj.clickGetStarted();
	    loggerObj.info("Before Method Executing");
	    LLObj.linkedListGetStarted();
    }

@Test
@Severity(SeverityLevel.BLOCKER)
public void TestStarted()
{
	LLObj.Introduction();
	LLObj.TryHere();
	LLObj.Editor();
	LLObj.Run();
}

@Test
@Severity(SeverityLevel.CRITICAL)
public void CreateList() 
{
	//CreatingLinkedList
	LLObj.CreatingLinkedList();
	LLObj.CreatingLinkedListInTryhere();
	LLObj.CreatingLinkedListEditor();
	LLObj.CreatingLinkedListRun();
}

@Test
@Severity(SeverityLevel.CRITICAL)
public void TypeOfList()
{
	LLObj.TypesOfLinkedList();
	LLObj.TypesOfLinkedListInTryhere();
	LLObj.TypesOfLinkedListEditor();
	LLObj.TypesOfLinkedListRun();
}

@Test
@Severity(SeverityLevel.CRITICAL)
public void ImplementLinkedList()
{
	LLObj.ImplementLinkedListinPython();
	LLObj.ImplementLinkedListinPythonInTryhere();
	LLObj.ImplementLinkedListinPythonEditor();
	LLObj.ImplementLinkedListinPythonRun();
}

@Test
@Severity(SeverityLevel.CRITICAL)
public void ListTraversal()
{
	LLObj.Traversal();
	LLObj.TraversalInTryhere();
	LLObj.TraversalEditor();
	LLObj.TraversalRun();
}

@Test
@Severity(SeverityLevel.CRITICAL)
public void ListInsertion()
{
	LLObj.Insertion();
	LLObj.InsertionInTryhere();
	LLObj.InsertionEditor();
	LLObj.InsertionRun();
}

@Test
@Severity(SeverityLevel.CRITICAL)
public void ListDeletion()
{
	LLObj.Deletion();
	LLObj.DeletionInTryhere();
	LLObj.DeletionEditor();
	LLObj.DeletionRun();
}

}
