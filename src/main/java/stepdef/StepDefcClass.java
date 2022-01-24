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

	@Then("User enters his {string}")
	public void user_enters_his(String income) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys(income);
	}

	@Then("User enters   {string}")
	public void user_enters(String other_income) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).sendKeys(other_income);
	}

	@Then("User enters the {string}")
	public void user_enters_the(String monthly_expenses) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys(monthly_expenses);
	}

	@Then("User enters as {string}")
	public void user_enters_as(String current_home_loan_monthly_repayments) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']")).sendKeys(current_home_loan_monthly_repayments);
	}

	@Then("User enters as the {string}")
	public void user_enters_as_the(String other_loan_monthly_repayments) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']")).sendKeys(other_loan_monthly_repayments);
	}

	@Then("User enters for {string}")
	public void user_enters_for(String other_monthly_commitments) {
      driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']")).sendKeys(other_monthly_commitments);
	}

	@Then("User enters in {string}")
	public void user_enters_in(String total_credit_card_limit) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']")).sendKeys(total_credit_card_limit);
	}

	@Then("User clicks on the button  work out how much i could borrow")
	public void user_clicks_on_the_button_work_out_how_much_i_could_borrow() throws InterruptedException {
		driver.findElement(By.id("btnBorrowCalculater")).click();
		Thread.sleep(5000);
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

	@Then("User enters zero annual {string}")
	public void user_enters_zero_annual(String income) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys(income);
	}

	@Then("User enters zero as the {string}")
	public void user_enters_zero_as_the(String other_income) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).sendKeys(other_income);
	}

	@Then("User enters one dollar as a {string}")
	public void user_enters_one_dollar_as_a(String monthly_expenses) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys(monthly_expenses);
	}

	@Then("User enters zero as {string}")
	public void user_enters_zero_as(String current_home_loan_monthly_repayments) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']")).sendKeys(current_home_loan_monthly_repayments);
	}

	@Then("User enters zero for the {string}")
	public void user_enters_zero_for_the(String other_loan_monthly_repayments) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']")).sendKeys(other_loan_monthly_repayments);
	}

	@Then("User enters zero  the  {string}")
	public void user_enters_zero_the(String other_monthly_commitments) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']")).sendKeys(other_monthly_commitments);
	}

	@Then("User enters  zero in the {string}")
	public void user_enters_zero_in_the(String total_credit_card_limit) {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']")).sendKeys(total_credit_card_limit);
	}

	@Then("User select on the button  work out how much i could borrow")
	public void user_select_on_the_button_work_out_how_much_i_could_borrow() {
		driver.findElement(By.id("btnBorrowCalculater")).click();
	}

	@Then("User captures the error message")
	public void user_captures_the_error_message() {
		 String errormessage =driver.findElement(By.xpath("//div[@class='borrow__error__text']")).getText();
		 System.out.println("error message shown: "+ errormessage);
	}





}
