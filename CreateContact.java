package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("MALAR");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("B");
		driver.findElement(By.linkText("Contacts"));
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("ECE");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("LEARNING");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("malar@gmail.com");
		//driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId'])"));
		driver.findElement(By.xpath("//textarea[@id='createContactForm_importantNote']")).sendKeys("notes");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		

	}

}
