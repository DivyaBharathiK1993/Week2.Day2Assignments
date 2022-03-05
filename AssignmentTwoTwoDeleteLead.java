package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwoTwoDeleteLead {

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

		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9615324789");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(5000);
        String lead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).getText();
        System.out.println(lead);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(lead);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
		  String recordmessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		  Thread.sleep(3000);
		  System.out.println(recordmessage);
		 
       driver.close();
	}
}