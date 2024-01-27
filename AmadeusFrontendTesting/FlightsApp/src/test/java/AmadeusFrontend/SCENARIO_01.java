package AmadeusFrontend;

import Utilities.TestBaseBeforeAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SCENARIO_01 extends TestBaseBeforeAfter
{
    //Search
    //“From” ve “To” input alanlarında aynı değerin girilemediğini test et.
    //⚠️ App’te bu alanların aynı girilebildiğini göreceksin.
    // Yani bu test hata alıyor olmalı. Tebrikler, bir bug tespit ettin.

    //TÜM AYNI ÜLKE SEÇİMLERİNİ BU SINIFTA YAPTIM

    @Test

    public void sameCountrySelection() throws InterruptedException {

        //ISTANBUL
        Thread.sleep(2000);
        WebElement search1 = driver.findElement(By.xpath("//*[@id='headlessui-combobox-input-:Rq9lla:']"));

        search1.sendKeys("Istanbul");
        WebElement option = driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option.click();


        WebElement search2 = driver.findElement(By.xpath("//*[@id='headlessui-combobox-input-:Rqhlla:']"));
        search2.sendKeys("Istanbul");
        WebElement option2= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option2.click();

        //Assert.assertNotEquals(option,option2);

        //NEW YORK

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("New York");
        WebElement option3 = driver.findElement(By.xpath("//*[text()='New York']"));
        option3.click();

        search2.clear();
        search2.sendKeys("New york");
        WebElement option4= driver.findElement(By.xpath("//*[text()='New York']"));
        option4.click();
        System.out.println("option3 : "+option3);

        //Assert.assertNotEquals(option3,option4);

        //London

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("London");
        WebElement option6 = driver.findElement(By.xpath("//*[text()='London']"));
        option6.click();

        search2.clear();
        search2.sendKeys("London");
        WebElement option7= driver.findElement(By.xpath("//*[text()='London']"));
        option7.click();

        //Assert.assertNotEquals(option6,option7);

        //Paris

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Paris");
        WebElement option8 = driver.findElement(By.xpath("//*[text()='Paris']"));
        option8.click();

        search2.clear();
        search2.sendKeys("Paris");
        WebElement option9= driver.findElement(By.xpath("//*[text()='Paris']"));
        option9.click();

        //Assert.assertNotEquals(option8,option9);

        //Tokyo

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Tokyo");
        WebElement option10 = driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option10.click();

        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option11= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option11.click();

        //Assert.assertNotEquals(option10,option11);


        //Sydney

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Sydney");
        WebElement option12 = driver.findElement(By.xpath("//*[text()='Sydney']"));
        option12.click();

        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option13= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option13.click();

        //Assert.assertNotEquals(option12,option13);

        //London

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("London");
        WebElement option14 = driver.findElement(By.xpath("//*[text()='London']"));
        option14.click();

        search2.clear();
        search2.sendKeys("London");
        WebElement option15= driver.findElement(By.xpath("//*[text()='London']"));
        option15.click();

        //Assert.assertNotEquals(option14,option15);

        //Los Angeles

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Los Angeles");
        WebElement option16 = driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option16.click();

        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option17= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option17.click();

        //Assert.assertNotEquals(option16,option17);

        //Chicago

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Chicago");
        WebElement option18 = driver.findElement(By.xpath("//*[text()='Chicago']"));
        option18.click();

        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option19= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option19.click();

        //Assert.assertNotEquals(option18,option19);

        //Beijing

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Beijing");
        WebElement option20 = driver.findElement(By.xpath("//*[text()='Beijing']"));
        option20.click();

        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option21= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option21.click();

        //Assert.assertNotEquals(option20,option21);

        //Dubai

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Dubai");
        WebElement option22 = driver.findElement(By.xpath("//*[text()='Dubai']"));
        option22.click();

        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option23= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option23.click();
        //Assert.assertNotEquals(option22,option23);


        //Singapore

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Singapore");
        WebElement option25 = driver.findElement(By.xpath("//*[text()='Singapore']"));
        option25.click();

        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option26= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option26.click();

        //Assert.assertNotEquals(option25,option26);


        //Hong Kong

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Hong Kong");
        WebElement option27 = driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option27.click();

        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option28= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option28.click();



        //Frankfurt

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Frankfurt");
        WebElement option29 = driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option29.click();

        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option30= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option30.click();


        //Madrid

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Madrid");
        WebElement option31 = driver.findElement(By.xpath("//*[text()='Madrid']"));
        option31.click();

        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option32= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option32.click();


        //Rome

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Rome");
        WebElement option33 = driver.findElement(By.xpath("//*[text()='Rome']"));
        option33.click();

        search2.clear();
        search2.sendKeys("Rome");
        WebElement option34= driver.findElement(By.xpath("//*[text()='Rome']"));
        option34.click();
















    }

}
