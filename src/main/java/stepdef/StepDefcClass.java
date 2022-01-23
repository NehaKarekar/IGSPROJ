package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefcClass {
	 public static WebDriver driver;
	@Given("User enters the URL")
	public void user_enters_the_url() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neha\\Desktop\\chromedriver (1).exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	  
	}

	@Then("User click on appplication type single")
	public void user_click_on_appplication_type_single() {
		driver.findElement(By.xpath("//label[@for='application_type_single']")).click();
	   
	}

	@Then("User add zero dependants")
	public void user_add_zero_dependants() {
		driver.findElement(By.xpath("//select/option[text()='0']")).click();
	   
	}

	@Then("User choose the property type as home to live in")
	public void user_choose_the_property_type_as_home_to_live_in() {
		driver.findElement(By.xpath("//label[@for='borrow_type_home']")).click();
	 
	}

	@Then("User enters his income")
	public void user_enters_his_income() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys("80000");
	    
	}

	@Then("User enters the other income")
	public void user_enters_the_other_income() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).sendKeys("10000");
	 
	}

	@Then("User enters the monthly expenses")
	public void user_enters_the_monthly_expenses() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys("500");
	   
	}

	@Then("User enters the current home loan monthly repayments")
	public void user_enters_the_current_home_loan_monthly_repayments() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']")).sendKeys("0");
	
	}

	@Then("User enters other loan monthly repayments")
	public void user_enters_other_loan_monthly_repayments() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']")).sendKeys("100");
	 
	}

	@Then("User enters other monthly commitments")
	public void user_enters_other_monthly_commitments() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']")).sendKeys("0");

	}

	@Then("User enters the total credit card limit")
	public void user_enters_the_total_credit_card_limit() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']")).sendKeys("10000");
	  
	}

	@Then("User clicks on the button  work out how much i could borrow")
	public void user_clicks_on_the_button_work_out_how_much_i_could_borrow() {
		driver.findElement(By.id("btnBorrowCalculater")).click();
	
	}

	@When("User click on start over button it clears the form")
	public void user_click_on_start_over_button_it_clears_the_form() {
		driver.findElement(By.xpath("//div[@class='result__restart']/button[@class='start-over']")).click();
	   
	}

	@Then("User select on appplication type single")
	public void user_select_on_appplication_type_single() {
		driver.findElement(By.xpath("//label[@for='application_type_single']")).click();
	    
	}

	@Then("User  enters zero dependants")
	public void user_enters_zero_dependants() {
		driver.findElement(By.xpath("//select/option[text()='0']")).click();
	   
	}

	@Then("User select property type as home to live in")
	public void user_select_property_type_as_home_to_live_in() {
		driver.findElement(By.xpath("//label[@for='borrow_type_home']")).click();
	  
	}

	@Then("User enters zero annual income")
	public void user_enters_zero_annual_income() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys("0");
	
	}

	@Then("User enters zero as the other income")
	public void user_enters_zero_as_the_other_income() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).sendKeys("0");
	   
	}

	@Then("User enters one dollar as a monthly expenses")
	public void user_enters_one_dollar_as_a_monthly_expenses() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys("1");

	}

	@Then("User enters zero as current home loan monthly repayments")
	public void user_enters_zero_as_current_home_loan_monthly_repayments() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']")).sendKeys("0");
	
	}

	@Then("User enters zero as the other loan monthly repayments")
	public void user_enters_zero_as_the_other_loan_monthly_repayments() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']")).sendKeys("0");
	   
	}

	@Then("User enters zero as the  other monthly commitments")
	public void user_enters_zero_as_the_other_monthly_commitments() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']")).sendKeys("0");
	  
	}

	@Then("User enters  zero as the total credit card limit")
	public void user_enters_zero_as_the_total_credit_card_limit() {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']")).sendKeys("0");
	
	}

	@Then("User select on the button  work out how much i could borrow")
	public void user_select_on_the_button_work_out_how_much_i_could_borrow() {
		driver.findElement(By.id("btnBorrowCalculater")).click();
	
	   
	}


}
