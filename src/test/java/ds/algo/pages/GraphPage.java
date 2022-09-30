package ds.algo.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GraphPage {
    
    @FindBy(xpath="//a[@href='graph' and contains (text(), 'Get Started')]")
    WebElement GetStarted;
    @FindBy(xpath="//a[@href='graph']")
    WebElement InnerGraph;
    @FindBy(xpath = "//a[@href='/tryEditor']")
    WebElement GraphTryHere;
    @FindBy(xpath = "//button[@type='button']")
    WebElement GraphRunButt;
    @FindBy(id = "output")
    WebElement GraRunResult;
    @FindBy(xpath = "//a[@href='/graph/graph-representations/']")
    WebElement GragrpResp;
    private static Logger logger = LogManager.getLogger(GraphPage.class);
    public WebDriver driver;
    
    
    public void GrGetStarted(){
        GetStarted.click();
        String ValGraphTitle = driver.getTitle();
        Assert.assertEquals(ValGraphTitle,"Graph");
        logger.info("successfully clicked Graph");
    }

    public void InGraphClick() throws InterruptedException {
       InnerGraph.click();
        Thread.sleep(1000);
        GraphTryHere.click();
    }
    
    public void clickInnerGraph() throws InterruptedException {
        InnerGraph.click();
        Thread.sleep(1000);
    }
    
    public void ClickRunGraph(){
        String pythoncode = "print(\"it's Graph\")";
        Actions Run = new Actions(driver);
        Run.sendKeys(pythoncode);
        Run.perform();
        GraphRunButt.click();
        Assert.assertEquals(GraRunResult.getText(), "it's Graph");
    }
    public void GrapPres() throws InterruptedException {
        GragrpResp.click();
        String ValGrapRep = driver.getTitle();
        Assert.assertEquals(ValGrapRep,"Graph Representations");
        logger.info("successfully clicked Graph Representations");
        GraphTryHere.click();
        Thread.sleep(2000);
        String pythoncode = "print(\"Graph Representations\")";
        Actions Run = new Actions(driver);
        Run.sendKeys(pythoncode);
        Run.perform();
        GraphRunButt.click();
        Assert.assertEquals(GraRunResult.getText(),"Graph Representations");
    }
}

