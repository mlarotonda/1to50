package project;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test extends config {
    WebElement element [] = new WebElement[26];
    String templateElemento = "//div[@id='grid']/div[text()='%d']";
    String resultado = "//div[@class='resultContent']/strong[@class='level']";
    int i;

    @Test
    public void test(){
        encontrarPrimeros25Elementos();
        clickPrimeros25Elementos();
        clickUltimos25Elementos();
        System.out.println("Tiempo final: " + driver.findElement(By.xpath(resultado)).getText());

        espera(2);
        driver.quit();
    }

    private void encontrarPrimeros25Elementos(){
        for (i=1; i<26;i++) {
            element[i] =driver.findElement(By.xpath(String.format(templateElemento,i)));
        }
        espera(1);
    }

    private void clickPrimeros25Elementos(){
        for (i=1; i<26;i++) { element[i].click(); }
    }

    private void clickUltimos25Elementos(){
        for (i=26; i<51;i++) {
            driver.findElement(By.xpath(String.format(templateElemento,i))).click();
        }
    }
}
