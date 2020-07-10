 package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Products extends WebLibrary {
	@FindBy (xpath = "//div[@class='container-fluid']/div/a")
	public static WebElement link_AddProducts;
	
	@FindBy (xpath = "//select[@id='ors_mc_id']")
	public static WebElement selt_MainCategory;
	
	@FindBy (xpath = "//select[@id='subCatg']")
	public static WebElement selt_Subcategory;
	
	@FindBy (xpath = "//input[@id='catNo']")
	public static WebElement txt_Catno;
	
	@FindBy (xpath = "//input[@id='prdDesc']")
	public static WebElement txt_ProductDescription;
	
	@FindBy (xpath = "//input[@id='prdGrade']")
	public static WebElement txt_ProductGrade;
	
	@FindBy (xpath = "//input[@id='prdSynon']")
	public static WebElement txt_Synonyms;
	
	@FindBy (xpath = "//input[@id='prdCasNo']")
	public static WebElement txt_Casno;
	
	@FindBy (xpath = "//input[@id='prdMake']")
	public static WebElement txt_EnterMake;
	
	@FindBy (xpath = "//input[@name='ors_prds_pack_size']")
	public static WebElement txt_PackSize;
	
	@FindBy (xpath = "//input[@id='ors_prds_avalibility']")
	public static WebElement txt_Avalibility;
	
	@FindBy (xpath = "//input[@name='ors_prds_HS_code']")
	public static WebElement txt_HsCode;
	
	@FindBy (xpath = "//input[@id='prdPrize']")
	public static WebElement txt_Productprize;
	
	@FindBy (xpath = "//select[@id='ors_prds_orderBy']")
	public static WebElement selt_Assignedorder;
	
	@FindBy (xpath = "//input[@id='prdImage']")
	public static WebElement link_productimg;
	
	@FindBy (xpath = "//input[@id='prdSDS']")
	public static WebElement link_productSds;
	
	@FindBy (xpath = "//input[@id='prdPSS']")
	public static WebElement link_ProductSheet;
	
	@FindBy (xpath = "//input[@id='ors_cao_lotNo']")
	public static WebElement txt_lotnum;
	
	@FindBy (xpath = "//input[@id='coaPDF']")
	public static WebElement link_pdf;
	
	@FindBy (xpath = "//input[@class='btn btn-success']")
	public static WebElement link_productsubmit;
	
	//=======Methods============
	public static void Product() {
		boolean bStatus;
		
	bStatus = clickElement(link_AddProducts);
	Reporter.log(bStatus, "Add product clicked", "Add products not clicked");
	
	bStatus = selectListItem(selt_MainCategory, "GLENMAARK");
	Reporter.log(bStatus, "Main category selected", "Main Category not selected");
	
	bStatus = selectListItem(selt_Subcategory,"FAAVIPIRAVIRES");
	Reporter.log(bStatus, "Sub category selected", "Sub category not selected");
	
	bStatus = setEditValue(txt_Catno,"CS-W00047724");
	Reporter.log(bStatus, "Cat number entered", "Cat number entery failed");
	
	bStatus = setEditValue(txt_ProductDescription,"Fever control with no side effects");
	Reporter.log(bStatus, "Product description entered", "Product description not entered");
	
	bStatus = setEditValue(txt_ProductGrade,"ISO 10998");
	Reporter.log(bStatus, "Product grade entered", "Product grade didnot entered");
	
	bStatus = setEditValue(txt_Synonyms,"pyrexias");
	Reporter.log(bStatus, "Synonyms entered", "Synonyms entery failed");
	
	bStatus = setEditValue(txt_Casno,"124755-24-21");
	Reporter.log(bStatus, "Cas number entered", "Cas number did not entered");
	
	bStatus = setEditValue(txt_EnterMake,"INDI LABS");
	Reporter.log(bStatus, "Make entered sucessfully", "Unable to ente Make");
	
	bStatus = setEditValue(txt_PackSize,"12");
	Reporter.log(bStatus, "Pack Size Entered", "Pack size entery failed");
	
	bStatus = setValueEscape(txt_Avalibility,"0333");
	Reporter.log(bStatus, "Avialibilty Entered", "Avalibility unable to entered");
	
	bStatus = setEditValue(txt_HsCode,"3402206");
	Reporter.log(bStatus, "HSC Code entered", "HSC code entery failed");
	
	bStatus = setValueEscape(txt_Productprize, "1035");
	Reporter.log(bStatus, "Product size entered", "Product size unable to entered");
	
	bStatus = selectListItem(selt_Assignedorder,"C");
	Reporter.log(bStatus, "Assigned order entered", "Assigned order not entered");
	
	bStatus = fileUpload(link_productimg,"C:\\Users\\SREEHARI\\Documents\\glenmark.jpg");
	Reporter.log(bStatus, "Product image uploaded", "Product image unable to upload");
	
	bStatus = fileUpload(link_productSds,"C:\\Users\\SREEHARI\\Documents\\file-sample_150kB.pdf");
	Reporter.log(bStatus, "SDS file uploaded", "SDS file upload failed");
	
	bStatus = fileUpload(link_ProductSheet,"C:\\Users\\SREEHARI\\Documents\\file-sample_150kB.pdf");
	Reporter.log(bStatus, "Production sheet uploaded", "Product sheet uploaded");
	
	bStatus = setEditValue(txt_lotnum,"Fab12269789");
	Reporter.log(bStatus, "Lot number entered", "Unable to enter Lot number");
	
	bStatus = fileUpload(link_pdf,"C:\\Users\\SREEHARI\\Documents\\file-sample_150kB.pdf");
	Reporter.log(bStatus, "PDF file uploaded", "PDF file uploaded");
	
	bStatus = clickElement(link_productsubmit);
	Reporter.log(bStatus, "Product submitted", "product submition failed");
			
	

}
}