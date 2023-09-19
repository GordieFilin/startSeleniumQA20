package SelenuimOur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsSeleniumStartPhonebook {
    WebDriver driver;

    @Test
    public void test1(){

        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement h1TextElement = driver.findElement(By.cssSelector("h1"));
        System.out.println(h1TextElement.getText());

        WebElement ElementByClassName = driver.findElement(By.className("active")); // by class value
        System.out.println(ElementByClassName.getText());

        WebElement ByIdDirectly = driver.findElement(By.id("root")); // by id value
        System.out.println(ByIdDirectly.getAttribute("type"));

        WebElement FindByName = driver.findElement(By.name("viewport"));

        WebElement byLinkTest = driver.findElement(By.linkText("HOME"));

        WebElement byTagName = driver.findElement(By.tagName("a"));

        WebElement FindByXpath = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[3]"));











        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
