package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddEmployeePage extends BaseClass{
	
	@FindBy(id = "txtUsername")
    public static WebElement userName;

    @FindBy(id = "txtPassword")
    public static WebElement password;
    
    @FindBy(id = "btnLogin")
    public static WebElement btnLogin;
    
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    public static WebElement PIMLink;
    
    @FindBy (xpath = "//a[@id='menu_pim_addEmployee']")
    public static WebElement AddEmployee;
    
    @FindBy (xpath = "//input[@id='firstName']")
    public static WebElement firstName;
    
    @FindBy (xpath = "//input[@id='middleName']")
    public static WebElement middleName;
    
    @FindBy (xpath = "//input[@id='lastName']")
    public static WebElement lastName;
    
    @FindBy (xpath = "//input[@id='btnSave']")
    public static WebElement save;
    
    @FindBy (xpath = "//a[@id='menu_pim_viewEmployeeList']")
    public static WebElement EmpList;
    
    @FindBy (xpath = "//input[@id='empsearch_employee_name_empName']")
    public static WebElement Empsearch;
    
    @FindBy (xpath = "//input[@id='searchBtn']")
    public static WebElement selectEmp;
    
    @FindBy(xpath = "//a[@href='/index.php/pim/viewEmployee/empNumber/17'][contains(text(),'Khan Shamtalo')]")
    public static WebElement EmpPorfile;
    
    @FindBy (xpath = "//input[@id='btnSave']")
    public static WebElement Edit;
    
    @FindBy (xpath = "//input[@id='personal_txtLicenNo']")
    public static WebElement LicenNo;
    
    @FindBy (xpath = "//input[@id='personal_optGender_1']")
    public static WebElement gender;
    
    @FindBy (xpath = "//fieldset//ol[2]//li[4]//img[1]")
    public static WebElement LiceExpirDate;
    
    @FindBy (xpath = "//select[@class='ui-datepicker-month']")
    public static WebElement SlctMonth;
    
    @FindBy (xpath = "//select[@class='ui-datepicker-year']")
    public static WebElement slctYear;
    
    @FindBy (xpath = "//a[contains(text(),'30')]")
    public static WebElement date;
    
    @FindBy (xpath = "//input[@id='btnSave']")
    public static WebElement save1;
   
    @FindBy (xpath = "//input[@id='ohrmList_chkSelectRecord_11']") 
    public static WebElement checklist;
    
    @FindBy (xpath = "//input[@id='btnDelete']")
    public static WebElement delete;
    
    
    public  AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }
    


}
