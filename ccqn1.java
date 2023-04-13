package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ccqn1 {
	public static void main(String []args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions fo = new ChromeOptions();
	fo.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(fo);
	driver.get("https://www.saucedemo.com/");
	//Enter Username
	WebElement wb1=driver.findElement(By.id("user-name"));
	wb1.sendKeys("standard_user"+Keys.ENTER);
	//Enter Password
	WebElement wb2=driver.findElement(By.id("password"));
	wb2.sendKeys("secret_sauce"+Keys.ENTER);
	//Press Login
	WebElement wb3=driver.findElement(By.id("login-button"));
	wb3.submit();
	//Add to cart
	WebElement wb5 =driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
	wb5.click();
	//View cart
	WebElement wb6 =driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	wb6.click();
	//Checkout Cart
	WebElement wb7 =driver.findElement(By.id("checkout"));
	wb7.click();
	//Fill Form
	WebElement fname= driver.findElement(By.id("first-name"));
	fname.sendKeys("Kabilan");
	WebElement lname= driver.findElement(By.id("last-name"));
	lname.sendKeys("V V");
	WebElement code= driver.findElement(By.id("postal-code"));
	code.sendKeys("607803");
	//click Continue
	WebElement conti =driver.findElement(By.id("continue"));
	conti.click();
	WebElement wb8 =driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
	String pname=wb8.getText();
	WebElement wb9 =driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]"));
	String price=wb9.getText();
	System.out.println("Product : "+pname);
	System.out.println("Price : "+price);
	String title=driver.getTitle();
	String url=driver.getCurrentUrl();
	if(title.equals("Swag Labs"))
		System.out.println("Title Verified Successfully");
	else
		System.out.println("Title Not Verified");
	if(url.equals("https://www.saucedemo.com/checkout-step-two.html"))
		System.out.println("URL Verified Successfully");
	else
		System.out.println("URL Not Verified");
}
}
