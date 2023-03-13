package Viddeo2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagateMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         // 1- driver.manage().window() methodlari

        // 1.a- driver.manage().window().getSize() icinde oldugu sayfanin piksel olarak ölcülerini döndürür
        System.out.println(driver.manage().window().getSize()); //(1050,832) pixswl

        // 1.b- driver.manage().window().getPosition() --> icinde oldugu sayfanin pixel olarak konumunu döndürür
        System.out.println(driver.manage().window().getPosition());//  (10,10)

        // 1.c- driver.manage().window().setPosition(new Point(15,15))
        // icinde bulunulan sayfanin sol alt kösesini bizim tanimlayacagmiz pixel noktasina tasir
        driver.manage().window().setPosition(new Point(15,15));

        // 1.d- driver.manage().window().setSize(new Dimension(900,600));
        // icinde oldugu sayfani sol alt kösesini sabit olarak bizim yazacagimiz ölcülere getirir
        driver.manage().window().setSize(new Dimension(900,600));

        // konumu ve boyutu yeniledikten sonra tekrar yazdirirsak







    }
}
