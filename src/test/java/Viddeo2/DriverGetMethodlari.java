package Viddeo2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverGetMethodlari {
    public static void main(String[] args) {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(ops);


        // 1- driver.get("url")--> yazdigimiz url ye gider

        driver.get("https://www.amazon.com");

        // 2- driver.getTitle() --> icinde oldugu sayfanin basligini bize getiri

        System.out.println("Sayfa title " + driver.getTitle());// Amazon.com Spend less. Smile more

        // 3- driver.getCurrentUrl() --> icinde oldugu sayfanin URL sini döndürür

        System.out.println(driver.getCurrentUrl()); // https//www.amazon.com/

        // 4- driver.getPageSource() -->icinde oldugu sayfanin kaynak kodlarini döndürür

        System.out.println("=======================================================");
        driver.getPageSource();// arka planda calisan sayfa kodlari
        System.out.println("===========================================================");


        // 5- driver.getWindowHandle() --> icinde oldugu sayfanin UNIQUE hash kodunu döndürür

        System.out.println(driver.getWindowHandle()); // CD Window-F4......

        // 6- driver.getWindowHandles acilan sekmelerinkinide döndürür
        System.out.println(driver.getWindowHandles());
    }
}
