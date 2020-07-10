package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Dashboard extends WebLibrary{
	
	//Elements
	@FindBy(xpath="//span[text()='Dashboard']")
	public static WebElement navlink_Dashboard;
	
	@FindBy(xpath="//span[text()='Products']")
	public static WebElement navlink_Products;	
	
	@FindBy(xpath="//a[text()='Main Categories']")
	public static WebElement link_MainCategories;
	
/*	@FindBy (xpath = "//a[text()=' Add Main Categories']")
	public static WebElement link_AddMainCategories;
	
	@FindBy (xpath = "//input[@id='ors_mc_category_name']")
	public static WebElement txt_CategoryName;
	
	@FindBy (xpath = "//select[@id='ors_order']")
	public static WebElement selt_order;
	
	@FindBy (xpath = "//input[@id='catgImage']")
	public static WebElement link_image;
	
	@FindBy (xpath = "//input[@class='btn btn-success']")
	public static WebElement clk_submit;
	 */
	//=======================Sub Category====================
	
	@FindBy(xpath="//a[text()='Sub Categories']")
	public static WebElement link_SubCategories;
	
	@FindBy (xpath = "//div[@class='container-fluid']/div/a")
	public static WebElement link_AddSubCategories;
	
/*	@FindBy (xpath = "//select[@id='mainCatgDropdown']")
	public static WebElement txt_SelectMainCategory;
	
	@FindBy (xpath = "//input[@id='subCatgName']")
	public static WebElement txt_SubCategory;
	
	@FindBy (xpath = "//select[@id='ors_sub_order']")
	public static WebElement txt_suborder;
	
	@FindBy (xpath = "//input[@id='LitImage']")
	public static WebElement link_Image;
	
	@FindBy (xpath = "//input[@id='LitPDF']")
	public static WebElement link_Document;
	
	@FindBy (xpath = "//input[@class='btn btn-success']")
	public static WebElement clk_subcatSubmit;
	 */
	//===============Products=====================
	
	@FindBy(xpath="//a[text()='Products']")
	public static WebElement link_Products;
	
	@FindBy (xpath = "//div[@class='container-fluid']/div/a")
	public static WebElement link_AddProducts;
	
	
	
	//===============Service================================
	
	/*@FindBy (xpath ="//span[text()='Service']")
	public static WebElement navlink_Service;
	
	@FindBy (xpath = "//a[text()='Service Header']")
	public static WebElement link_ServiceHeader;
	*/
			
	//================ Methods ====================
	public static void navMainCategories() {
		boolean bStatus;
		
		bStatus = clickElement(navlink_Products);
		Reporter.log(bStatus, "Products nav link clicked", "Products nav link not clicked");
		
		bStatus = clickElement(link_MainCategories);
		Reporter.log(bStatus, "Main Categories link clicked", "Main Categories link not clicked");	
	}
		
	//=======================================
	public static void navSubCategories() {
		boolean bStatus;
		
		bStatus = clickElement(navlink_Products);
		Reporter.log(bStatus, "Products nav link clicked", "Products nav link not clicked");
		
	//	bStatus = clickElement(link_SubCategories);
	//	Reporter.log(bStatus, "Sub Categories link clicked", "Sub Categories link not clicked");	
		
	}
	//=======================================
	public static void navProducts() {
		boolean bStatus;
		
		bStatus = clickElement(navlink_Products);
		Reporter.log(bStatus, "Products nav link clicked", "Products nav link not clicked");
		
		bStatus = clickElement(link_Products);
		Reporter.log(bStatus, "Product link clicked", "Products link not clicked");		
	}
	//=======================================
	/*public static void navService() {
		boolean bStatus;
		
		bStatus = clickElement(navlink_Service);
		Reporter.log(bStatus, "Service nav is clicked", "Service nav not clicked");
	}*/

}
