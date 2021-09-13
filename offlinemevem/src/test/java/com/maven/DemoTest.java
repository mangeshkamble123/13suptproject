package com.maven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	
	@Test
	public void f(){
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/selenium%20set%20up/Offline%20Website/Offline%20Website/index.html");
	String expected="Java By Kiran";
	
	String actual = driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
	Assert.assertEquals(actual, expected);
	}
	}

