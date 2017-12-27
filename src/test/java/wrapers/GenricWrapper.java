package wrapers;

import java.io.File;
import java.io.IOException;
import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
public class GenricWrapper implements Wrappers {
	public RemoteWebDriver driver;
	int i=1;


	public void invokeApp(String browser, String url) {
		try {
			// TODO Auto-generated method stub
			if(browser.equalsIgnoreCase("chrome")){

				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if((browser.equalsIgnoreCase("firefox"))){
				System.setProperty("webdriver.geco.driver","./drivers/chromedriver.exe");
				driver = new FirefoxDriver();
			}
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser" +browser+ "Lanched Sucessfullu");
		} catch (WebDriverException e) {
			System.out.println("the browser "+browser+"could not be launched");
		}
		finally{
			takeSnap();  
		}

	}



	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The data "+data+"enterd sucessfully in the feild"+idValue );

		} catch (NoSuchElementException e) {
			System.out.println("The data"+data+"could not be enterd in the feild "+idValue );
		}catch(WebDriverException e){
			System.out.println("unexcepted error occured");
		}finally{
			takeSnap();


		}
	}


	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The data "+data+"enterd sucessfully in the feild"+nameValue );

		} catch (NoSuchElementException e) {
			System.out.println("The data"+data+"could not be enterd in the feild "+nameValue );
		}catch(WebDriverException e){
			System.out.println("unexcepted error occured");
		}finally{
			takeSnap();

			// TODO Auto-generated method stub

		}
	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).clear();
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The data "+data+"enterd sucessfully in the feild"+xpathValue );

		} catch (NoSuchElementException e) {
			System.out.println("The data"+data+"could not be enterd in the feild "+xpathValue );
		}catch(WebDriverException e){
			System.out.println("unexcepted error occured");
		}finally{
			takeSnap();

			// TODO Auto-generated method stub

		}
	}

	public boolean verifyTitle(String title) {
		boolean bReturn = false;
		try {
			if(driver.getTitle().equals(title)){
				System.out.println("Title matched with"+title);
			}else{
				System.out.println("Title  is not matched with the excepected"+title);

			}
			bReturn =true;

						
		} catch (WebDriverException e) {
			System.out.println("unexcepted error occured");
			// TODO Auto-generated catch block

		}finally{
			takeSnap();
		}
		return bReturn;
	}

	public void verifyTextById(String id, String text) {
		String txt =driver.findElementById(id).getText();
		try {
			if(txt.equals(text)){
				System.out.println("The text is recived"+text);
			}else{
				System.out.println("The text is not recived"+text);
			}

		}catch(NoSuchElementException e){
			System.out.println("unexcepted error occured");

		}finally{
			takeSnap();

			// TODO Auto-generated method stub


		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		String txt =driver.findElementById(xpath).getText();
		try {
			if(txt.equals(text)){
				System.out.println("The text is recived"+text);
			}else{
				System.out.println("The text is not matched"+text);
			}

		}catch(NoSuchElementException e){
			System.out.println("unexcepted error occured");

		}finally{
			takeSnap();
		}


	}


	public void verifyTextContainsByXpath(String xpath, String text) {
		String txt =driver.findElementByXPath(xpath).getText();
		try {
			if(txt.contains(text)){
				System.out.println("The text is recived"+text);
			}else{
				System.out.println("The text is not recived"+text);
			}

		}catch(NoSuchElementException e){
			System.out.println("unexcepted error occured");

		}finally{
			takeSnap();

			// TODO Auto-generated method stub

		}
	}

	public void verifyTextContainsById(String id, String text) {
		String txt =driver.findElementById(id).getText();
		try {
			if(txt.contains(text)){
				System.out.println("The text is recived"+text);
			}else{
				System.out.println("The text is not recived"+text);
			}

		}catch(NoSuchElementException e){
			System.out.println("unexcepted error occured");

		}finally{
			takeSnap();





		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			System.out.println("the element "+id+"click sucsessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The element "+id+" could not clickble ");


		}finally{
			takeSnap();

		}
	}



	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("the element "+classVal+"click sucsessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The element "+classVal+" could not clickble ");


		}finally{
			takeSnap();



		}
	}


	public void clickByName(String name) {
		try {
			driver.findElementByClassName(name).click();
			System.out.println("the element "+name+"click sucsessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The element "+name+" could not clickble ");


		}finally{
			takeSnap();




		}	
	}
	public void clickByLinkWithNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("the element "+name+"click sucsessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The element "+name+" could not clickble ");
		}
	}




	public void clickByXpath(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("the element "+xpathVal+"click sucsessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The element "+xpathVal+" could not clickble ");


		}finally{
			takeSnap();




		}	
	}

	public String getTextById(String idVal) {

		String text=null;
		try {
			text = driver.findElementById(idVal).getText();
			System.out.println("The text "+idVal+"is recived sucessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The text "+idVal+"is not recived sucessfully");
			// TODO Auto-generated catch block

		}finally{
			takeSnap();
		}




		return text;
	}

	public String getTextByXpath(String xpathVal) {
		String text=null;
		try {
			text = driver.findElementByXPath(xpathVal).getText();
			System.out.println("The text "+xpathVal+"is recived sucessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The text "+xpathVal+"is not recived sucessfully");


		}finally{
			takeSnap();

		}
		return text;
	}

	public void selectVisibileTextById(String id, String value) {


		try {
			WebElement dd = driver.findElementById(id);
			Select dropDown = new Select(dd);
			dropDown.selectByVisibleText(value);
			System.out.println("The text "+id+"is sucessfully selected");
		} catch (NoSuchElementException e) {

			System.out.println("The text "+id+"is  not sucessfully selected");

		}finally{
			takeSnap();
		}
	}

	public void selectIndexById(String id, int value) {
		try {
			WebElement dd = driver.findElementById(id);
			Select dropDown = new Select(dd);
			dropDown.selectByIndex(value);
			System.out.println("The text "+id+"is sucessfully selected");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("The text "+id+"is  not sucessfully selected");

		}finally{
			takeSnap();
		}


	}

	public void switchToWindowUsingIndex(int index) {
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			System.out.println("number of windows "+allWindowHandles.size());
			List<String> allHandles = new ArrayList<String>();
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
		} catch (NoSuchWindowException e) {
			System.out.println("The driver could not move to the given window by index "+index);
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());

		}finally{
			takeSnap();
		}


	}

	public void acceptAlert() {
		

		driver.switchTo().alert().accept();


	}

	public void quitBrowser() {
		try {
			driver.quit();
			System.out.println("The opened browsers are closed");
		} catch (WebDriverException e) {
			System.out.println("The browsers could not be closed");
		}



	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File target = new  File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
		// TODO Auto-generated method stub

	}
	public void switchToFrameUsingString(String idOrName ){
		try {

			driver.switchTo().frame(idOrName);
			System.out.println("switch In to the Frame ");
		} catch (NoSuchFrameException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());	



		}finally{
			takeSnap();
		}
	}
	public void switchToFrameUsingWebElement(String idOrName ){
		try {

			driver.switchTo().frame(idOrName);
			System.out.println("switch In to the Frame ");
		} catch (NoSuchFrameException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());	



		}finally{
			takeSnap();
		}
	}
	public void switchToFrameUsingId(String idOrName ){
		try {

			driver.switchTo().frame(idOrName);
			System.out.println("switch In to the Frame ");
		} catch (NoSuchFrameException e) {
			System.out.println("WebDriverException : "+e.getMessage());
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : "+e.getMessage());	



		}finally{
			takeSnap();
		}
	}





	public void clickByLink(String name) {

		try {
			driver.findElementByLinkText(name).click();
			System.out.println("the element "+name+"click sucsessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The element "+name+" could not clickble ");


		}finally{
			takeSnap();
		}
	}	
	
	public void clickByLinkWithOutSnot(String name) {

		try {
			driver.findElementByLinkText(name).click();
			System.out.println("the element "+name+"click sucsessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The element "+name+" could not clickble ");


		}
	}	
}












