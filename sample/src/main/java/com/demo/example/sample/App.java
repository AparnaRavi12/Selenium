package com.demo.example.sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Aparna");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Ravi");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727722euai502@skcet.ac.in");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("skcet123");
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
    }
}
