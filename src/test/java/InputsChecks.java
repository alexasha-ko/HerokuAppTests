import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InputsChecks {

    @Test
    public void fieldVerification() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");

        WebElement selectingUp = driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]"));
        selectingUp.sendKeys(Keys.ARROW_UP);
        selectingUp.sendKeys(Keys.ARROW_UP);

        driver.navigate().refresh();

        WebElement selectingDown = driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]"));

        selectingDown.sendKeys(Keys.ARROW_DOWN);
        selectingDown.sendKeys(Keys.ARROW_DOWN);
        selectingDown.sendKeys(Keys.ARROW_DOWN);

        driver.quit();
    }
    @Test
    public void wordValuesChecks() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");

        driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]")).sendKeys("aa");
        driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]")).sendKeys("$#^&*");

        driver.quit();
    }
}
