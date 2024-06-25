package AutoSuggestDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> lst = driver.findElements(By.xpath("//li[@data-attrid='AutocompletePrediction']//div[1]//span"));

		for (WebElement list: lst)
		{
			System.out.println("TEST" + list);
			if(list.getText().contains("webdriver"))
			{
				list.click();
				
				break;
			}
		}

		System.out.println("Success");		
	}

   

	}

