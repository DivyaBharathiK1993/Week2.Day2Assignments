package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOneFacebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get ("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@data-testid, 'open-registration-form-button')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sample");
		driver.findElement(By.name("lastname")).sendKeys("Sample");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@abcd.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@abcd.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abcdef");
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		Select bday = new Select(day);
		bday.selectByValue("27");
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select bmonth = new Select(month);
		bmonth.selectByValue("5");
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		Select byear = new Select(year);
		byear.selectByValue("1993");
		
		driver.findElement(By.xpath("(//input[@name='sex']/preceding-sibling::label)[1]")).click();
	System.out.println("Click on Sign Up Next...");
	}
}
