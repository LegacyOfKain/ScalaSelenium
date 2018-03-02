import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.support.ui.Select
 

object AutomateChrome
{
    def main(args: Array[String]) 
	{
		//Download the chromedriver.exe file from the link https://chromedriver.storage.googleapis.com/2.35/chromedriver_win32.zip and put it under c:\temp
		System.setProperty("webdriver.chrome.driver","C:\\temp\\chromedriver.exe");
        
		val options = new ChromeOptions
		//options.addArguments("--headless")
		
		// Required to ignore the Policy restriction in Chrome
        options.setExperimentalOption("useAutomationExtension", false)
	
		val chrome = new ChromeDriver(options)

		//chrome.get("http://www.nytimes.com")
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		
		chrome.get("https://www.facebook.com/");
		
		
		//chrome.findElementById("email").sendKeys("abc@gmail.com");

		Thread.sleep(5000)
		println("Wait 5 seconds");
		//chrome.findElementById("email").sendKeys("abc@gmail.com");
		 
		chrome.findElementByXPath(".//*[@id='u_0_e']").sendKeys("Automation")
		chrome.findElementByXPath(".//*[@id='u_0_g']").sendKeys("Testing")
		chrome.findElementByXPath(".//*[@id='u_0_j']").sendKeys("abc@gmail.com")
		chrome.findElementByXPath(".//*[@id='u_0_q']").sendKeys("Selenium")
		chrome.findElementByXPath(".//*[@id='u_0_m']").sendKeys("abc@gmail.com")
		
		val Days = new Select(chrome.findElementById("day")) 
		Days.selectByValue("15") 
		Thread.sleep(1000) 
		val Month =new Select(chrome.findElementById("month")) 
		Month.selectByValue("1") 
		Thread.sleep(1000) 
		val Year =new Select(chrome.findElementById("year")) 
		Year.selectByValue("1990") 
		Thread.sleep(1000) 
		chrome.findElementByXPath(".//*[@id='u_0_c']").click()
		Thread.sleep(1000) 
		
		chrome.findElementByXPath(".//*[@id='u_0_w']").click()
		
		Thread.sleep(5000)
		println("Wait again 5 seconds");
		chrome.quit  
 
    }
  }

