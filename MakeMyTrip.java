package org.myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class MakeMyTrip {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url ="https://www.makemytrip.com/";
		WebDriver driver = bu.startUp("ch", url);
		//driver initialized
		WebElement dd =driver.findElement(By.cssSelector("label[for='fromCity']"));
		dd.click();
		//select departure
		bu.waitForElementToBeClickable(driver, dd, 10);	
	driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();

	WebElement dd2 =driver.findElement(By.xpath("//span[text()='To']"));
	bu.waitForElementToBeClickable(driver, dd, 10);	
	dd2.click();
	
	// Drop point
	driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']")).click();
	
	WebElement dep =driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]"));
	bu.waitForElementToBeClickable(driver, dep, 10);

	dep.click();
	//select date
	driver.findElement(By.xpath("(//p[text()='2'])[2]")).click();
	//click on search
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	}
}
