package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClassAssignment2 {

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
		
		WebElement openLinkCRM = driver.findElement(By.linkText("CRM/SFA"));
		openLinkCRM.click();
		WebElement openLeadsTab = driver.findElement(By.linkText("Leads"));
		openLeadsTab.click();
		WebElement createLeadbutton = driver.findElement(By.linkText("Create Lead"));
		createLeadbutton.click();
		WebElement enterCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		enterCompanyName.sendKeys("Wipro Limited");
		WebElement enterFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		enterFirstName.sendKeys("Divya Bharathi");
		
		WebElement enterLastName = driver.findElement(By.id("createLeadForm_lastName"));
		enterLastName.sendKeys("Krishna Murthi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Divvi");;
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing Department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating Lead for Selenium basic code");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divya@abc.com");
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateProvince);
		state.selectByVisibleText("California");
		driver.findElement(By.className("smallSubmit")).click();

		WebElement editButton = driver.findElement(By.linkText("Edit"));
		editButton.click();
	
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Updating the Important Note section for testing");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		}

}


/*
 * WebElement leadCreationSubmit =
 * driver.findElement(By.className("smallSubmit")); leadCreationSubmit.click();
 */


/*
 * WebElement FnameLocal =
 * driver.findElement(By.id("createLeadForm_firstNameLocal"));
 * FnameLocal.sendKeys("Divvi");
 */