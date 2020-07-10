package com.dyt.ors.smoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.generic.BaseClass;
import com.dyt.ors.screenpages.Dashboard;
import com.dyt.ors.screenpages.EditMainCategories;
import com.dyt.ors.screenpages.EditSubCategories;
import com.dyt.ors.screenpages.Home;
import com.dyt.ors.screenpages.Login;
import com.dyt.ors.screenpages.MainCategories;
import com.dyt.ors.screenpages.Products;
import com.dyt.ors.screenpages.Search;
import com.dyt.ors.screenpages.SubCategories;
import com.dyt.utilities.ExcelLib;


public class SmokeTestCases extends BaseClass{
	
	@Test
	public static void TC001_homeVerifyPage() {
		Home home = PageFactory.initElements(driver, Home.class);
		Home.homeVerifyPage();
	}
	
	@Test
	public static void TC002_SearchProducts() {
		Login login = PageFactory.initElements(driver, Login.class);
		//Home home = PageFactory.initElements(driver, Home.class);
		Search search = PageFactory.initElements(driver, Search.class);
		Search.searchProduct();
	}
	
	
	@Test
	public static void TC001_addMainCategory()
	{	
		String[] data = ExcelLib.getRowData("TC001_addMainCategory", Smoke_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		MainCategories maincategories = PageFactory.initElements(driver, MainCategories.class);
		
		//Step 1: Login as an admin
		Home.navLoginpage();
		//login.loginApp("admin","admin@123");
		Login.loginApp(data[0],data[1]);
		//Step 2: Navigate to Main Category page
		dashboard.navMainCategories();
		
		//step 3: Add MainCategories
		maincategories.MainCategory();
		
		
		
		// Step n : Logout		
	}
	//=============================================
	@Test
	public static void TC002_addSubCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		SubCategories subc = PageFactory.initElements(driver, SubCategories.class);
	
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp("admin","admin@123");
		
		//Step 2: Navigate to Main Category page
		dashboard.navSubCategories();
		
		//Step 3: Add SubCatgory product
		subc.Subcategory();
	}
	//=============================================
	@Test
	public static void TC003_addProducts()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		Products product = PageFactory.initElements(driver, Products.class);
	
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp("admin","admin@123");
		
		//Step 2: Navigate to Main Category page
		dashboard.navProducts();
		
		//Step 3: Add SubCatgory product
		product.Product();	
	}
	//===============================================
	@Test
	public static void TC004_editMainCategories()
	{
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		Products product = PageFactory.initElements(driver, Products.class);
		EditMainCategories EMC = PageFactory.initElements(driver, EditMainCategories.class);
				
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp("admin", "admin@123");
		
		//Step 2: Navigate to Main Category page
		dashboard.navMainCategories();
		
		//Step 3: Edit Main Categories 
		EMC.editmain();	
	}
	//=========================================================================
	@Test
	public static void TC005_editSubCategories()
	{
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		EditSubCategories ESC = PageFactory.initElements(driver, EditSubCategories.class);
		
		//Step 1: Login as an admin
				Home.navLoginpage();
				login.loginApp("admin", "admin@123");
				
				//Step 2: Navigate to Main Category page
				dashboard.navSubCategories();
				
				//step 3: Edit SubCategories
				ESC.editsubcategory();
				
	}
}
