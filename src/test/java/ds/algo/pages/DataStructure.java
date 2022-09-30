package ds.algo.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import ds.algo.testcases.TestRegister;

public class DataStructure {
	
	 @FindBy(xpath = "//a[@href='data-structures-introduction' and contains(text(),'Get Started')]")
	    WebElement btnDataStructGetStarted;

	    @FindBy(xpath = "//a[@href='time-complexity' and contains(text(),'Time Complexity')]")
	    WebElement lnkTimecomplexity;

	    @FindBy(xpath = "//a[@href='/data-structures-introduction/practice' and contains(text(),'Practice Questions')]")
	    WebElement lnkPracticeQuestion;

	    @FindBy(xpath = "//a[@href='/tryEditor' and contains(text(),'Try here')]")
	    WebElement btnTryHere;

	    @FindBy(xpath = "//span[@role='presentation']")
	    WebElement boxentercodehere;

	    @FindBy(xpath = "//button[@type='button' and contains(text(),'Run')]")
	    WebElement btnRun;

	    @FindBy(xpath = "//pre[@id='output']")
	    WebElement valoutputmsg;
	    
	    public WebDriver driver;
	    
	    private static Logger logger = LogManager.getLogger(DataStructure.class);

	    public void clkDataStructGetStd() {
	        btnDataStructGetStarted.click();
	        String valDataStructtitlepage = driver.getTitle();
	        Assert.assertEquals(valDataStructtitlepage, "Data Structures-Introduction");
	        logger.info("Get started button click successfull");
	    }

	    public void lnkTimeComplexity() {
	        lnkTimecomplexity.click();
	        String valTimecomplexpage = driver.getTitle();
	        Assert.assertEquals(valTimecomplexpage, "Time Complexity");
	        logger.info("Time Complexity link clicked successfull");
	    }

	    public void lnkPracticeQuestion() {
	        lnkPracticeQuestion.click();
	        String valpracquestionpage = driver.getTitle();
	        Assert.assertEquals(valpracquestionpage.trim(), "Practice Questions");
	        logger.info("Practice Questions link clicked successfull");
	    }

	    public void lnkTryHere() throws InterruptedException {
	            btnTryHere.click();
	            String pythoncode = "print(\"Hello World\")";
	            String valTryHerePage = driver.getTitle();
	            Assert.assertEquals(valTryHerePage.trim(), "Assessment");
	       //Pass Python code
	        Actions a = new Actions(driver);
	        a.sendKeys(pythoncode);
	        a.perform();
	            btnRun.click();
	            Assert.assertEquals(valoutputmsg.getText(),"Hello World");
	            logger.info("Data Structure code validation completed successfull");
	    }
	}

