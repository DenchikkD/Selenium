import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by kondratiuk on 23.01.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users/kondratiuk/Downloads/geckodriver-v0.13.0-win32/geckodriver.exe");
        System.out.println("Hello world");
//        new Worker();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://rozetka.com.ua/");
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//a[contains(@data-title, 'Телефоны')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//a[text()='Телефоны']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//a[text()='Смартфоны']")).click();
        Thread.sleep(5000);

        List<WebElement> list =driver.findElements(By.xpath(".//i[contains(@class, 'g-tag g-tag-icon-middle-action sprite')]"));
        List<WebElement> listDiv =driver.findElements(By.xpath(".//div[div[div[div[i[contains(@class, 'g-tag g-tag-icon-middle-action sprite')]]]]]"));
        System.out.println(list.get(0).getTagName());
        System.out.println(list.get(0).getText());
        System.out.println(listDiv.size());
        System.out.println(listDiv);
        System.out.println(listDiv.get(0).findElement(By.xpath(".//div[@class='g-i-tile-i-title clearfix']")).getText());
        System.out.println(listDiv.get(1).findElement(By.xpath("//div[@class='g-i-tile-i-title clearfix']")).getText());
//        System.out.println(listDiv.get(2).findElement(By.xpath("/div[@class='g-i-tile-i-title clearfix']")).getText());
        for (int i = 0; i <listDiv.size() ; i++) {
            Thread.sleep(100);
            System.out.println(listDiv.get(i).findElement(By.xpath(".//div[@class='g-i-tile-i-title clearfix']")).getText());
            System.out.println("+++");
        }
    }
}


