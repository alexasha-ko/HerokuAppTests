import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoversChecks {

    @Test
    public void userOneChecks(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");

        WebElement userOne = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        Actions action = new Actions(driver);
        WebElement hover = userOne;
        action.moveToElement(hover);
        action.perform();

        driver.getPageSource().contains("user1");
        WebElement userOneLink = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a"));
        userOneLink.click();
        driver.getPageSource().contains("Not Found");

        driver.quit();



    }

    @Test
    public void userTwoChecks(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");

        WebElement userTwo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        Actions action = new Actions(driver);
        WebElement hover = userTwo;
        action.moveToElement(hover);
        action.perform();

        driver.getPageSource().contains("user2");
        WebElement userOneLink = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/a"));
        userOneLink.click();
        driver.getPageSource().contains("Not Found");

        driver.quit();



    }

    @Test
    public void userThreeChecks(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");

        WebElement userThree = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
        Actions action = new Actions(driver);
        WebElement hover = userThree;
        action.moveToElement(hover);
        action.perform();

        driver.getPageSource().contains("user3");
        WebElement userOneLink = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/a"));
        userOneLink.click();
        driver.getPageSource().contains("Not Found");

        driver.quit();



    }


}
