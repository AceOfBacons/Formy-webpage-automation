import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\psg20\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement firstNameField = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);
        actions.moveToElement(firstNameField);
        firstNameField.sendKeys("Pablo Saldarriaga");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/03.2024");

        driver.quit();
    }
}
