package com.demo.example.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_3 {
	public static void main(String[]args) {
		WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions(); 
	       co.addArguments("--remote-allow-origins=*");

		WebDriver chromedriver = new ChromeDriver(co);
		WebDriver driver = new ChromeDriver(co);
		WebDriver drivertwo = new EdgeDriver();
		chromedriver.get("https://www.google.com/");
	    driver.get("https://www.google.com/");
	    drivertwo.get("https://www.google.com/");
	    
	}
}
