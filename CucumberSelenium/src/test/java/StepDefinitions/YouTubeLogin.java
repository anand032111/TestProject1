package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class YouTubeLogin {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	   System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver = new FirefoxDriver();
		System.out.println("Browser open");
	}

	@When("navigate to url")
	public void navigate_to_url() {
		 driver.navigate().to("https://facebook.com"); 
		
		 
		System.out.println("url open");
	}

	@And("enter valid username and password")
	public void enter_valid_username_and_password() {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anand5581@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Fzs@7620");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		 System.out.println("login page open");
	}

	@Then("able to see homepage")
	public void able_to_see_homepage() {
		 System.out.println("home page open");
		 
		 driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
		 driver.findElement(By.xpath("//text()[.='Log Out']/ancestor::span[1]")).click();
		 
		 //driver.close();
	}
	
}
