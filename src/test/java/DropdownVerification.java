import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownVerification {

    @Test
    public void elementsPresence() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");

        driver.findElement(By.cssSelector("#dropdown > option:nth-child(2)"));
        driver.findElement(By.cssSelector("#dropdown > option:nth-child(3)"));

        driver.quit();
    }
    @Test
    public void selectingValues() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");

        driver.findElement(By.cssSelector("#dropdown > option:nth-child(2)")).click();
        boolean firstIsSelected = driver.findElement(By.cssSelector("#dropdown > option:nth-child(2)")).isSelected();
        Assert.assertTrue(firstIsSelected);

        driver.findElement(By.cssSelector("#dropdown > option:nth-child(3)")).click();
        boolean secondIsSelected = driver.findElement(By.cssSelector("#dropdown > option:nth-child(3)")).isSelected();
        Assert.assertTrue(secondIsSelected);

        driver.quit();
    }
}
