package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class EditSubCategories extends WebLibrary {
	@FindBy (xpath = "//*[@id='dataTable']/tbody/tr[10]/td[5]/a[1]/i")
	public static WebElement link_edit;
	
	@FindBy (xpath = "//h1[text()='Sub Categories']")
	public static WebElement verify_header;
	
	@FindBy (xpath = "//*[@id='content']/div/div[2]/div[1]/h6")
	public static WebElement link_header;
	
	@FindBy (xpath = "//*[@id='mainCatgDropdown']/option[39]")
	public static WebElement edit_maincatagory;
	
	@FindBy (xpath = "//input[@id='subCatgName']")
	public static WebElement edit_subcategory;
	
	@FindBy (xpath = "//input[@class='btn btn-success']")
	public static WebElement link_sumbit;
	
	//========Methods=============
	public static void editsubcategory()
	{
		boolean bStatus;
		
		bStatus = clickElement(link_edit);
	    Reporter.log(bStatus, "Edit button clicked", "unable to click edit button");
	    
	   // bStatus = setValueEscape(edit_subcategory, "FAAVIPIRAVIRES1");
	   // Reporter.log(bStatus, "sub category changed", "unable to change sub category");
	    
	    bStatus = clickElement(link_sumbit);
	    Reporter.log(bStatus, "Submitted", "submit failed");
	    
	    alert();
	}

}
