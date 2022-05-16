package AmazonProduct;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class iPhone12 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("https://www.amazon.in/");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			  WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
			  search.sendKeys("iPhone12");
			   WebElement searchclick=driver.findElement(By.id("nav-search-submit-button"));
			  searchclick.click();
			 List<WebElement> iPhonename=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			 List<WebElement> iPhoneprice=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			 System.out.println("Result "+iPhonename.size());
			 for(int count=0; count<iPhonename.size(); count++)
			 {
				 if(iPhonename.get(count).getText().toLowerCase().contains("iPhone12"))
				
				 {
					 System.out.println("iPhone Name :" +iPhonename.get(count).getText() + "iPhone Price:"+iPhoneprice.get(count).getText() );
				}
				 else
				 {
				 System.out.println("iPhone Name :"+iPhonename.get(count).getText() + "iPhone Price:"+iPhoneprice.get(count).getText() );
				 }
				 
				 }
	
			 driver.close();
		}
	}


