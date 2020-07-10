package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Search extends WebLibrary {

		@FindBy(xpath = "//input[@id = 'searchRecord']")
		public static WebElement search_data;
	
		@FindBy(xpath = "//input[@id='searchRecord']/following-sibling::div")
		public static WebElement search_btn;
		
		@FindBy (xpath = "//div[@class='col-md-9']/table/tbody")
		public static WebElement display_details;
		
		@FindBy (xpath = "//a[text()='acetaminophen']")
		public static WebElement link_acetaminophen;
		
		@FindBy (xpath = "//table[@class='table table-hover']/thead")
		public static WebElement display_header;
		
		@FindBy (xpath = "//table[@class='table table-hover']/tbody/tr[@class='text-center']")
		public static WebElement display_tdetails;
		
		//==================Methods==============
		
		public static void searchProduct() {
			boolean bStatus;
			
			bStatus = setValueEscape(search_data,"acetaminophen");
			Reporter.log(bStatus, "Assigned search data", "Search data not assigned");
			
			bStatus = clickElement(search_btn);
			Reporter.log(bStatus, "Search button clicked", "Search button not cliked");
			
			bStatus = verifyText(display_details);
			Reporter.log(bStatus, "Details verified", "Details not verified");
			
			bStatus = clickElement(link_acetaminophen);
			Reporter.log(bStatus, "Link clicked", "Link not clicked");
		
			bStatus = verifyText(display_header);
			Reporter.log(bStatus, "Table header displayed", "Table header not displayed");
			
			bStatus = verifyText(display_tdetails);
			Reporter.log(bStatus, "Details in table verified", "Details in table not verified");
	}
}
