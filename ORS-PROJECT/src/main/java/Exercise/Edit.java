package Exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Testing master\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://13.233.50.231:8080/ORS_SIT/");
		//============================================================
		
		
		//======================Login==================================
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='loginId']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='loginPwd']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//==============================================================
		
		//===============Navigate to sub category=======================
		driver.findElement(By.xpath("//span[text()='Products']")).click();
		driver.findElement(By.xpath("//a[text()='Sub Categories']")).click();
		driver.findElement(By.xpath("//a[@href='addSubCategories']")).click();
		//==============================================================
		
		//==================Sub Category Page===========================
		driver.findElement(By.xpath("//select[@id='mainCatgDropdown']/option[dimethy]")).click();
		driver.findElement(By.xpath("//input[@id='subCatgName']")).sendKeys();
		driver.findElement(By.xpath("//select[@id='ors_sub_order']/option[3]")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();

	}
}
