package ActionsDemo;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.amazon.in");
			//Actions action = new Actions(driver);
			//action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
			
			driver.get("https://www.winndixie.com/");
			//driver.findElement(By.cssSelector("ul[class='quick-bar__link'] a[target='_blank']")).click();
			driver.getPageSource();
			
			/*
			Set<String> windows = driver.getWindowHandles();
			System.out.println(windows);
			Iterator<String> it = windows.iterator();
			String parentid = it.next();
			String childid = it.next();
			driver.switchTo().window(childid);
			
			*/
			
			
			
	}

}
