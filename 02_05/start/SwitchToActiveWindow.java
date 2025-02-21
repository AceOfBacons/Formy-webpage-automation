import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\psg20\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        //This method helps to get the window handle of the current window
        String originalHandle = driver.getWindowHandle();

        //iterate through all the open windows and switch to the second one open
        for (String handle1 : driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
