package addtocartdemo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		List<WebElement> items =driver.findElements(By.cssSelector("h4.product-name"));
		
		//String[] cartitem= {"Cucumber", "Tomato", "Carrot"};
	//List<String> litemlist = Arrays.asList(cartitem);
		List<String> litem=new ArrayList<>();
		litem.add("Cucumber");
		litem.add("Tomato");
		litem.add("Carrot");
		
		driver.manage().timeouts().implicitlyWait(5, null);
				
		
		for(int i=0; i<items.size(); i++)
		
		{
			
		String[] itemfullname= items.get(i).getText().split("-");
		String splitname = itemfullname[0].trim();
		
				
	//	String itemname = items.get(i).getText();
		
		
		int f=0;
		if(litem.contains(splitname))
		{
			f++;
			driver.findElements(By.xpath("//div[@class='product']//button")).get(i).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Cart']")));
			//System.out.println(litem.size());
			if(f==litem.size())
			{
				break;
			}
		}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("success");
		//driver.close();
	}
}