package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		
		/**WebElement findElement = driver.findElement(By.name("firstname"));
		findElement.sendKeys("Rashmi");
		String attribute = findElement.getAttribute("value");
		System.out.println(attribute);**/
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rashmi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bhatt");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9007721864");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("rashmi@123");
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dd=new Select(day);
		dd.selectByVisibleText("6");
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dd1=new Select(month);
		dd1.selectByValue("10");
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dd2=new Select(year);
		dd2.selectByValue("1987");
		
		driver.findElement(By.xpath("//input[@name='sex']/..")).click();
		
	}

}
