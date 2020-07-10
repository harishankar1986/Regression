package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Home extends WebLibrary{
	
	@FindBy(xpath = "//a[@href='/ORS_SIT/'][@class='nav-link']")
	public static WebElement link_Home;
	
	@FindBy(xpath = "//input[@id = 'searchRecord']")
	public static WebElement search_data;
	
	@FindBy(xpath = "//input[@id='searchRecord']/following-sibling::div")
	public static WebElement search_btn;
	
	@FindBy(xpath = "//a[@class='nav-link'][@href='/ORS_SIT/aboutUs']")
	public static WebElement link_AbtOrbit;
	
	@FindBy(xpath = "//a[text() = 'Products']")
	public static WebElement link_Prod;
	
	@FindBy(xpath = "//a[text()='COA']")
	public static WebElement link_COA;
	
	@FindBy(xpath = "//a[text()='Literatures']")
	public static WebElement link_Literatures;
	
	@FindBy(xpath = "//a[@class = 'nav-link']/following::li/a[text()='Contact Us']")
	public static WebElement link_Contact;
	
	
	@FindBy(xpath="//a[text()='Login']")
	public static WebElement link_Login;
	
	@FindBy(xpath="//a[text()='Register']")
	public static WebElement link_Register;
	
	//===========================================
	public static void homeVerifyPage() {
		boolean bStatus;
		
		bStatus = clickElement(link_Home);
		Reporter.log(bStatus, "Home link is clicked", "Home link is not clicked");
		
		bStatus = setEditValue(search_data, "124755-24-21");
		Reporter.log(bStatus, "Search data is entered", "Search data is not entered");
		
		bStatus = clickElement(search_btn);
		Reporter.log(bStatus, "Search button is clicked", "Search button is not entered");
		
		wait(5);
		
		backward();
		Reporter.log(bStatus, "Returned to home page", "Not returned to home page");
		
		bStatus = clickElement(link_AbtOrbit);
		Reporter.log(bStatus, "About Orbit link is clicked", "About Orbit link is not clicked");
		
		wait(5);
		
		backward();
		Reporter.log(bStatus, "Returned to orbitSciencepage", "Not returned to orbitSciencepage");
		
		bStatus = clickElement(link_Prod);
		Reporter.log(bStatus, "Products link is clicked", "Products link is not clicked");
		
		wait(5);
		
		backward();
		Reporter.log(bStatus, "Returned to home page", "Not returned to home page");
		
		bStatus = clickElement(link_COA);
		Reporter.log(bStatus, "COA link is clicked", "COA link is not clicked");
		
		wait(5);
		
		backward();
		Reporter.log(bStatus, "Returned to home page", "Not returned to home page");
		
		bStatus = clickElement(link_Literatures);
		Reporter.log(bStatus, "Literatures link is clicked", "Literatures link is not clicked");
		
		wait(5);
		
		backward();
		Reporter.log(bStatus, "Returned to home page", "Not returned to home page");
		
		bStatus = clickElement(link_Contact);
		Reporter.log(bStatus, "Contact Us link is clicked", "Contact Us link is not clicked");
		
		wait(5);
		
		backward();
		Reporter.log(bStatus, "Returned to home page", "Not returned to home page");
		
	}
	
	
	//===========================================
	public static void navLoginpage() {		
		boolean bStatus = clickElement(link_Login);
		Reporter.log(bStatus, "Login link clicked", "Login link not clicked");
	}	

}