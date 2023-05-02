package com.demo.example.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	public static void main( String[] args )
    {
		WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Boomika");
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("boomika123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Aparna");
        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("aparna345@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Birthday Celebration");
        driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("2000");
    }
}
