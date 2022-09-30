package ds.algo.listeners;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.util.Arrays;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import utility.TestBase;

import org.testng.ITestContext ;				


public class TestListener extends TestBase implements ITestListener{
	
	public String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
		
	}
	
  
	@Attachment(value="{0}", type = "text/plain")
	public String saveTextLog (String message) {
		return message;
	}
	
	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshot(byte[] screenShot) {
	    return screenShot;
	}
	
//	@Attachment(value="Screenshot", type="image/png")
//	public byte[] onTestFailure(ITestResult testResult,WebDriver driver) { 
//			System.out.println(driver.getCurrentUrl());
//			String FileName = "data\\screenshots\\" + testResult.getName() + "-" 
//					+ Arrays.toString(testResult.getParameters()) +  ".png";
//			Screenshot scr = new Screenshot();
//			try {
//				scr.CaptureScreenShot(driver, FileName);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			Object testClass = testResult.getInstance();
//			System.out.println("Screenshot captured for test case: " + getTestMethodName(testResult));
//			System.out.println("executed till here");
//			System.out.println(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
//			return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//	}

}
