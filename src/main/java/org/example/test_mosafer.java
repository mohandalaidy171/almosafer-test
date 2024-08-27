package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class test_mosafer extends Main {

    @BeforeTest
    public void before_test(){
        Dimension dem=new Dimension(423,444);
        driver.get("https://www.almosafer.com/ar");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().maximize();
    }

    @Test()
    public void test1(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.cssSelector("body > div.js-modal-root > div > div.sc-bhlBdH.exRoue > div > div > div > button.sc-jTzLTM.eJkYKb.cta__button.cta__saudi.btn.btn-primary"));

        driver.findElement(By.cssSelector("body > div.js-modal-root > div > div.sc-bhlBdH.exRoue > div > div > div > button.sc-jTzLTM.eJkYKb.cta__button.cta__saudi.btn.btn-primary")).click();

        driver.findElement(By.cssSelector("#__next > header > div > div:nth-child(1) > div.sc-cJOK.kiafvr > div > a.sc-gkFcWv.hcOfTd")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-activities\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.cssSelector("#uncontrolled-tab-example-tab-activities > div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/a/h4")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[1]/div/div/div/div/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[1]/div/div/div/ul/li[3]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[2]/div/div/div/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[2]/div/div/div/ul/li[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[4]/div/div/div[1]/div/div/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[3]/div/input")).sendKeys("2 days");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[4]/div/div/div[1]/div/ul/li[3]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Mohannad mohammad");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[5]/div/input")).sendKeys("mohandalaidy2@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[6]/div/div[1]/input")).sendKeys("13443143314");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"success_message\"]/div[2]/div/div[7]/button")).click();


        SoftAssert ass=new SoftAssert() ;
        String Expected="Thank you for registering your interest.";
    WebElement act=    driver.findElement(By.xpath("//*[@id=\"test\"]/div[2]/div[2]/div/h3"));
        String Actual=act.getText();
        ass.assertEquals(Actual,Expected);
        ass.assertAll();
System.out.println(Actual);
    }
}
