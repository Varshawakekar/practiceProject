package org.myPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BasicUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com");


		WebElement dd =driver.findElement(By.cssSelector("label[for='fromCity']"));
		dd.click();

		WebElement from= driver.findElement(By.xpath("//p[text()='Mumbai, India']"));


		wt.until(ExpectedConditions.elementToBeClickable(from));
		from.click();
		WebElement dd2 =driver.findElement(By.xpath("//span[text()='To']"));
		wt.until(ExpectedConditions.elementToBeClickable(dd2));

		dd2.click();


		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();

		WebElement dep =driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]"));
		wt.until(ExpectedConditions.elementToBeClickable(dep));

		dep.click();
		driver.findElement(By.xpath("(//p[text()='2'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
	}
}
