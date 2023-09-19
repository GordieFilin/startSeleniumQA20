package SelenuimOur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.List;

public class SeleniumXpathILcarro {
    WebDriver driver;
    @BeforeClass
    public void preconditions(){
        driver = new ChromeDriver();
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @Test
    public void test1Xpath(){
        System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
        driver.findElement((By.xpath("//*[text() = 'Find your car now!']")));
        driver.findElement((By.xpath("//*[contains(text(), 'now!')]")));

        driver.findElement(By.xpath("//input[@id='city']"));
        driver.findElement(By.xpath("//input[contains(@id,'ci')]"));



        List<WebElement> listinputs = driver.findElements(By.xpath("//input[@id]"));
        System.out.println(" length:" + listinputs.size());
        WebElement parentOfInput = driver.findElement(By.xpath("//input[@id='city']/.."));
        System.out.println("print attribute name: " +parentOfInput.getAttribute("class"));

        System.out.println(driver.findElement(By.xpath("//h1/following-sibling::h2")).getText());

    }

    @AfterClass
    public void postConditions(){
        driver.quit();
    }

}
