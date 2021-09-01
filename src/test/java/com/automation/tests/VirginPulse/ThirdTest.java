package com.automation.tests.VirginPulse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ThirdTest {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://petstore.swagger.io/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        List<WebElement> arrows=driver.findElements(By.className("arrow"));


        for (int i = 1; i <arrows.size() ; i++) {

            if (arrows.get(i).isDisplayed() && arrows.get(i).isEnabled()) {
                WebDriverWait wait=new WebDriverWait(driver,10);
                WebElement element=wait.until(ExpectedConditions.elementToBeClickable(arrows.get(i)));
                element.click();
                Thread.sleep(1000);
                arrows.get(i).click();
                Thread.sleep(1000);
                //refresh list
                arrows=driver.findElements(By.className("arrow"));
            }

            else {
                System.out.println("Element is not clickable");
            }

        }

        driver.quit();

    }

}

