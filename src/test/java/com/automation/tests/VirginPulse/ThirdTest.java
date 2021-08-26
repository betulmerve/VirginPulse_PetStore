package com.automation.tests.VirginPulse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SecondTest {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://petstore.swagger.io/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        //how to collect all links from the page?
        List<WebElement> links=driver.findElements(By.className("arrow"));

//        for (WebElement link:links) {
//            System.out.println(link.getText());
//            System.out.println(link.getAttribute("href"));
//            System.out.println();
//
//        }

        //i am starting one because i want to skip the first one, it is home page link
        for (int i = 1; i <links.size() ; i++) {
            links.get(i).click();
            Thread.sleep(1000);
            links.get(i).click();
            Thread.sleep(1000);
            //Thread.sleep(2000);
            //driver.navigate().back();
            //Thread.sleep(2000);
            //refresh list
            links=driver.findElements(By.className("arrow"));
        }

        driver.quit();

    }

}

