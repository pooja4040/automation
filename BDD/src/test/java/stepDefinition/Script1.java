package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script1 {
	
	WebDriver driver1;
	
	@Given("Visit the website page in chrome")
	public void visit_the_website_page_in_chrome() {
			 
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	          driver1=new ChromeDriver();
			  driver1.get("https://phptravels.org/register.php");

	    
	}
	@When("Enter the all details required")
	public void enter_the_all_details_required() throws InterruptedException {
		driver1.findElement(By.id("inputFirstName")).sendKeys("pooja");
        driver1.findElement(By.id("inputLastName")).sendKeys("pooja");
		 driver1.findElement(By.id("inputEmail")).sendKeys("poojareddy.edavelly99133@gmail.com");
		 driver1.findElement(By.id("inputPhone")).sendKeys("9087536734");
		 driver1.findElement(By.id("inputCompanyName")).sendKeys("HCL");
		 driver1.findElement(By.id("inputAddress1")).sendKeys("SRnagar");
		 driver1.findElement(By.id("inputAddress2")).sendKeys("nagar");
		 driver1.findElement(By.id("inputCity")).sendKeys("Hyderabad");
		 driver1.findElement(By.name("state")).sendKeys("Telangana");
		 driver1.findElement(By.id("inputPostcode")).sendKeys("500090");
		 driver1.findElement(By.id("inputCountry")).sendKeys("india");
		 driver1.findElement(By.id("customfield2")).sendKeys("8674332244");
		 driver1.findElement(By.id("inputNewPassword1")).sendKeys("Pooja@123");
		 driver1.findElement(By.id("inputNewPassword2")).sendKeys("Pooja@123");
		 Thread.sleep(90000);
	}
	@Then("Registartion success")
	public void registartion_success() {
		 driver1.findElement(By.xpath("//*[@id='frmCheckout']/p/input")).click();
		    
	}
	
	
	@Given("Visit the site")
	public void visit_the_site() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver1=new ChromeDriver();
		
	    driver1.get("https://phptravels.org/index.php?rp=/login");
	}
	@When("give the user credentials")
	public void give_the_user_credentials() throws InterruptedException {
		driver1.findElement(By.id("inputEmail")).sendKeys("poojareddy.edavelly99133@gmail.com");
		 
		 driver1.findElement(By.id("inputPassword")).sendKeys("Pooja@123");
		 
		 Thread.sleep(100000);
	}
	@Then("login success")
	public void login_success() {
		 driver1.findElement(By.xpath("//*[@id='login']")).click();
	}
	
	@And("searched for services")
	public void searched_for_services() {
 driver1.findElement(By.linkText("Order New Services")).click();
		 
		 driver1.findElement(By.linkText("Mobile")).click();
		 
		 driver1.findElement(By.id("pid17")).click();
	   
	}
	@Then("add an item successfully")
	public void add_an_item_successfully() {
		driver1.findElement(By.xpath("//*[@id='order-boxes']/div[3]/form/div[2]/button")).click();
        
	}
	
	
	
	
	
}