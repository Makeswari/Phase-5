package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\phase5\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		
		
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Makeswari");
				
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("makeswari2001@gmail.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9698431339");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Mahi@2001");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		register.click();
}

}
