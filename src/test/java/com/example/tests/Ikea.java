/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author USER-4W55N52
 */
public class Ikea {
    private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
    
    public Ikea() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        baseUrl = "https://www.katalon.com/";
     System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
        driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testIkea() throws Exception {
    driver.get("https://www.ikea.com/");
    driver.findElement(By.linkText("Take me to IKEA United States")).click();
    driver.findElement(By.linkText("Log In/Sign Up")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hej! Log into your IKEA account.'])[1]/following::label[1]")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("silksona@hotmail.com");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::label[1]")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Password19");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Log In/Sign Up'])[1]/following::div[6]")).click();
    driver.findElement(By.linkText("Cooking")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(118)'])[1]/following::a[2]")).click();
    driver.findElement(By.id("imgThmbProduct6")).click();
    driver.findElement(By.cssSelector("svg.icon-component__icon.svg-icon")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Click here.'])[1]/following::img[3]")).click();
    driver.findElement(By.id("storesList")).click();
    new Select(driver.findElement(By.id("storesList"))).selectByVisibleText("IL, IKEA Schaumburg");
    driver.findElement(By.id("storesList")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='- Select a store -'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Continue'])[2]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Return to your shopping cart'])[1]/following::a[1]")).click();
    driver.findElement(By.id("invoiceAddress-street")).click();
    driver.findElement(By.id("invoiceAddress-street")).clear();
    driver.findElement(By.id("invoiceAddress-street")).sendKeys("2065 colchester avenue");
    driver.findElement(By.name("basket")).submit();
    driver.findElement(By.id("invoiceAddress-street")).clear();
    driver.findElement(By.id("invoiceAddress-street")).sendKeys("2065 Colchester Avenue");
    driver.findElement(By.id("invoiceAddress-city")).clear();
    driver.findElement(By.id("invoiceAddress-city")).sendKeys("Hoffman Estates");
    driver.findElement(By.id("invoiceAddress-zip")).clear();
    driver.findElement(By.id("invoiceAddress-zip")).sendKeys("60192");
    new Select(driver.findElement(By.id("invoiceAddress-province"))).selectByVisibleText("Illinois");
    driver.findElement(By.id("invoiceAddress-emailRepetition")).clear();
    driver.findElement(By.id("invoiceAddress-emailRepetition")).sendKeys("silksona@hotmail.com");
    driver.findElement(By.id("invoiceAddress-phoneNumbers.home")).clear();
    driver.findElement(By.id("invoiceAddress-phoneNumbers.home")).sendKeys("8475316261");
    driver.findElement(By.id("addressFormDisclaimerCheckbox")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Return to previous step'])[1]/following::input[1]")).click();
    }
}
