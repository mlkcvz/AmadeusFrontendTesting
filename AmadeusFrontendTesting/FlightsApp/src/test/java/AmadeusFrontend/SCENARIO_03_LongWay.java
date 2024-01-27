package AmadeusFrontend;

import Utilities.TestBaseBeforeAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SCENARIO_03_LongWay extends TestBaseBeforeAfter
{
    //⚠️Her şehir arasında uçuş olmadığı için bazı sorgulardan cevap dönmeyecektir.
    // İpucu: “From: Istanbul”, “To: Los Angeles” seçtiğinde iki adet uçuş listelendiğini görmelisin.
    //FoundXItems yazısındaki X sayısı ile listelenen uçuş sayısı aynı mı

    //İLK FONKSİYONDA ARASINDA UÇUŞ OLMAYAN ÜLKELERİ SEÇİYORUM
    //İLK FONKSİYONDA ÜLKELER ARASINDA UÇUŞ BULUNMADIĞININ DOĞRULAMASINI DA YAPIYORUM
    // (ISTANBUL-ISTANBUL GİBİ AYNI ÜLKELER HARİÇ, SCENARIO_01'DE YAPMIŞTIM.)
    //İKİNCİ FONKSİYONDA ARASINDA UÇUŞ OLAN ÜLKELERİ SEÇİYORUM
    //İKİNCİ FONKSİYONDA FoundXItems yazısındaki X sayısı ile
    // listelenen uçuş sayısı aynı mı KONTROLÜNÜ DE YAPIYORUM

    @Test
    public void citiesWithNOFlightsBetween() throws InterruptedException
    {
        //ARASINDA UÇUŞ BULUNMAYANLAR!!!!

        //ISTANBUL-New York
        Thread.sleep(2000);
        WebElement search1 = driver.findElement(By.xpath("//*[@id='headlessui-combobox-input-:Rq9lla:']"));


        search1.sendKeys("Istanbul");
        WebElement option = driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option.click();

        WebElement search2 = driver.findElement(By.xpath("//*[@id='headlessui-combobox-input-:Rqhlla:']"));
        search2.sendKeys("New York");
        WebElement option2= driver.findElement(By.xpath("//*[text()='New York']"));
        option2.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept.isDisplayed());

        //ISTANBUL-London

        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option4= driver.findElement(By.xpath("//*[text()='London']"));
        option4.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept2 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept2.isDisplayed());

        //ISTANBUL-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option5= driver.findElement(By.xpath("//*[text()='Paris']"));
        option5.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept3 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept3.isDisplayed());

        //ISTANBUL-Tokyo

        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option6= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option6.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept4 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept4.isDisplayed());

        //ISTANBUL-Sydney

        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option7= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option7.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept5 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept5.isDisplayed());

        //ISTANBUL-Chicago

        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option8= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option8.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept6 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept6.isDisplayed());

        //ISTANBUL-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option9= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option9.click();
        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept7 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept7.isDisplayed());

        //ISTANBUL-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option10= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option10.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept8 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept8.isDisplayed());

        //ISTANBUL-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option11= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option11.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept9 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept9.isDisplayed());

        //New York-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("New York");
        WebElement option12= driver.findElement(By.xpath("//*[text()='New York']"));
        option12.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option13= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option13.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept10 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept10.isDisplayed());


        //New York-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option14= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option14.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept11 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept11.isDisplayed());

        //New York-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option15= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option15.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept12 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept12.isDisplayed());

        //New York-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option16= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option16.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept13 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept13.isDisplayed());

        //New York-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option17= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option17.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept14 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept14.isDisplayed());

        //New York-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option18= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option18.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept15 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept15.isDisplayed());

        //New York-Singapore
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option19= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option19.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept16 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept16.isDisplayed());

        //New York-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option20= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option20.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept17 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept17.isDisplayed());

        //New York-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option21= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option21.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept18 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept18.isDisplayed());

        //New York-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option22= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option22.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept19 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept19.isDisplayed());

        //New York-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option23= driver.findElement(By.xpath("//*[text()='Rome']"));
        option23.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept20 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept20.isDisplayed());

        //London-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("London");
        WebElement option24 = driver.findElement(By.xpath("//*[text()='London']"));
        option24.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option25= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option25.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept21 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept21.isDisplayed());

        //London-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option26= driver.findElement(By.xpath("//*[text()='New York']"));
        option26.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept22 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept22.isDisplayed());

        //London-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option27= driver.findElement(By.xpath("//*[text()='Paris']"));
        option27.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept23 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept23.isDisplayed());

        //London-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option28= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option28.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept24 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept24.isDisplayed());

        //London-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option29= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option29.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept25 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept25.isDisplayed());

        //London-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option30= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option30.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept26 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept26.isDisplayed());

        //London-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option31= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option31.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept27 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept27.isDisplayed());

        //London-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option32= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option32.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept28 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept28.isDisplayed());

        //London-Singapore
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option33= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option33.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept30 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept30.isDisplayed());

        //London-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option34= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option34.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept31 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept31.isDisplayed());

        //London-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option35= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option35.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept32 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept32.isDisplayed());

        //London- Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option36= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option36.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept33 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept33.isDisplayed());

        //Paris-New York
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Paris");
        WebElement option37= driver.findElement(By.xpath("//*[text()='Paris']"));
        option37.click();
        search2.clear();
        search2.sendKeys("New York");
        WebElement option38= driver.findElement(By.xpath("//*[text()='New York']"));
        option38.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept34 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept34.isDisplayed());

        //Paris-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option39= driver.findElement(By.xpath("//*[text()='London']"));
        option39.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept35 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept35.isDisplayed());


        //Paris-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option40= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option40.click();
        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept36 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept36.isDisplayed());

        //Paris-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option41= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option41.click();
        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept37 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept37.isDisplayed());

        //Paris-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option42= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option42.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept38 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept38.isDisplayed());

        //Paris-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option43= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option43.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept39 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept39.isDisplayed());

        //Paris-Singapore
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option44= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option44.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept40 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept40.isDisplayed());

        //Paris-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option45= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option45.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept41 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept41.isDisplayed());

        //Paris-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option46= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option46.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept42 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept42.isDisplayed());

        //Paris-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option47= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option47.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept43 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept43.isDisplayed());

        //Paris-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option48= driver.findElement(By.xpath("//*[text()='Rome']"));
        option48.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept44 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept44.isDisplayed());

        //Tokyo-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Tokyo");
        WebElement option49= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option49.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option50= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option50.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept45 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept45.isDisplayed());

        //Tokyo-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option51= driver.findElement(By.xpath("//*[text()='London']"));
        option51.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept46 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept46.isDisplayed());

        //Tokyo-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option52= driver.findElement(By.xpath("//*[text()='Paris']"));
        option52.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept47 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept47.isDisplayed());

        //Tokyo-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option53= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option53.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept48 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept48.isDisplayed());

        //Tokyo-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option54= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option54.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept49 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept49.isDisplayed());

        //Tokyo-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option55= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option55.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept50 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept50.isDisplayed());

        //Tokyo-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option56= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option56.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept51 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept51.isDisplayed());

        //Tokyo-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option57= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option57.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept52 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept52.isDisplayed());

        //Tokyo-Singapore
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option58= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option58.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept53 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept53.isDisplayed());

        //Tokyo-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option59= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option59.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept54 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept54.isDisplayed());

        //Tokyo-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option60= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option60.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept55 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept55.isDisplayed());

        //Tokyo-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option61= driver.findElement(By.xpath("//*[text()='Rome']"));
        option61.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept56 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept56.isDisplayed());

        //Sydney-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Sydney");
        WebElement option62= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option62.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option63= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option63.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept57 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept57.isDisplayed());

        //Sydney-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option64= driver.findElement(By.xpath("//*[text()='New York']"));
        option64.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept58 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept58.isDisplayed());

        //Sydney-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option65= driver.findElement(By.xpath("//*[text()='London']"));
        option65.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept59 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept59.isDisplayed());

        //Sydney-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option66= driver.findElement(By.xpath("//*[text()='Paris']"));
        option66.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept60 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept60.isDisplayed());

        //Sydney-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option67= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option67.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept61 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept61.isDisplayed());


        //Sydney-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option68= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option68.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept62 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept62.isDisplayed());

        //Sydney-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option69= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option69.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept63 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept63.isDisplayed());

        //Sydney-Singapore
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option70= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option70.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept64 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept64.isDisplayed());

        //Sydney-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option71= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option71.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept65 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept65.isDisplayed());

        //Sydney-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option72= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option72.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept66 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept66.isDisplayed());

        //Sydney-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option73= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option73.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept67 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept67.isDisplayed());

        //Sydney-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option74= driver.findElement(By.xpath("//*[text()='Rome']"));
        option74.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept68 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept68.isDisplayed());

        //Los Angeles-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Los Angeles");
        WebElement option75= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option75.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option76= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option76.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept69 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept69.isDisplayed());

        //Los Angeles-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option77= driver.findElement(By.xpath("//*[text()='New York']"));
        option77.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept70 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept70.isDisplayed());

        //Los Angeles-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option78= driver.findElement(By.xpath("//*[text()='Paris']"));
        option78.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept71 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept71.isDisplayed());

        //Los Angeles-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option79= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option79.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept72 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept72.isDisplayed());

        //Los Angeles-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option80= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option80.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept73 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept73.isDisplayed());

        //Los Angeles-Singapore
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option81= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option81.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept74 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept74.isDisplayed());

        //Los Angeles-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option82= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option82.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept75 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept75.isDisplayed());

        //Los Angeles-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option83= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option83.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept76 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept76.isDisplayed());

        //Los Angeles-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option84= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option84.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept77 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept77.isDisplayed());

        //Los Angeles-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option85= driver.findElement(By.xpath("//*[text()='Rome']"));
        option85.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept78 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept78.isDisplayed());

        //Chicago-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Chicago");
        WebElement option86= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option86.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option87= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option87.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept79 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept79.isDisplayed());

        //Chicago-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option88= driver.findElement(By.xpath("//*[text()='New York']"));
        option88.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept80 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept80.isDisplayed());

        //Chicago-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option89= driver.findElement(By.xpath("//*[text()='London']"));
        option89.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept81 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept81.isDisplayed());

        //Chicago-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option90= driver.findElement(By.xpath("//*[text()='Paris']"));
        option90.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept83 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept83.isDisplayed());

        //Chicago-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option91= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option91.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept82 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept82.isDisplayed());

        //Chicago-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option92= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option92.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept84 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept84.isDisplayed());

        //Chicago-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option93= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option93.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept85 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept85.isDisplayed());

        //Chicago-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option94= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option94.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept86 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept86.isDisplayed());

        //Chicago-Singapore
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option95= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option95.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept87 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept87.isDisplayed());

        //Chicago-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option96= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option96.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept88 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept88.isDisplayed());

        //Chicago-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option97= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option97.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept89 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept89.isDisplayed());

        //Chicago-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option98= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option98.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept90 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept90.isDisplayed());

        //Chicago-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option99= driver.findElement(By.xpath("//*[text()='Rome']"));
        option99.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept91 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept91.isDisplayed());




        //Beijing-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Beijing");
        WebElement option200= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option200.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option201= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option201.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept92 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept92.isDisplayed());

        //Beijing-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option101= driver.findElement(By.xpath("//*[text()='New York']"));
        option101.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept93 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept93.isDisplayed());

        //Beijing-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option102= driver.findElement(By.xpath("//*[text()='London']"));
        option102.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept94 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept94.isDisplayed());

        //Beijing-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option103= driver.findElement(By.xpath("//*[text()='Paris']"));
        option103.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept95 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept95.isDisplayed());

        //Beijing-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option104= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option104.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept96 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept96.isDisplayed());

        //Beijing-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option105= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option105.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept97 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept97.isDisplayed());

        //Beijing-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option107= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option107.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept98 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept98.isDisplayed());

        //Beijing-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option108= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option108.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept99 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept99.isDisplayed());

        //Beijing-Singapore
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option109= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option109.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept100= driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept100.isDisplayed());

        //Beijing-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option110= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option110.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept101 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept101.isDisplayed());

        //Beijing-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option111= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option111.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept102 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept102.isDisplayed());

        //Beijing-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option112= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option112.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept103 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept103.isDisplayed());

        //Beijing-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option113= driver.findElement(By.xpath("//*[text()='Rome']"));
        option113.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept104 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept104.isDisplayed());

        //Dubai-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Dubai");
        WebElement option114= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option114.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option115= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option115.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept105 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept105.isDisplayed());

        //Dubai-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option116= driver.findElement(By.xpath("//*[text()='London']"));
        option116.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept106 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept106.isDisplayed());

        //Dubai-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option117= driver.findElement(By.xpath("//*[text()='New York']"));
        option117.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept107 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept107.isDisplayed());

        //Dubai-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option118= driver.findElement(By.xpath("//*[text()='Paris']"));
        option118.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept108 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept108.isDisplayed());

        //Dubai-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option119= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option119.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept109 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept109.isDisplayed());

        //Dubai-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option120= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option120.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept110 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept110.isDisplayed());

        //Dubai-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option121= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option121.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept111 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept111.isDisplayed());

        //Dubai-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option122= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option122.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept112 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept112.isDisplayed());

        //Dubai-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option123= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option123.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept113 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept113.isDisplayed());

        //Dubai-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option124= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option124.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept114= driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept114.isDisplayed());

        //Dubai-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option125= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option125.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept115 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept115.isDisplayed());

        //Dubai-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option126= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option126.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept116= driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept116.isDisplayed());

        //Dubai-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option127= driver.findElement(By.xpath("//*[text()='Rome']"));
        option127.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept117 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept117.isDisplayed());

        //Singapore-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Singapore");
        WebElement option202= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option202.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option203= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option203.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept118 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept118.isDisplayed());

        //Singapore-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option128= driver.findElement(By.xpath("//*[text()='New York']"));
        option128.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept119 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept119.isDisplayed());

        //Singapore-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option129= driver.findElement(By.xpath("//*[text()='London']"));
        option129.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept120 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept120.isDisplayed());

        //Singapore-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option130= driver.findElement(By.xpath("//*[text()='Paris']"));
        option130.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept121 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept121.isDisplayed());


        //Singapore-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option131= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option131.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept122 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept122.isDisplayed());

        //Singapore-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option132= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option132.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept123 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept123.isDisplayed());

        //Singapore-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option133= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option133.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept124 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept124.isDisplayed());

        //Singapore-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option134= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option134.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept125 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept125.isDisplayed());

        //Singapore-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option135= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option135.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept126 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept126.isDisplayed());

        //Singapore-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option136= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option136.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept127 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept127.isDisplayed());

        //Singapore-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option137= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option137.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept128= driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept128.isDisplayed());

        //Singapore-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option138= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option138.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept129 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept129.isDisplayed());

        //Singapore-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option139= driver.findElement(By.xpath("//*[text()='Rome']"));
        option139.click();



        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept130 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept130.isDisplayed());

        //Hong Kong-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Hong Kong");
        WebElement option205= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option205.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option206= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option206.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept131 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept131.isDisplayed());

        //Hong Kong-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option207= driver.findElement(By.xpath("//*[text()='New York']"));
        option207.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept132 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept132.isDisplayed());

        //Hong Kong-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option151= driver.findElement(By.xpath("//*[text()='London']"));
        option151.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept133 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept133.isDisplayed());

        //Hong Kong-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option152= driver.findElement(By.xpath("//*[text()='Paris']"));
        option152.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept134 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept134.isDisplayed());

        //Hong Kong-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option153= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option153.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept135 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept135.isDisplayed());

        //Hong Kong-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option154= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option154.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept136 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept136.isDisplayed());

        //Hong Kong-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option155= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option155.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept137 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept137.isDisplayed());

        //Hong Kong-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option156= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option156.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept138 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept138.isDisplayed());

        //Hong Kong-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option157= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option157.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept139 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept139.isDisplayed());

        //Hong Kong-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option158= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option158.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept140 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept140.isDisplayed());

        //Hong Kong-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option159= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option159.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept141 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept141.isDisplayed());

        //Hong Kong-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option160= driver.findElement(By.xpath("//*[text()='Rome']"));
        option160.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept142 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept142.isDisplayed());

        //Frankfurt-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Frankfurt");
        WebElement option161= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option161.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option162= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option162.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept143 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept143.isDisplayed());

        //Frankfurt-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option163= driver.findElement(By.xpath("//*[text()='New York']"));
        option163.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept144 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept144.isDisplayed());

        //Frankfurt-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option164= driver.findElement(By.xpath("//*[text()='London']"));
        option164.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept145 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept145.isDisplayed());

        //Frankfurt-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option165= driver.findElement(By.xpath("//*[text()='Paris']"));
        option165.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept146 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept146.isDisplayed());

        //Frankfurt-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option166= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option166.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept147= driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept147.isDisplayed());

        //Frankfurt-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option167= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option167.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept148 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept148.isDisplayed());

        //Frankfurt-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option168= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option168.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept149 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept149.isDisplayed());

        //Frankfurt-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option169= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option169.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept150 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept150.isDisplayed());

        //Frankfurt-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option170= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option170.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept151 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept151.isDisplayed());

        //Frankfurt-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option171= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option171.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept152 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept152.isDisplayed());

        //Frankfurt-Singapure
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option172= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option172.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept153 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept153.isDisplayed());

        //Frankfurt-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option173= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option173.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept154 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept154.isDisplayed());

        //Frankfurt-Rome
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option175 = driver.findElement(By.xpath("//*[text()='Rome']"));
        option175.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept155 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept155.isDisplayed());

        //Madrid-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Madrid");
        WebElement option400= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option400.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option208= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option208.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept156 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept156.isDisplayed());

        //Madrid-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New york");
        WebElement option210= driver.findElement(By.xpath("//*[text()='New York']"));
        option210.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept157 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept157.isDisplayed());

        //Madrid-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option211= driver.findElement(By.xpath("//*[text()='London']"));
        option211.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept158 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept158.isDisplayed());

        //Madrid-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option212= driver.findElement(By.xpath("//*[text()='Paris']"));
        option212.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept159 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept159.isDisplayed());

        //Madrid-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option213= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option213.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept160 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept160.isDisplayed());

        //Madrid-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option214= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option214.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept161 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept161.isDisplayed());

        //Madrid-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option215= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option215.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept162 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept162.isDisplayed());

        //Madrid-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option420= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option420.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept163 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept163.isDisplayed());

        //Madrid-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option421= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option421.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept164 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept164.isDisplayed());

        //Madrid-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option426= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option426.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept165 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept165.isDisplayed());

        //Madrid-Singapure
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option425= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option425.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept166 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept166.isDisplayed());

        //Madrid-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option430= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option430.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept167 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept167.isDisplayed());

        //Madrid-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option435= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option435.click();

        //ARASINDA UÇUŞ BULUNMADIĞINI DOĞRULUYORUM
        WebElement accept168 = driver.findElement(By.xpath("//*[@class='mt-24 max-w-5xl w-full justify-center items-center text-sm lg:flex']"));
        Assert.assertTrue(accept168.isDisplayed());

        //Rome-Istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Rome");
        WebElement option209= driver.findElement(By.xpath("//*[text()='Rome']"));
        option209.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option300= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option300.click();

        //Rome-New York
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("New York");
        WebElement option301= driver.findElement(By.xpath("//*[text()='New York']"));
        option301.click();

        //Rome-London
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("London");
        WebElement option250= driver.findElement(By.xpath("//*[text()='London']"));
        option250.click();

        //Rome-Paris
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Paris");
        WebElement option251= driver.findElement(By.xpath("//*[text()='Paris']"));
        option251.click();

        //Rome-Tokyo
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option252= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option252.click();

        //Rome-Sydney
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option253= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option253.click();

        //Rome-Los Angeles
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option254= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option254.click();

        //Rome-Chicago
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option255= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option255.click();

        //Rome-Beijing
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option256= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option256.click();

        //Rome-Dubai
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option257= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option257.click();

        //Rome-Singapore
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option258= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option258.click();

        //Rome-Hong Kong
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option260= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option260.click();

        //Rome-Frankfurt
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option261= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option261.click();

        //Rome-Madrid
        Thread.sleep(2000);
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option262= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option262.click();






    }


    @Test
    public void citiesWithFlightsBetween() throws InterruptedException {

        Thread.sleep(2000);
        WebElement search1 = driver.findElement(By.xpath("//*[@id='headlessui-combobox-input-:Rq9lla:']"));

        search1.sendKeys("Istanbul");
        WebElement option = driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option.click();




        WebElement search2 = driver.findElement(By.xpath("//*[@id='headlessui-combobox-input-:Rqhlla:']"));
        search2.sendKeys("Los Angeles");
        WebElement option2= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option2.click();

        System.out.println("//IST-LOS ANGELES ARASINDA UÇUŞ BULUNUYOR");

        WebElement actualresult = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText = actualresult.getText();

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        List<WebElement> items = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize= items.size();
        String s=String.valueOf(flightSize);
        Assert.assertTrue(actualText.contains(s));

        //IST-BEİJİNG
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option3= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option3.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//IST-BEİJİNG ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult2 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText2 = actualresult2.getText();
        List<WebElement> items2 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize2= items2.size();
        String text2=String.valueOf(flightSize2);
        Assert.assertTrue(actualText2.contains(text2));

        //IST-Singapore

        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option4= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option4.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//IST-Singapore ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult3 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText3 = actualresult3.getText();
        List<WebElement> items3 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize3= items3.size();
        String text3=String.valueOf(flightSize3);
        Assert.assertTrue(actualText3.contains(text3));

        //IST-MADRID
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("MADRID");
        WebElement option5= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option5.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//IST-MADRID ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult4 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText4 = actualresult4.getText();
        List<WebElement> items4 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize4= items4.size();
        String text4=String.valueOf(flightSize4);
        Assert.assertTrue(actualText4.contains(text4));

        //IST-ROME
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("ROME");
        WebElement option6= driver.findElement(By.xpath("//*[text()='Rome']"));
        option6.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//IST-ROME ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult5 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText5 = actualresult5.getText();
        List<WebElement> items5 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize5= items5.size();
        String text5=String.valueOf(flightSize5);
        Assert.assertTrue(actualText5.contains(text5));

        //New York-London
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("New York");
        WebElement option8 = driver.findElement(By.xpath("//*[text()='New York']"));
        option8.click();
        search2.clear();
        search2.sendKeys("London");
        WebElement option9= driver.findElement(By.xpath("//*[text()='London']"));
        option9.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//New York-London ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult6 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText6 = actualresult6.getText();
        List<WebElement> items6 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize6= items6.size();
        String text6=String.valueOf(flightSize6);
        Assert.assertTrue(actualText6.contains(text6));

        //NEW YORK-PARIS


        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Paris");
        WebElement option11= driver.findElement(By.xpath("//*[text()='Paris']"));
        option11.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//NEW YORK-PARIS ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult7 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText7 = actualresult7.getText();
        List<WebElement> items7 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize7= items7.size();
        String text7=String.valueOf(flightSize7);
        Assert.assertTrue(actualText7.contains(text7));

        //Newyork-Sydney
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option13= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option13.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Newyork-Sydney ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult8 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText8 = actualresult8.getText();
        List<WebElement> items8 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize8 = items8.size();
        String text8=String.valueOf(flightSize8);
        Assert.assertTrue(actualText8.contains(text8));

        //London-LosAngeles
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("London");
        WebElement option14 = driver.findElement(By.xpath("//*[text()='London']"));
        option14.click();
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option15= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option15.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//London-LosAngeles ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult9 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText9 = actualresult9.getText();
        List<WebElement> items9 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize9= items9.size();
        String text9=String.valueOf(flightSize9);
        Assert.assertTrue(actualText9.contains(text9));

        //London-Rome

        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Rome");
        WebElement option16= driver.findElement(By.xpath("//*[text()='Rome']"));
        option16.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//London-Rome ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult10 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText10 = actualresult10.getText();
        List<WebElement> items10 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize10= items10.size();
        String text10=String.valueOf(flightSize10);
        Assert.assertTrue(actualText10.contains(text10));

        //Paris-istanbul
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Paris");
        WebElement option17 = driver.findElement(By.xpath("//*[text()='Paris']"));
        option17.click();
        search2.clear();
        search2.sendKeys("Istanbul");
        WebElement option18= driver.findElement(By.xpath("//*[text()='Istanbul']"));
        option18.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Paris-istanbul ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult11 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText11 = actualresult11.getText();
        List<WebElement> items11 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize11= items11.size();
        String text11=String.valueOf(flightSize11);
        Assert.assertTrue(actualText11.contains(text11));

        //Paris-Tokyo

        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Tokyo");
        WebElement option19= driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option19.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Paris-Tokyo ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult12 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText12 = actualresult12.getText();
        List<WebElement> items12 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize12= items12.size();
        String text12=String.valueOf(flightSize12);
        Assert.assertTrue(actualText12.contains(text12));

        //Paris-Dubai
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option21= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option21.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Paris-Dubai ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult13 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText13 = actualresult13.getText();
        List<WebElement> items13 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize13= items13.size();
        String text13=String.valueOf(flightSize13);
        Assert.assertTrue(actualText13.contains(text13));

        //Tokyo-New York

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Tokyo");
        WebElement option22 = driver.findElement(By.xpath("//*[text()='Tokyo']"));
        option22.click();
        search2.clear();
        search2.sendKeys("New York");
        WebElement option23= driver.findElement(By.xpath("//*[text()='New York']"));
        option23.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Tokyo-New York ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult14 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText14 = actualresult14.getText();
        List<WebElement> items14 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize14= items14.size();
        String text14=String.valueOf(flightSize14);
        Assert.assertTrue(actualText14.contains(text14));

        //Tokyo-Madrid
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option25= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option25.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Tokyo-Madrid ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult15 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText15 = actualresult15.getText();
        List<WebElement> items15 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize15= items15.size();
        String text15=String.valueOf(flightSize15);
        Assert.assertTrue(actualText15.contains(text15));

        //Sydney-Los Angeles

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Sydney");
        WebElement option26 = driver.findElement(By.xpath("//*[text()='Sydney']"));
        option26.click();
        search2.clear();
        search2.sendKeys("Los Angeles");
        WebElement option27= driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option27.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Sydney-Los Angeles ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult16 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText16 = actualresult16.getText();
        List<WebElement> items16 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize16= items16.size();
        String text16=String.valueOf(flightSize16);
        Assert.assertTrue(actualText16.contains(text16));

        //Sdyney-Chicago
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option28= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option28.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Sdyney-Chicago ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult17 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText17 = actualresult17.getText();
        List<WebElement> items17 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize17 = items17.size();
        String text17=String.valueOf(flightSize17);
        Assert.assertTrue(actualText17.contains(text17));

        //Los Angeles-London
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Los Angeles");
        WebElement option29 = driver.findElement(By.xpath("//*[text()='Los Angeles']"));
        option29.click();
        search2.clear();
        search2.sendKeys("London");
        WebElement option30= driver.findElement(By.xpath("//*[text()='London']"));
        option30.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Los Angeles-London ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult18 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText18 = actualresult18.getText();
        List<WebElement> items18 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize18= items18.size();
        String text18=String.valueOf(flightSize18);
        Assert.assertTrue(actualText18.contains(text18));


        //Los Angeles-Sydney
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Sydney");
        WebElement option31= driver.findElement(By.xpath("//*[text()='Sydney']"));
        option31.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Los Angeles-Sydney ARASINDA UÇUŞ BULUNUYOR");


        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult20 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText20 = actualresult20.getText();
        List<WebElement> items20 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize20= items20.size();
        String text20=String.valueOf(flightSize20);
        Assert.assertTrue(actualText20.contains(text20));

        //Los Angeles-Chicago
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Chicago");
        WebElement option32= driver.findElement(By.xpath("//*[text()='Chicago']"));
        option32.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Los Angeles-Chicago ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult21 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText21 = actualresult21.getText();
        List<WebElement> items21 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize21 = items21.size();
        String text21 =String.valueOf(flightSize21);
        Assert.assertTrue(actualText21.contains(text21));

        //Los Angeles-Dubai
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option33= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option33.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Los Angeles-Dubai ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult22 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText22 = actualresult22.getText();
        List<WebElement> items22 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize22 = items22.size();
        String text22 =String.valueOf(flightSize22);
        Assert.assertTrue(actualText22.contains(text22));

        //Chicago-Beijing
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Chicago");
        WebElement option34 = driver.findElement(By.xpath("//*[text()='Chicago']"));
        option34.click();
        search2.clear();
        search2.sendKeys("Beijing");
        WebElement option35= driver.findElement(By.xpath("//*[text()='Beijing']"));
        option35.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Chicago-Beijing ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult23 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText23 = actualresult23.getText();
        List<WebElement> items23 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize23= items23.size();
        String text23=String.valueOf(flightSize23);
        Assert.assertTrue(actualText23.contains(text23));

        //Chicago-Hong Kong
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Hong Kong");
        WebElement option36= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option36.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Chicago-Hong Kong ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult24 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText24 = actualresult24.getText();
        List<WebElement> items24 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize24 = items24.size();
        String text24=String.valueOf(flightSize24);
        Assert.assertTrue(actualText24.contains(text24));

        //Beijing-Dubai
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Beijing");
        WebElement option37 = driver.findElement(By.xpath("//*[text()='Beijing']"));
        option37.click();
        search2.clear();
        search2.sendKeys("Dubai");
        WebElement option38= driver.findElement(By.xpath("//*[text()='Dubai']"));
        option38.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Beijing-Dubai ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult25 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText25 = actualresult25.getText();
        List<WebElement> items25 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize25 = items25.size();
        String text25 =String.valueOf(flightSize25);
        Assert.assertTrue(actualText25.contains(text25));

        //Dubai-Singapore

        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Dubai");
        WebElement option39 = driver.findElement(By.xpath("//*[text()='Dubai']"));
        option39.click();
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option40= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option40.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Dubai-Singapore ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult26 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText26 = actualresult26.getText();
        List<WebElement> items26 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize26= items26.size();
        String text26=String.valueOf(flightSize26);
        Assert.assertTrue(actualText26.contains(text26));

        //Singapore-Frankfurt
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Singapore");
        WebElement option41 = driver.findElement(By.xpath("//*[text()='Singapore']"));
        option41.click();
        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option42= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option42.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Singapore-Frankfurt ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult27 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText27 = actualresult27.getText();
        List<WebElement> items27 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize27= items27.size();
        String text27=String.valueOf(flightSize27);
        Assert.assertTrue(actualText27.contains(text27));

        //Hong Kong - Singapore
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Hong Kong");
        WebElement option43= driver.findElement(By.xpath("//*[text()='Hong Kong']"));
        option43.click();
        search2.clear();
        search2.sendKeys("Singapore");
        WebElement option44= driver.findElement(By.xpath("//*[text()='Singapore']"));
        option44.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Hong Kong - Singapore ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult28 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText28 = actualresult28.getText();
        List<WebElement> items28 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize28= items28.size();
        String text28=String.valueOf(flightSize28);
        Assert.assertTrue(actualText28.contains(text28));

        //Hong Kong - Frankfurt
        Thread.sleep(2000);

        search2.clear();
        search2.sendKeys("Frankfurt");
        WebElement option45= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option45.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Hong Kong - Frankfurt ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult29 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText29 = actualresult29.getText();
        List<WebElement> items29 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize29= items29.size();
        String text29=String.valueOf(flightSize29);
        Assert.assertTrue(actualText29.contains(text29));

        //Frankfurt-Madrid
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Frankfurt");
        WebElement option46= driver.findElement(By.xpath("//*[text()='Frankfurt']"));
        option46.click();
        search2.clear();
        search2.sendKeys("Madrid");
        WebElement option47= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option47.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Frankfurt-Madrid ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult30 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText30 = actualresult30.getText();
        List<WebElement> items30 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize30= items30.size();
        String text30=String.valueOf(flightSize30);
        Assert.assertTrue(actualText30.contains(text30));

        //Madrid-Rome
        Thread.sleep(2000);
        search1.clear();
        search1.sendKeys("Madrid");
        WebElement option48= driver.findElement(By.xpath("//*[text()='Madrid']"));
        option48.click();
        search2.clear();
        search2.sendKeys("Rome");
        WebElement option49= driver.findElement(By.xpath("//*[text()='Rome']"));
        option49.click();
        Assert.assertTrue(actualText.contains(s));
        System.out.println("//Madrid-Rome ARASINDA UÇUŞ BULUNUYOR");

        // X SAYISI İLE DÖNEN TOPLAM SONUÇ SAYISINI DOĞRULUYORUM
        WebElement actualresult31 = driver.findElement(By.xpath("//*[@class='mb-10']"));
        String actualText31 = actualresult31.getText();
        List<WebElement> items31 = driver.findElements(By.xpath("//*[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int flightSize31= items31.size();
        String text31=String.valueOf(flightSize31);
        Assert.assertTrue(actualText31.contains(text31));

    }


}
