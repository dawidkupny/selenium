import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    private static WebDriver driver;

    @Before
    public void init() throws Exception {
        driver = setMandatoryValues();
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void caseOne() {
        driver.manage().window().maximize();
        prepareDataOne(driver);
        acceptPopups(driver);
        assertEquals("Andrzej Tobor zostal zakwalifikowany do kategorii Dorosly",
                driver.findElement(By.id("returnSt")).getText());
    }

    @Test
    public void caseTwo() {
        driver.manage().window().maximize();
        prepareDataTwo(driver);
        acceptPopups(driver);
        assertEquals("Dawid Szczepanski zostal zakwalifikowany do kategorii Blad danych",
                driver.findElement(By.id("returnSt")).getText());
    }

    @Test
    public void caseThree() {
        driver.manage().window().maximize();
        prepareDataThree(driver);
        acceptPopups(driver);
        assertEquals("Milena Kukiz zostal zakwalifikowany do kategorii Senior",
                driver.findElement(By.id("returnSt")).getText());
    }

    @Test
    public void caseFour() {
        driver.manage().window().maximize();
        prepareDataFour(driver);
        acceptPopups(driver);
        assertEquals("Zbigniew Cien zostal zakwalifikowany do kategorii Blad danych",
                driver.findElement(By.id("returnSt")).getText());
    }

    @Test
    public void caseFive() {
        driver.manage().window().maximize();
        prepareDataFive(driver);
        acceptPopups(driver);
        assertEquals("Marzena Tudrej zostal zakwalifikowany do kategorii Blad danych",
                driver.findElement(By.id("returnSt")).getText());
    }

    @Test
    public void caseSix() {
        driver.manage().window().maximize();
        prepateDataSix(driver);
        acceptPopups(driver);
        assertEquals("Kamil Rafalski zostal zakwalifikowany do kategorii Dorosly",
                driver.findElement(By.id("returnSt")).getText());
    }

    private static WebDriver setMandatoryValues() {
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:/Drivers/geckodriver.exe");
        return driver;
    }

    private static void prepareDataOne(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Andrzej");
        driver.findElement(By.id("inputPassword3")).sendKeys("Tobor");
        driver.findElement(By.id("dataU")).sendKeys("03-03-1999");
        driver.findElement(By.className("btn-default")).click();
    }

    private static void prepareDataTwo(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Dawid");
        driver.findElement(By.id("inputPassword3")).sendKeys("Szczepanski");
        driver.findElement(By.id("dataU")).sendKeys("17-08-2007");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.className("btn-default")).click();
    }

    private static void prepareDataThree(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Milena");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kukiz");
        driver.findElement(By.id("dataU")).sendKeys("02-07-1950");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.className("btn-default")).click();
    }

    private static void prepareDataFour(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Zbigniew");
        driver.findElement(By.id("inputPassword3")).sendKeys("Cien");
        driver.findElement(By.id("dataU")).sendKeys("10-09-2008");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.className("btn-default")).click();
    }

    private static void prepareDataFive(WebDriver driver) {
        driver.findElement(By.id("inputEmail3")).sendKeys("Marzena");
        driver.findElement(By.id("inputPassword3")).sendKeys("Tudrej");
        driver.findElement(By.id("dataU")).sendKeys("20-02-2003");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.className("btn-default")).click();
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
