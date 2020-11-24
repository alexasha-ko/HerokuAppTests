import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataTablesChecks {
    @Test
    public void lastNameContentCheck(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");

        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]"));
        System.out.println("Last name value  of the selected cell is " + lastname.getText());

        driver.quit();


    }
    @Test
    public void nameContentChecks(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");

        WebElement name = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[2]"));
        System.out.println("Name value of the selected cell is " + name.getText());

    }

    @Test
    public void emailContentChecks(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[3]"));
        System.out.println("Email value of the selected cell is " + email.getText());

        driver.quit();

    }


}
