package Viddeo2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrivernavigateMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1- driver.navigate().to("url") -->istenen sayfaya gider ama forward ve back yapilmasina imkan tanir
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        // 2- driver.navigate().back(); --> bir önceki sayfaya geri dönüs yapar
        driver.navigate().back(); // ornegimizde amazona geri dönüs yapacaktir

        // driver.navigate().forwart(); --> faceboka gider
        driver.navigate().forward();

        // driver.navigate().refresh --> icinde oldugu sayfayi yeniler
        driver.navigate().refresh();

        // driver.close icinde olunan sayfayi kapatir
        driver.close();

        // driver.quit  acilan bütün tablari kapatir
       // driver.quit();

    }
}
