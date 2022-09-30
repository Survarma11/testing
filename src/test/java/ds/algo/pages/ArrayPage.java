package ds.algo.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ArrayPage {

    @FindBy(xpath = "//a[@href='array']")
    WebElement ArrayStart;
    @FindBy(xpath = "//a[@href='arrays-in-python']")
    WebElement ArrayPython;
    @FindBy(xpath = "//a[@href='/tryEditor']")
    WebElement PyTryHere;
    @FindBy(xpath = "//button[@type='button']")
    WebElement PyRun;
    @FindBy(id = "output")
    WebElement RunResult;
    @FindBy(xpath = "//a[@href='/array/arrays-using-list/'] ")
    WebElement ArrayUsingList;
    @FindBy(xpath = "//a[@href='/array/basic-operations-in-lists/'] ")
    WebElement BasOperList;
    @FindBy(xpath = "//a[@href='/array/applications-of-array/']")
    WebElement AppliOfArray;
    @FindBy(xpath = "//a[@href='/array/practice']")
    WebElement PracQues;
    @FindBy(xpath = "//a[@href='/question/1']")
    WebElement SrchArr;
    
    private static Logger logger = LogManager.getLogger(ArrayPage.class);
    public WebDriver driver;

    public void CkArrayGetSt() {
        ArrayStart.click();
        String ValArrayTitle = driver.getTitle();
        Assert.assertEquals(ValArrayTitle, "Array");
        logger.info("Successfully clicked the Array");
    }

    public void CkArrayPython() {
        ArrayPython.click();
        String ValArrayPyTitle = driver.getTitle();
        Assert.assertEquals(ValArrayPyTitle, "Arrays in Python");
        logger.info("successfully clicked Array in Python");
    }

    public void CkTryHere() {
        PyTryHere.click();
        String ValTryHere = driver.getTitle();
        Assert.assertEquals(ValTryHere, "Assessment");

    }

    public void CkPyRun() {
        String pythoncode = "print(\"Array in Python\")";
        Actions Run = new Actions(driver);
        Run.sendKeys(pythoncode);
        Run.perform();
        PyRun.click();
        Assert.assertEquals(RunResult.getText(), "Array in Python");
    }

    public void ClickArrayUsingList() throws InterruptedException {
        ArrayUsingList.click();
        String ValPythonRun = driver.getTitle();
        Assert.assertEquals(ValPythonRun.trim(), "Arrays Using List");
        logger.info("successfully clicked Arrays Using List");
        PyTryHere.click();
        String pythoncode = "print(\"Arrays Using List\")";
        Actions Run = new Actions(driver);
        Thread.sleep(1000);
        Run.sendKeys(pythoncode);
        Run.perform();
        PyRun.click();
        Assert.assertEquals(RunResult.getText(), "Arrays Using List");


    }

    public void BasicOperationList() throws InterruptedException {
        BasOperList.click();
        String ValPythonRun = driver.getTitle();
        Assert.assertEquals(ValPythonRun.trim(), "Basic Operations in Lists");
        logger.info("successfully Basic Operations in Lists");
        PyTryHere.click();
        String pythoncode = "print(\"Basic Operation List\")";
        Thread.sleep(3000);
        Actions Run = new Actions(driver);
        Run.sendKeys(pythoncode);
        Run.perform();
        PyRun.click();
        Assert.assertEquals(RunResult.getText(), "Basic Operation List");

    }

    public void ApplicationOfArray() throws InterruptedException {
        AppliOfArray.click();
        String ValPythonRun = driver.getTitle();
        Assert.assertEquals(ValPythonRun.trim(), "Applications of Array");
        logger.info("successfully clicked Applications Array");
        PyTryHere.click();
        Thread.sleep(2000);
        String pythoncode = "print(\"Applications of Array\")";
        Actions Run = new Actions(driver);
        Run.sendKeys(pythoncode);
        Run.perform();
        PyRun.click();
        Assert.assertEquals(RunResult.getText(), "Applications of Array");
    }

}

