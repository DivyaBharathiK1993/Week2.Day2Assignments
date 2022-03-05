package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExAssignmentEditLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get ("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]")).click();
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]"));
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("divya");
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Edit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.xpath("//input[contains(@value,'Update')]")).click();
		driver.findElement(By.xpath("//span[contains(@id,'viewLead_companyName_sp')]")).isDisplayed();
		driver.close();
		
	}
}