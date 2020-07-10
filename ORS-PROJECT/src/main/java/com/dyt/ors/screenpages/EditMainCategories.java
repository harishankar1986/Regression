package com.dyt.ors.screenpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class EditMainCategories extends WebLibrary{
	@FindBy (xpath = "//td[text()='GLENMAARK']/following-sibling::td[2]/a[1]")
	public static WebElement link_edit;

	@FindBy (xpath = "//input[@id='ors_mc_category_name']")
	public static WebElement edit_categoryname;
	
	@FindBy (xpath = "//input[@class='btn btn-success']")
	public static WebElement clk_submmit;
	
	//==================Methods==============
	
	public static void editmain() {
		boolean bStatus;
		
		bStatus = clickElement(link_edit);
		Reporter.log(bStatus, "Edit clicked", "Unable to click edit");
		
		bStatus = setValueEscape(edit_categoryname,"GLENMAARKS1");
		Reporter.log(bStatus, "Category name updated", "unable to update category name");
		
		bStatus = clickElement(clk_submmit);
		Reporter.log(bStatus, "Submit clicked", "Submit failed");
	}

}
