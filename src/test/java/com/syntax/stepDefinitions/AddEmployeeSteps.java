package com.syntax.stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.syntax.pages.AddEmployeePage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeSteps extends BaseClass{
	
	AddEmployeePage AddEmp;
	
	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM() {
		AddEmp = new AddEmployeePage();
		CommonMethods.enterValue(AddEmp.userName,  prop.getProperty("userName"));
		CommonMethods.enterValue(AddEmp.password, prop.getProperty("password"));
		CommonMethods.click(AddEmp.btnLogin);
		
	}
	
	@When("^I navigated to the Add Employee Page$")
	public void i_navigated_to_the_Add_Employee_Page()  {
	CommonMethods.click(AddEmp.PIMLink);	
	CommonMethods.click(AddEmp.AddEmployee);
	
	
		
	  
	}

	@When("^I provide the first name, middle name and last name of the employee$")
	public void i_provide_the_first_name_middle_name_and_last_name_of_the_employee() throws Throwable {
		CommonMethods.enterValue(AddEmp.firstName, prop.getProperty("firstName"));
		CommonMethods.enterValue(AddEmp.middleName, prop.getProperty("middleName"));
		CommonMethods.enterValue(AddEmp.lastName, prop.getProperty("lastName"));
	    ;
	}

	@Then("^I successfully added an employee$")
	public void i_successfully_added_an_employee() throws Throwable {
		CommonMethods.click(AddEmp.save);
	    
	}

	@When("^I navigated to the Employee List Page$")
	public void i_navigated_to_the_Employee_List_Page()  {
		CommonMethods.click(AddEmp.PIMLink);
		CommonMethods.click(AddEmp.EmpList);
		
	 
	}

	@When("^I search for an added employee$")
	public void i_search_for_an_added_employee() {
		CommonMethods.enterValue(AddEmp.Empsearch, "Khan Shamtalo Ali");
		AddEmp.Empsearch.sendKeys(Keys.ENTER);
	}

	@When("^selected that employee$")
	public void selected_that_employee() {
		CommonMethods.click(AddEmp.selectEmp);
	
	}

	@Then("^I navigated to the employee profile$")
	public void i_navigated_to_the_employee_profile() throws InterruptedException  {
		CommonMethods.click(AddEmp.EmpPorfile);
	  
	}
	@Then("^I can edit Employee information \"([^\"]*)\"$")
	public void i_can_edit_Employee_information(String licenseNo) throws Throwable {
   		CommonMethods.click(AddEmp.Edit);
		CommonMethods.enterValue(AddEmp.LicenNo, licenseNo);
		CommonMethods.click(AddEmp.gender);
		CommonMethods.click(AddEmp.LiceExpirDate);
		CommonMethods.click(AddEmp.SlctMonth);
		CommonMethods.click(AddEmp.slctYear);
		CommonMethods.click(AddEmp.date);
		CommonMethods.click(AddEmp.save1);
		Thread.sleep(3000);
	}


	@Then("^I should be able to delete that employee$")
	public void i_should_be_able_to_delete_that_employee() throws Throwable {
		CommonMethods.click(AddEmp.checklist);
		CommonMethods.click(AddEmp.delete);
		Thread.sleep(5000);
		
	    
	}


}
