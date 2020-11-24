import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckboxesVerification {

    @Test
    public void firstCheckboxVerification(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        boolean first = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).isSelected();
        System.out.println("Current state is " + first);
        Assert.assertFalse(first);

        driver.quit();

    }

    @Test
    public void checkFirstCheckbox(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).click();
        boolean firstToCheck = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).isSelected();

        System.out.println("Current state is " + firstToCheck);
        Assert.assertTrue(firstToCheck);

        driver.quit();

    }

    @Test
    public void secondCheckbox(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        boolean secondChecked = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).isSelected();

        System.out.println("Current state is " + secondChecked);
        Assert.assertTrue(secondChecked);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).click();
        boolean secondUnchecked = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).isSelected();
        System.out.println("Current state is " + secondUnchecked);
        Assert.assertFalse(secondUnchecked);

        driver.quit();

    }



}
