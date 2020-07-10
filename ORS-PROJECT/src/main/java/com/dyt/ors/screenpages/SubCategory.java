package com.dyt.ors.screenpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class SubCategory extends WebLibrary {

	@FindBy(xpath = "//a[text()='Sub Categories']")
	public static WebElement link_subCategory;
	
	@FindBy(xpath = "//h1[text()='Sub Categories']")
	public static WebElement verify_header;
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div[1]/h6")
	public static WebElement verify_tableHeader;
	
	@FindBy(xpath = "//a[@href='addSubCategories']")
	public static WebElement link_addSubCategory;
	
	@FindBy(xpath = "//select[@id='mainCatgDropdown']")
	public static WebElement txt_selectMainCategory;
	
	@FindBy(xpath = "//input[@id='subCatgName']")
	public static WebElement txt_subCategory;
	
	@FindBy(xpath = "//select[@id='ors_sub_order']")
	public static WebElement txt_subOrder;
	
	@FindBy(xpath = "//input[@id='LitImage']")
	public static WebElement link_image;
	
	@FindBy(xpath = "//input[@id='LitPDF']")
	public static WebElement link_document;
	
	@FindBy(xpath = "//table[@id='servDetails']/tbody/tr/td[4]/i")
	public static WebElement add_details;
	
	@FindBy(xpath = "//table[@id='servDetails']/tbody/tr/td[5]/i")
	public static WebElement delete_details;
	
	@FindBy(xpath = "//input[@value='Submit']")
	public static WebElement click_submit;

	//=============================Add SubCategory==============================
	public static void addSubCategory() {
		boolean bStatus;
		
		bStatus = clickElement(link_subCategory);
		Reporter.log(bStatus, " SubCategory link clicked", "SubCategory link not clicked");
		
		bStatus = verifyText(verify_header);
		Reporter.log(bStatus, "Header verified", "Header not verified");
		
		bStatus = verifyText(verify_tableHeader);
		Reporter.log(bStatus, "Table header verified", "Table header not verified");
		
		bStatus = clickElement(link_addSubCategory);
		Reporter.log(bStatus, "Add SubCategory link clicked", "Add SubCategory link not clicked");
		
		bStatus = selectListItem(txt_selectMainCategory,"Acetonicpoly");
		Reporter.log(bStatus, "Selected main category from list", "Not selected main category from list");
		
		bStatus = setEditValue(txt_subCategory,"PARASITE");
		Reporter.log(bStatus, "Sub category Entered", "Sub category not entered");
		
		bStatus = selectListItem(txt_subOrder,"C");
		Reporter.log(bStatus, "Sub order selected", "Sub order not selected");
		
		bStatus = fileUpload(link_image,"D:\\images\\glenmark.jpg");
		Reporter.log(bStatus, "Image uploaded", "Image not uploaded");
		
		bStatus = selectListItem(link_document,"D:\\Documents\\EDLN.pdf");
		Reporter.log(bStatus, "Document uploaded", "Document not uploaded");
		
		bStatus = clickElement(click_submit);
		Reporter.log(bStatus, "Submit button clicked", "Submit button not clicked");
	}
	
	//========================verify SubCategory Table================================
	public static void verifySubTable() {
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
	
	//===================Add SubCategory Without Mandatory Fields==========================
	
	public static void subWithoutMandatory() {
		boolean bStatus;
		
		bStatus = clickElement(link_subCategory);
		Reporter.log(bStatus, " SubCategory link clicked", "SubCategory link not clicked");
	
		bStatus = verifyText(verify_header);
		Reporter.log(bStatus, "Header verified", "Header not verified");
		
		bStatus = clickElement(link_addSubCategory);
		Reporter.log(bStatus, "Add SubCategory link clicked", "Add SubCategory link not clicked");
		
		wait(2);
		
		bStatus = clickElement(click_submit);
		//Reporter.log(bStatus, "Submit button clicked", "Submit button not clicked");
		
		wait(2);
	
		 alertswitch();
		 capturealert();
		 alert();
		 defaultswitch();
		//Reporter.log(bStatus, "Alert Accepted", "Alert not Accepted");
		
	}

	
}
