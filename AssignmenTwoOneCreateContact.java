package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmenTwoOneCreateContact {

	public static void main(String[] args) {
		
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
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Create Contact')]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Divya");
		driver.findElement(By.id("lastNameField")).sendKeys("Bharathi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Divvi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Darling");
		driver.findElement(By.name("departmentName")).sendKeys("Testing Department");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Description for Testing Purpose");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("divya@bharathi.com");
		WebElement stateProvince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(stateProvince);
		state.selectByValue("NY");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Important Note Testing Department");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
		
	}
}