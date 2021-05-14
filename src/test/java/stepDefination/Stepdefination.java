package stepDefination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utiliy.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination {
	
	WebDriver driver =Basepage.driver;
	@Given("User gives application link")
	public void user_gives_application_link() {
		 driver.get("http://elearningm1.upskills.in/");
	}

	@Then("Click on Registration")
	public void click_on_Registration() {
	  driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
	}
	
	@When("User enter First name {string} User enter Last name {string}")
	public void user_enter_First_name_User_enter_Last_name(String Firstname, String Lastname) {
		 driver.findElement(By.name("firstname")).sendKeys(Firstname);
		   driver.findElement(By.name("lastname")).sendKeys(Lastname);
	}

	@Then("User enter email {string} user enter the username {string} user enter the password {string}")
	public void user_enter_e_mail_user_enter_the_username_user_enter_the_password(String email, String Username, String pass) {
		driver.findElement(By.name("email")).sendKeys(email);
		   driver.findElement(By.name("username")).sendKeys(Username);
		   driver.findElement(By.name("pass1")).sendKeys(pass);

	}

	@Then("User enter Confirm password {string} user enter the Phone {string} user enter the Code {string}")
	public void user_enter_Confirm_password_user_enter_the_Phone_user_enter_the_Code(String pass, String Phone, String Code) {
		driver.findElement(By.name("pass2")).sendKeys(pass);
		driver.findElement(By.id("registration_phone")).sendKeys(Phone);
		driver.findElement(By.className("form-control")).sendKeys(Code);   
	}
	

	@Then("User Click Register.")
	public void user_Click_Register() {
		driver.findElement(By.name("submit")).click();
	   }
	@Then("verify the username{string}")
	public void verify_the_username(String userregistered) {
		String message =driver.findElement(By.xpath("//h2[contains(text(),'Registration')]//following::div[1]")).getText();
		System.out.println(message);
		assertEquals(message, userregistered);
	}
	@Then("User Click on home icon")
	public void user_Click_on_home_icon() {
		driver.findElement(By.xpath("//a[contains(text(),'Homepage')]")).click();
	}

	@Then("user enter the required fields {string},{string}")
	public void user_enter_the_required_fields(String Username, String pass) throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.id("login")).sendKeys(Username);
		Thread.sleep(500);
		driver.findElement(By.id("password")).sendKeys(pass);
		Thread.sleep(500);
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitAuth")).click();
	}

	@Then("user verify that Register is completed sucessfull {string}")
	public void user_verify_that_Register_is_completed_sucessfull(String registered) {
	   String message =driver.findElement(By.xpath("//ul[@class='breadcrumb']//following::p[1]")).getText();
		System.out.println(message.substring(6, 25));
		assertEquals(message.substring(6, 25), registered);
  }

  @Then("user logout the successfull")
  public void user_logout_the_successfull() {
	  driver.findElement(By.className("dropdown-toggle")).click();
	  driver.findElement(By.id("logout_button")).click();
    
  }
  @Then("user click inbox")
  public void user_click_inbox() {
	  driver.findElement(By.className("dropdown-toggle")).click();
	  driver.findElement(By.xpath("//a[@title='Inbox']")).click();
  }

  @Then("user click on Compose message")
  public void user_click_on_Compose_message() {
	  driver.findElement(By.xpath("//img[@title='Compose message']")).click();
  }

  @Then("enter the required field {string},{string}")
  public void enter_the_required_field(String Subject, String Message ) throws InterruptedException {
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("test");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='select2-compose_message_users-results']/li[1]")).click();
	  driver.findElement(By.id("compose_message_title")).sendKeys(Subject);
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//label[contains(text(),'Message')]//following::iframe[1]")).sendKeys(Message);
	  
  }

  @Then("attach the img and click on send button")
  public void attach_the_img_and_click_on_send_button() {
	  WebElement chooseFile = driver.findElement(By.name("attach_1"));
	  chooseFile.sendKeys("C:\\Users\\SravaniJagarlamudi\\Desktop\\pexels-photo-2072165.jpeg");
	  driver.findElement(By.name("compose")).click();
  }

}
