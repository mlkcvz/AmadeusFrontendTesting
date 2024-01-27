package AmadeusFrontend;

import Utilities.TestBaseBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SCENARIO_02_ShortCut extends TestBaseBeforeAfter
{
    //⚠️Her şehir arasında uçuş olmadığı için bazı sorgulardan cevap dönmeyecektir.
    // İpucu: “From: Istanbul”, “To: Los Angeles” seçtiğinde iki adet uçuş listelendiğini görmelisin.

    //BU CLASS'DA KISA YOLDAN FOR DÖNGÜSÜ İLE TIKLAMALAR YAPTIRACAKTIM , LİSTEYİ ALABİLDİM FAKAT
    //DEVAMINI GETİREMEDİM , O YÜZDEN UZUN YOLDAN YAPTIM(Sorunun Çözümü SCENARIO_03_LongWay'De!!!!!)

    public void visibleFirstSelect() {
        WebElement search1 = driver.findElement(By.xpath("//*[@id='headlessui-combobox-input-:Rq9lla:']"));
        search1.sendKeys("........");
        search1.sendKeys(Keys.BACK_SPACE);
        search1.sendKeys(Keys.BACK_SPACE);
        search1.sendKeys(Keys.BACK_SPACE);
        search1.sendKeys(Keys.BACK_SPACE);
        search1.sendKeys(Keys.BACK_SPACE);
        search1.sendKeys(Keys.BACK_SPACE);
        search1.sendKeys(Keys.BACK_SPACE);
        search1.sendKeys(Keys.BACK_SPACE);
    }

   public void visibleSecondSelect() {
        WebElement search2 = driver.findElement(By.xpath("//*[@id='headlessui-combobox-input-:Rqhlla:']"));
        search2.sendKeys("........");
        search2.sendKeys(Keys.BACK_SPACE);
        search2.sendKeys(Keys.BACK_SPACE);
        search2.sendKeys(Keys.BACK_SPACE);
        search2.sendKeys(Keys.BACK_SPACE);
        search2.sendKeys(Keys.BACK_SPACE);
        search2.sendKeys(Keys.BACK_SPACE);
        search2.sendKeys(Keys.BACK_SPACE);
        search2.sendKeys(Keys.BACK_SPACE);
    }



    @Test

    public void FirstCase() throws InterruptedException {

        Thread.sleep(2000);

      //  WebElement x = driver.findElement(By.xpath("//*[@id='headlessui-combobox-button-:R1ahlla:']"));
      //  x.click();
       /* List<WebElement> b = x.findElements(By.tagName("li"));
        String Itemtext=" ";
        for (int i = 0; i < b.size(); i++)
        {
            if (b.get(i).getText().equalsIgnoreCase(Itemtext))
            {
                b.get(i).click();
                break;
            }
            else{System.out.println("Item not fount in the list");}
        }*/


        Thread.sleep(2000);
        visibleFirstSelect();
        if(driver.findElement(By.xpath("(//*[@data-headlessui-state=\"open\"])[3]")).isDisplayed()) {
            List<WebElement> options = driver.findElements(By.xpath("//*[@id='headlessui-combobox-options-:r0:']/li"));
            System.out.println("Birinci selectbox seçenekleri sayısı:" + options.size());


            Thread.sleep(1000);


            String Itemtext = " ";
            for (int i = 0; i < options.size(); i++) {
                if (options.get(i).getText().equalsIgnoreCase(Itemtext)) {
                    options.get(i).click();

                    break;
                } else {
                    System.out.println("Item not fount in the list");
                }
            }

            visibleSecondSelect();
            List<WebElement> options2 = driver.findElements(By.xpath("//*[@id='headlessui-combobox-options-:r0:']/li"));
            System.out.println("İkinci selectbox seçenekleri sayısı:" + options2.size());
            Thread.sleep(1000);

            options.get(0).click();
            Thread.sleep(1000);
        }








    }
}
