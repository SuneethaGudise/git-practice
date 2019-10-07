package com.whitebox.pages;

import org.openqa.selenium.support.PageFactory;

import BaseTest.BrowserTest;

public class ResourcePage extends BrowserTest{


 public ResourcePage()
 {
 PageFactory.initElements(driver,this);	 
 
 }
 }