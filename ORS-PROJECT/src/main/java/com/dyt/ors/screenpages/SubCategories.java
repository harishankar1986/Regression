package com.dyt.ors.screenpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class SubCategories  extends WebLibrary{
	
	@FindBy (xpath = "//a[text()='Sub Categories']")
	public static WebElement link_SubCategories;
	
	@FindBy (xpath = "//div[@class='container-fluid']/div/a")
	public static WebElement link_AddSubCategories;
	
	@FindBy (xpath = "//select[@id='mainCatgDropdown']")
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
	
	
	//==================Add SubCategory=======================
	public static void Subcategory() {
		boolean bStatus;
	bStatus = clickElement(link_AddSubCategories);
	Reporter.log(bStatus, "Add Sub category clicked", "Add Sub category not clicked");
	
	bStatus = selectListItem(txt_SelectMainCategory, "GLENMAARK");
	Reporter.log(bStatus, "Main category selected", "Main category not selected");
	
	bStatus = setEditValue(txt_SubCategory, "FAAVIPIRAVIRES");
	Reporter.log(bStatus, "Sub Category entered", "Sub category not entered");
	
	bStatus = selectListItemByValue(txt_suborder, "C");
	Reporter.log(bStatus, "Suborder entered", "suborder not entered");
	
	bStatus = fileUpload(link_Image,"D:\\images\\glenmark.jpg");
	Reporter.log(bStatus, "image uploaded", "image upload failed");
	
	bStatus = uploadFile(link_Document,"D:\\images\\glenmark.jpg");
	Reporter.log(bStatus, "File uploaded", "Fileupload failed");
	
	bStatus = clickElement(clk_subcatSubmit);
	Reporter.log(bStatus, "Submit button clicked", "unable to submit");
}
	//==========================Edit SubCatagory ===========================

	
	
	
	
	
	
	public static void addsubtable() {
		int rowcount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr")).size();
		 System.out.println("size" + rowcount );
		int colcount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr/td")).size();
		System.out.println("size" + colcount);
		 
		  boolean bStatus= false;
		  
		  for(int i= 1;i<rowcount;i++) {
			  for(int j = 1; j < colcount; j++) {
			  String subcategorytext = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[" +i+ "]/td[" + j + "]")).getText();
			  
			  if(subcategorytext.trim().equalsIgnoreCase("Sample")) {
				  System.out.println("subcategory added is " + subcategorytext);
				   bStatus= true;
				  break;
				  
			  }
			  
			  }
		  }
			  
		  }
}
