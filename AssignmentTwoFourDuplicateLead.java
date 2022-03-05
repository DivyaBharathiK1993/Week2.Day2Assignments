package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwoFourDuplicateLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("divya@abc.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String leadOne = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
        System.out.println(leadOne);
        String leadExpected = "Duplicate Lead | opentaps CRM";
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[(text()='Duplicate Lead')]")).click();
        Thread.sleep(3000);
        String leadDisplayed = driver.getTitle();
        System.out.println(leadDisplayed);
        
if(leadExpected.equals(leadDisplayed)) {
        	
        	System.out.println("Title as Expected");
}
        driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
        Thread.sleep(3000);
       String newLeadfname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
       
       String newLeadlname = driver.findElement(By.id("viewLead_lastName_sp")).getText();
       Thread.sleep(3000);
        if(newLeadfname.equals("Divya Bharathi") && newLeadlname.equals("Krishna Murthi")){
        	System.out.println("Name Matched, End of the Program");
        	
        }
        
        driver.close();
		}
}