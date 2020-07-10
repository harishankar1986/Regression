package com.dyt.ors.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.generic.BaseClass;
import com.dyt.ors.screenpages.Dashboard;
import com.dyt.ors.screenpages.Home;
import com.dyt.ors.screenpages.Login;
import com.dyt.ors.screenpages.MainCategories;
import com.dyt.ors.screenpages.Products;
import com.dyt.ors.screenpages.SubCategories;
import com.dyt.ors.screenpages.SubCategory;
import com.dyt.utilities.ExcelLib;

public class AdminProducts extends BaseClass {

	@Test
	public static void TC01_addMainCategory()
	{	
		String[] data = ExcelLib.getRowData("TC001_addMainCategory", Smoke_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		MainCategories maincategories = PageFactory.initElements(driver, MainCategories.class);
		
		//Step 1: Login as an admin
		Home.navLoginpage();
		//login.loginApp("admin","admin@123");
		login.loginApp(data[0],data[1]);
		//Step 2: Navigate to Main Category page
		dashboard.navMainCategories();
		
		//step 3: Add MainCategories
		maincategories.MainCategory();
		
		
		
		// Step n : Logout		
	}
	
	//=======================Test Case For SubCategory======================
	@Test
	public static void TC02_subCategory() {
		String[] data = ExcelLib.getRowData("TC001_addMainCategory", Smoke_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		SubCategory subcategories = PageFactory.initElements(driver, SubCategory.class);
		
		//Step 1: Login
		Home.navLoginpage();
		login.loginApp(data[0],data[1]);
		//Step 2: Navigate to SubCategory page
		dashboard.navSubCategories();
		//Step 3: Add Sub Category details
		SubCategory.addSubCategory();
		//Step 4: Verify the details entered
		SubCategory.verifySubTable();
		
	}
	//================TestCase SubCategory Without Mandatories=================
	@Test
	public static void TC03_subCategoryWithoutMandatories() {
		String[] data = ExcelLib.getRowData("TC001_addMainCategory", Smoke_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		SubCategory subcategories = PageFactory.initElements(driver, SubCategory.class);
		
		//Step 1: Login
		Home.navLoginpage();
		login.loginApp(data[0],data[1]);
		//Step 2: Navigate to SubCategory page
		dashboard.navSubCategories();
		//Step 3: Click Submit without adding credentials
		SubCategory.subWithoutMandatory();
		//Step 3: Add Sub Category details
		SubCategory.addSubCategory();
		
	}
}
