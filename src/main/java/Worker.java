import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by kondratiuk on 23.01.2017.
 */
public class Worker {
//    private WebDriver googleDriver;

    public Worker(){
        goToRozetka(new FirefoxDriver());
    }

    private void goToRozetka(WebDriver chromeDriver){
        System.out.print("+++++");
        chromeDriver.get("http://www.google.com");
        System.out.print("+++++");
    }

}
