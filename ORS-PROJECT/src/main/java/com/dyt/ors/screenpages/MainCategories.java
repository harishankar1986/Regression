package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class MainCategories extends WebLibrary {
	@FindBy (xpath = "//a[text()=' Add Main Categories']")
	public static WebElement link_AddMainCategories;
	
	@FindBy (xpath = "//input[@id='ors_mc_category_name']")
	public static WebElement txt_CategoryName;
	
	@FindBy (xpath = "//select[@id='ors_order']")
	public static WebElement selt_order;
	
	@FindBy (xpath = "//input[@id='catgImage']")
	public static WebElement link_image;
	
	@FindBy (xpath = "//input[@class='btn btn-success']")
	public static WebElement clk_submit;
	
	@FindBy (xpath = "//tr[@class = 'text-center']")
	public static WebElement dis_header;
	
	//=========Methods==========================
	public static void MainCategory() {
		boolean bStatus;
		
	bStatus = isElementDisplayed(dis_header);
	Reporter.log(bStatus, "Header is displayed", "Header is not displayed");
	
	bStatus = clickElement(link_AddMainCategories);
	Reporter.log(bStatus, "Add Main category clicked", "Add Main category not clicked");
	
	bStatus = setEditValue(txt_CategoryName, "glen");
	Reporter.log(bStatus, "Category name Entered", "Category name not Entered");
	
	bStatus = selectListItemByValue(selt_order, "C");
	Reporter.log(bStatus, "Order selected", "Order not selected");
	
	bStatus = fileUpload(link_image, "C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
	Reporter.log(bStatus, "Image uploaded", "Image upload failed");
		
	bStatus = clickElement(clk_submit);
	Reporter.log(bStatus, "Submit button clicked", "Submit not clicked");
	
	}
}


