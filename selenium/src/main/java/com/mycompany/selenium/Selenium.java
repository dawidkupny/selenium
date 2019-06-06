package com.mycompany.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

    public static void main(String[] args) {
        WebDriver driver = setMandatoryValues();
        caseOne(driver);
        caseTwo(driver);
        caseThree(driver);
        caseFour(driver);
        caseFive(driver);
        caseSix(driver);
        driver.quit();
    }

    private static WebDriver setMandatoryValues() {
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:/Drivers/geckodriver.exe");
        return driver;
    }

    private static void openPage(WebDriver driver) {
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
    }

    private static void caseOne(WebDriver driver) {
        openPage(driver);
        driver.manage().window().maximize();
        prepareDataOne(driver);
        acceptPopups(driver);
    }

    private static void prepareDataOne(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Andrzej");
        driver.findElement(By.id("inputPassword3")).sendKeys("Tobor");
        driver.findElement(By.id("dataU")).sendKeys("03-03-1999");
        driver.findElement(By.className("btn-default")).click();
    }

    private static void caseTwo(WebDriver driver) {
        openPage(driver);
        driver.manage().window().maximize();
        prepareDataTwo(driver);
        acceptPopups(driver);
    }

    private static void prepareDataTwo(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Dawid");
        driver.findElement(By.id("inputPassword3")).sendKeys("Szczepanski");
        driver.findElement(By.id("dataU")).sendKeys("17-08-2007");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.className("btn-default")).click();
    }

    private static void caseThree(WebDriver driver) {
        openPage(driver);
        driver.manage().window().maximize();
        prepareDataThree(driver);
        acceptPopups(driver);
    }

    private static void prepareDataThree(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Milena");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kukiz");
        driver.findElement(By.id("dataU")).sendKeys("02-07-1950");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.className("btn-default")).click();
    }

    private static void caseFour(WebDriver driver) {
        openPage(driver);
        driver.manage().window().maximize();
        prepareDataFour(driver);
        acceptPopups(driver);
    }

    private static void prepareDataFour(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Zbigniew");
        driver.findElement(By.id("inputPassword3")).sendKeys("Cien");
        driver.findElement(By.id("dataU")).sendKeys("10-09-2008");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.className("btn-default")).click();
    }

    private static void caseFive(WebDriver driver) {
        openPage(driver);
        driver.manage().window().maximize();
        prepareDataFive(driver);
        acceptPopups(driver);
    }

    private static void prepareDataFive(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Marzena");
        driver.findElement(By.id("inputPassword3")).sendKeys("Tudrej");
        driver.findElement(By.id("dataU")).sendKeys("20-02-2003");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.className("btn-default")).click();
    }

    private static void caseSix(WebDriver driver) {
        openPage(driver);
        driver.manage().window().maximize();
        prepateDataSix(driver);
        acceptPopups(driver);
    }

    private static void prepateDataSix(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Kamil");
        driver.findElement(By.id("inputPassword3")).sendKeys("Rafalski");
        driver.findElement(By.id("dataU")).sendKeys("28-06-1995");;
        driver.findElement(By.className("btn-default")).click();
    }

    private static void acceptPopups(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.accept();
    }
}
