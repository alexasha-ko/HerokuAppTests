import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddRemoveElements {

        @Test
        public void addRemoveElement() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

            driver.findElement(By.cssSelector("#content > div > button")).click();
            driver.findElement(By.cssSelector("#content > div > button")).click();
            driver.findElement(By.cssSelector("#elements > button:nth-child(1)")).click();

            int actualQuantity = driver.findElements(By.cssSelector("#elements > button:nth-child(1)")).size();
            int expectedQuantity = 1;

            Assert.assertEquals(actualQuantity,1);

            driver.quit();




        }

    }
