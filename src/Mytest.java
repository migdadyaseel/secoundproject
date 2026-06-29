import java.util.List;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytest {
	
	String mywebsite="https://www.saucedemo.com/";
	
	WebDriver driver=new EdgeDriver();
	
	
	@BeforeTest
	
	public void  mybeforetest() {
	
	driver.get(mywebsite);
	driver.manage().window().maximize();
	}
	
	@Test (priority=0)
	
	public void  testlogin() {
		
		//String id;
		WebElement theloginname =driver.findElement(By.id("user-name"))		;////user name 
		theloginname.sendKeys("standard_user");	
		
		
		WebElement theloginpass= driver.findElement(By.id("password")); ////password
		theloginpass.sendKeys("secret_sauce");
		
		WebElement click=driver.findElement(By.id("login-button"));
		click.click();
		
			

	}
	
	

	
	
	
	@Test(priority = 1)
	public  void AddToCart() throws InterruptedException {
		
		
		
	WebElement AddFirstItem=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
//	System.out.println(AddFirstItem.isDisplayed());
//	
//	System.out.println(AddFirstItem.isEnabled());
//	
	
	Thread.sleep(1000);
	AddFirstItem.click();
		
		
		
	}
	
	
	
	@Test(priority=2)
	
	public void RemoveFirstItem() throws InterruptedException {
		
		Thread.sleep(1000);

		
	WebElement removefirstitem=driver.findElement(By.id("remove-sauce-labs-backpack"))	;
	
	removefirstitem.click();
	
		
	}
	
	
	@Test(priority = 3)
	public void addallitem() throws InterruptedException {
		
		
		List<WebElement> Alladdtocart  =driver.findElements(By.className("btn_primary"));
		 
	    int size = Alladdtocart.size();
		
		Thread.sleep(3000);
//		Alladdtocart.get(1).click();
//		Alladdtocart.get(2).click();
//		Alladdtocart.get(3).click();
//		Alladdtocart.get(4).click();
//		Alladdtocart.get(5).click();
		
		
		for (  int i=0;i<size;i++) {
			
			
			
			Alladdtocart.get(i).click();
			Thread.sleep(1000);

			
			
		}


		
		
		
		
	}
	
	
	
	@Test(priority=4)
	public void removeall() throws InterruptedException {
		
		List<WebElement> removeall=driver.findElements(By.className("btn_secondary"));

		
		
	    int size =removeall.size();

		
		for (  int i=0;i<size;i++) {
			
			
			
			removeall.get(i).click();
			Thread.sleep(1000);

			
			
		}
		
		
		
		
	}
	
	
	
	
	
	

	
	

	@AfterTest
	
	
	public void  aftertest() {}

	

}
