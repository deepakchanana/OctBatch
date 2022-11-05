package pkg1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Browser
{
public void browserlaunch() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","../TestingProject/chromedriver.exe");	
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.youtube.com");
	  Options op=driver.manage();
	  Window w=op.window();
	  w.maximize();
	  WebElement video=driver.findElement(By.id("video-title"));
	 
	  System.out.println(video.getText());
	  System.out.println(video.getAttribute(arg0));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  Actions ac=new Actions(driver);
	  ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
	  
	  String currentTab_firsttab=driver.getWindowHandle();
	  Set<String> allwindows=driver.getWindowHandles();
	  System.out.println("before switching url is "+driver.getCurrentUrl());
	  System.out.println("total tabs--------"+allwindows.size());
	  int deepak=0;
	  for(String s: allwindows)
	  {
		  deepak=deepak+1; // deepak---2
		  if(deepak==3)  // 3==3
		  {
		  driver.switchTo().window(s);
		  break;
		  }
	  }
	  System.out.println("after switching url is "+driver.getCurrentUrl());
}
public static void main(String[] args) throws InterruptedException {
	Browser b=new Browser();
	b.browserlaunch();
}
}
