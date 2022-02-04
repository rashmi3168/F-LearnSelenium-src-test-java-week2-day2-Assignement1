package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomEx1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//WebElement elementUsername = driver.findElement(By.id("username"));
		//elementUsername.sendKeys("DemoCSR");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement sourcedrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select emp = new Select(sourcedrop);
		emp.selectByVisibleText("Employee");
		
		WebElement industrydrop = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select finance = new Select(industrydrop);
		finance.selectByValue("IND_FINANCE");
		
		WebElement ownershipdrop = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select partnership = new Select(ownershipdrop);
		partnership.selectByIndex(2);
	}

}
