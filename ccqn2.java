package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ccqn2 {

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
	

	WebElement sort1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	Select select1=new Select(sort1);
	select1.selectByValue("za");
	WebElement name1=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
	String txt1=name1.getText();
	System.out.println("1st Product After Z-A Filter"+txt1);
	
	WebElement sort2=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	Select select2=new Select(sort2);
	select2.selectByValue("lohi");
	WebElement name2=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
	String txt2=name2.getText();
	System.out.println("1st Product After Low-High Filter"+txt2);

	WebElement sort3=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	Select select3=new Select(sort3);
	select3.selectByValue("hilo");
	WebElement name3=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
	String txt3=name3.getText();
	System.out.println("1st Product After High-Low Filter"+txt3);
}
}
