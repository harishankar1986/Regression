package Exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ORS {
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Testing master\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://13.233.50.231:8080/ORS_SIT/");
		/*
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='loginId']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='loginPwd']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		 */
		driver.findElement(By.xpath("//input[@id='searchRecord']")).sendKeys("acetaminophen");
		driver.findElement(By.xpath("//input[@id='searchRecord']/following-sibling::div")).click();
		
		String a = driver.findElement(By.xpath("//div[@class='col-md-9']/table/tbody")).getText();
		System.out.println(a);
		
		System.out.println("-----------------------------");

		driver.findElement(By.xpath("//a[text()='acetaminophen']")).click();
		String i = driver.findElement(By.xpath("//table[@class='table table-hover']/thead")).getText();
		System.out.println(i);

		String s = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr[@class='text-center']")).getText();
		System.out.println(s);
	
		
				
}
}
