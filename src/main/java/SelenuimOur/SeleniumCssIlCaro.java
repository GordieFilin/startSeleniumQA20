package SelenuimOur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumCssIlCaro {

    WebDriver driver;

    @Test
    public void test1(){
        driver = new ChromeDriver();
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement h2TextElement = driver.findElement(By.cssSelector("h2")); // h2 is tag name
        System.out.println(h2TextElement.getText());

        //   By.cssSelector("h2.subtitle")

        WebElement h2TextElementByClass = driver.findElement(By.cssSelector(".subtitle")); // by class value
        System.out.println(h2TextElementByClass.getText());

        WebElement h2TextElementByClassName = driver.findElement(By.className("subtitle")); // by class value
        System.out.println(h2TextElementByClassName.getText());

        WebElement h2ByClassAndTagTogether = driver.findElement(By.cssSelector("h2.subtitle"));

        WebElement inputCityById = driver.findElement(By.cssSelector("#city")); // by id value
        System.out.println(inputCityById.getAttribute("type"));

        WebElement inputCityByIdDirectly = driver.findElement(By.id("city")); // by id value
        System.out.println(inputCityByIdDirectly.getAttribute("type"));



        WebElement wildElemntAtribute = driver.findElement(By.cssSelector("[style='touch-action: none; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);']"));

        WebElement h2ByText = driver.findElement(By.linkText("Type your data and hit Yalla!"));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();

    }
}
