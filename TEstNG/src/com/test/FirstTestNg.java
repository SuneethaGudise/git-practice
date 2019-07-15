package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestNg {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
    WebDriver dr = new ChromeDriver();
    dr.get("http://whiteboxqa.com/");
    dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    WebElement 	elem =  dr.findElement(By.id("loginButton"));
    elem.click();
    dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		//(webdriver.chrome.driver",C:/Users/ravi/Downloads/chromedriver_win32);
    WebElement el =dr.findElement(By.linkText("FAQ"));
    el.click();
    dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    WebElement el1= dr.findElement(By.linkText("DEMOS"));
    el1.click();

}
