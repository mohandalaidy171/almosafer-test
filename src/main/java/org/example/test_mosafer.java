package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.Random;


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
	public void Test_logIn() {


		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();


		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")));
		sel.selectByVisibleText("Ess");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		Select selena=new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")));
		selena.selectByVisibleText("Enabled");





		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div"));  // Replace with the correct locator
		dropdown.click();  // Open the dropdown
		WebElement option = driver.findElement(By.xpath("//div[text()='Option Text']"));  // Replace with the correct option
		option.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("barca");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("mohannad123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("1234mmmm@");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("1234mmmm@");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();


	}
    @Test()
    public void tes2() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();

        String arr_first[]= {"lina","Jamil","yara"};
        String arr_middle[]= {"fahid","lina","sami"};
        String arr_last[]= {"abd","talal","yara"};

        String arr_userName[]= {"mohannad123","jamil123","yara123"};
        String arr_password[]= {"454567nn","tbgf454","fdd45353"};

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        for(int i=0;i<arr_first.length;i++) {
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys(arr_first[i]);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys(arr_middle[i]);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys(arr_last[i]);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();

            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys(arr_userName[i]);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys(arr_password[i]);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys(arr_password[i]);

            WebElement b=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
            String s=b.getText();

            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            if(i<2) {
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
            }else {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(s);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();

                System.out.println("add succefuily  lina fahid abd");
                System.out.println("add succefuily   jamal lina talal");
                System.out.println("add succefuily    yara sami  yara");

            }

        }



        SoftAssert Ass=new SoftAssert();
        String Expect="lina fahid";

        WebElement act=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div"));
        String Auctual=act.getText();

        Ass.assertEquals(Auctual, Expect);

        Ass.assertAll();
        System.out.println(Auctual+"   add succes");
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



	@Test(invocationCount = 1,priority = 2)
	public void test_Language() {

		Random rand=new Random();

		int any=rand.nextInt(2);
		String [] arr= {"https://www.almosafer.com/en","https://www.almosafer.com/ar"};
		driver.get(arr[any]);

		SoftAssert ass=new SoftAssert();
		driver.get(arr[any]);

		String expect1="Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking";
		String expect2="المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران";
        String actual=driver.getTitle();
		if(any==0) {
			ass.assertEquals(actual, expect1);

		}
		else {
			ass.assertEquals(actual, expect2);
		}

		ass.assertAll();
	}

	@Test(invocationCount = 1,priority = 1)
	public void test_EN() {

	Random rand=new Random();

		int any=rand.nextInt(2);
		String [] arr= {"https://www.almosafer.com/en","https://www.almosafer.com/ar"};
		driver.get(arr[any]);

		SoftAssert ass=new SoftAssert();
		driver.get(arr[any]);

		String expect="SAR";
        WebElement actual=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
        String acuals=actual.getText();
		if(any==0&&any==1) {
			ass.assertEquals(acuals, expect);

		}
		System.out.println(acuals);

		ass.assertAll();






	}

	@Test(invocationCount = 1,priority = 3)
	public void iconQitaf() {



		SoftAssert ass=new SoftAssert();
		driver.get("https://www.almosafer.com/en");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement div = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]"));
		List<WebElement> logos=div.findElements(By.tagName("svg"));

		String arw=logos.get(0).getAttribute("data-testid");
		String expect="Footer__QitafLogo";
			ass.assertEquals(arw, expect);


		System.out.println(arw);

		ass.assertAll();



	        System.out.println(logos.size());


	}

	@Test(invocationCount = 1,priority = 3)
	public void iconQitaf2() {

		SoftAssert ass=new SoftAssert();

		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement div = driver.findElement(By.cssSelector("#__next > footer > div.sc-eopZyb.dngPsA > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > div.sc-fihHvN.eYrDjb > svg"));
		div.isDisplayed();
	String s=div.getAttribute("data-testid");

		ass.assertEquals(true, div.isDisplayed());
		ass.assertAll();
		System.out.println(s);





	}

}
