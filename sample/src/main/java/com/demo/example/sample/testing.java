	package com.demo.example.sample;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class testing {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("https://j2store.net/free/index.php/shop/clothing/t-shirts/simple"));
	    driver.navigate().back();
	    driver.navigate().forward();
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	}
}
	