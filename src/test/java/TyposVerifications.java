import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TyposVerifications {

    @Test
    public void checkGrammar(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");

        driver.getPageSource().contains("Sometimes you'll see a typo, other times you won't.");

        driver.navigate().refresh();

        driver.getPageSource().contains("Sometimes you'll see a typo, other times you won't.");

        driver.quit();
    }
}
