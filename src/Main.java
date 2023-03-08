import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/codewitharjun/Downloads/chromedriver_mac_arm64/chromedriver");
        driver= new ChromeDriver();
        driver.get("https://www.youtube.com");
    }
    public static void main(String[] args) {

        Main obj=new Main();
        obj.launchBrowser();
    }
}