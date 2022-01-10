package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class E2E {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek_Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");

        //driver.navigate().to("https://shop.demoqa.com/?s=" + "dress" + "&post_type=product");

        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search for anything']"));
        searchBox.click();
        searchBox.sendKeys("Laptop");

        WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSearch.click();
        Thread.sleep(2000);

        WebElement firstItem = driver.findElement(By.xpath("(//div[@class='srp-river-results clearfix']//li[contains(@data-view,'mi:1686')]//h3)[1]"));
        firstItem.click();

        Thread.sleep(3000);

        String Parent = driver.getWindowHandle();

        Set<String> set = driver.getWindowHandles();

        System.out.println("Set: " + set.toString());

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String child = itr.next();
            if (!Parent.equalsIgnoreCase(child)) {
                driver.switchTo().window(child);
                System.out.println("Child window: " + driver.getTitle());

                WebElement addToCart = driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
                addToCart.click();

                WebElement btnCheckOut = driver.findElement(By.xpath("//button[contains(text(),'Go to checkout')]"));
                btnCheckOut.click();
                Thread.sleep(5000);

                driver.close();
            }
        }
        driver.switchTo().window(Parent);

        driver.quit();

    }
}
