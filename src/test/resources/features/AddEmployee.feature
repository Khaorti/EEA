#Author: Kharoti
Feature: Employee

Background:
	Given I logged into OrangeHRM
	
	Scenario: Add Employee
		When I navigated to the Add Employee Page
		And I provide the first name, middle name and last name of the employee
		Then I successfully added an employee
	
	
	
	Scenario: Modify Employee
		When I navigated to the Employee List Page
    And I search for an added employee
    And selected that employee
   Then I navigated to the employee profile
   And I can edit Employee information "ART1234"
	
	
	
	Scenario: Delete Employee
		When I navigated to the Employee List Page
		And I search for an added employee
	 Then I should be able to delete that employee
