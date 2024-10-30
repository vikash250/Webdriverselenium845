package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableTest {
	WebDriver driver;
  @Test
  public void verifyBookDetails() {
	  
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  //List<WebElement> items =driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td"));
	  List<WebElement> items =driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//preceding-sibling::td[3]"));
	  System.out.println("Number of items...."+ items.size());
	  for(WebElement item :items) {
		System.out.println("Item Value :.."+ item.getText());
	  }
	  
  }
}
