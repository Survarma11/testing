package ds.algo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Stack {
	public WebDriver driver;
	@FindBy (xpath="//h5[text()=\"Stack\"]/../a")WebElement StackGetStarted;
	@FindBy(xpath="//a[text()=\"Operations in Stack\"]") WebElement OperationsinStack;
	@FindBy(xpath="//a[text()=\"Try here>>>\"]") WebElement TryHere;
	@FindBy(xpath="//div[@class=\"input\"]")WebElement TextBox;
	@FindBy(xpath="//button[text()=\"Run\"]")WebElement Run;
	@FindBy(xpath="//a[text()=\"Implementation\"]") WebElement Implementation;
	//@FindBy(xpath="//a[text()=\"Try here>>>\"]")WebElement ImplementationTryHere;
	//@FindBy(xpath="//button[text()=\"Run\"]")WebElement ImplementationRun;	
	@FindBy(xpath="//a[text()='Applications']")WebElement Applications;

public void ClickStackGetStarted()
{
	StackGetStarted.click();
}
public void ClickOperationsinStack()
{
	OperationsinStack.click();
}
public void ClickTryHere()
{
	TryHere.click();
}
public void WriteInTextBox() throws InterruptedException
{
	Actions Run = new Actions(driver);
    Thread.sleep(1000);
    Run.sendKeys("print(\"Stack is Running\")");
    Run.perform();
}
public void ClickRun()
{
	Run.click();
}

public void ClickImplementation()
{
	Implementation.click();
}
public void ClickApplications()
{
	Applications.click();
}
}