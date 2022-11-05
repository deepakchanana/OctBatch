package pkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauch
{
	ChromeDriver driver;  
	@Before
	public void m1()
	{
		driver=new ChromeDriver(); 
	}
	
	@After
	public void m2()
	{
		
	}
	
	@Test
	public void abc()
	{
		driver.findElement(by)
	}
	
	
	
}
