package ds.algo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Linked_List {
	
	@FindBy(xpath="//h5[text()='Linked List']/../a")WebElement GetStarted;
	//Introduction
	@FindBy(xpath="//a[text()='Introduction']")WebElement Introduction;
	@FindBy(xpath="//a[text()='Try here>>>']")WebElement TryHere;
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement Editor;
	@FindBy(xpath="//button[@type='button']")WebElement Run;
	
	
	//CreatingLinkedList
	@FindBy(xpath="//a[text()='Creating Linked LIst']")WebElement CreatingLinkedList;
	@FindBy(xpath="//a[text()='Try here>>>']")WebElement CreatingLinkedListInTryhere;
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement CreatingLinkedListEditor;
	@FindBy(xpath="//button[@type='button']")WebElement CreatingLinkedListRun;
	
	
	
	//TypesOfLinkedList
	@FindBy(xpath="//a[text()='Types of Linked List']")WebElement TypesOfLinkedList;
	@FindBy(xpath="//a[text()='Try here>>>']")WebElement TypesOfLinkedListInTryhere;
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement TypesOfLinkedListEditor;
	@FindBy(xpath="//button[@type='button']")WebElement TypesOfLinkedListRun;
	
	
	//ImplementLinkedListinPython
	@FindBy(xpath="//a[text()='Implement Linked List in Python']")WebElement ImplementLinkedListinPython;
	@FindBy(xpath="//a[text()='Try here>>>']")WebElement ImplementLinkedListinPythonInTryhere;
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement ImplementLinkedListinPythonEditor;
	@FindBy(xpath="//button[@type='button']")WebElement ImplementLinkedListinPythonRun;
	
	
	//Traversal
	@FindBy(xpath="//a[text()='Traversal']")WebElement Traversal;
	@FindBy(xpath="//a[text()='Try here>>>']")WebElement TraversalInTryhere;
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement TraversalEditor;
	@FindBy(xpath="//button[@type='button']")WebElement TraversalRun;
	
	
	
	
	//Insertion
	@FindBy(xpath="//a[text()='Insertion']")WebElement Insertion;
	@FindBy(xpath="//a[text()='Try here>>>']")WebElement InsertionInTryhere;
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement InsertionEditor;
	@FindBy(xpath="//button[@type='button']")WebElement InsertionRun;
	
	
	//Deletion
	@FindBy(xpath="//a[text()='Deletion']")WebElement Deletion;
	@FindBy(xpath="//a[text()='Try here>>>']")WebElement DeletionInTryhere;
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement DeletionEditor;
	@FindBy(xpath="//button[@type='button']")WebElement DeletionRun;
	
	
	
	
	public void linkedListGetStarted() 
	{
		GetStarted.click();
	}
	
	
	//Introduction
	public void Introduction() 
	{
		Introduction.click();
	}
	public void TryHere() 
	{
		TryHere.click();
	}
	public void Editor() 
	{
		Editor.sendKeys("print('Hello')");
	}
	public void Run() 
	{
		Run.click();
	}
	
	
	//CreatingLinkedList
	public void CreatingLinkedList()
	{
		CreatingLinkedList.click();
	}
	
	public void CreatingLinkedListInTryhere()
	{
		CreatingLinkedListInTryhere.click();
	}
	public void CreatingLinkedListEditor() 
	{
		CreatingLinkedListEditor.sendKeys("print('Hello')");
	}
	public void CreatingLinkedListRun() 
	{
		CreatingLinkedListRun.click();
	}
	
	
	
	//TypesOfLinkedList
	public void TypesOfLinkedList() 
	{
		TypesOfLinkedList.click();
	}
	public void TypesOfLinkedListInTryhere()
	{
		TypesOfLinkedListInTryhere.click();
	}
	public void TypesOfLinkedListEditor() 
	{
		TypesOfLinkedListEditor.sendKeys("print('Hello')");
	}
	public void TypesOfLinkedListRun() 
	{
		TypesOfLinkedListRun.click();
	}
	
	
	
	
	//ImplementLinkedListinPython
	public void ImplementLinkedListinPython() 
	{
		ImplementLinkedListinPython.click();
	}
	public void ImplementLinkedListinPythonInTryhere()
	{
		ImplementLinkedListinPythonInTryhere.click();
	}
	public void ImplementLinkedListinPythonEditor() 
	{
		ImplementLinkedListinPythonEditor.sendKeys("print('Hello')");
	}
	public void ImplementLinkedListinPythonRun() 
	{
		ImplementLinkedListinPythonRun.click();
	}
	
	
	//Traversal
	public void Traversal() 
	{
		Traversal.click();
	}
	public void TraversalInTryhere() 
	{
		TraversalInTryhere.click();
		
	}
	public void TraversalEditor() 
	{
		TraversalEditor.sendKeys("print('Hello')");
	}
	public void TraversalRun() 
	{
		TraversalRun.click();
	}
	
	
	
	
	
	//Insertion
	public void Insertion() 
	{
		Insertion.click();
	}
	public void InsertionInTryhere() 
	{
		InsertionInTryhere.click();
	}
	public void InsertionEditor() 
	{
		InsertionEditor.sendKeys("print('Hello')");
	}
	public void InsertionRun() 
	{
		InsertionRun.click();
	}
	
	
	
	
	//Deletion
	public void Deletion() 
	{
		Deletion.click();
	}public void DeletionInTryhere() 
	{
		DeletionInTryhere.click();
	}
	public void DeletionEditor() 
	{
		DeletionEditor.sendKeys("print('Hello')");
	}
	public void DeletionRun() 
	{
		DeletionRun.click();
	}
	
}