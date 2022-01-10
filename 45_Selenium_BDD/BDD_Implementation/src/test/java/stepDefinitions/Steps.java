package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Steps {
    WebDriver driver;

    @Given("user is on Home Page")
    public void user_is_on_home_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek_Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
    }

    @When("user searches for {string}")
    public void user_searches_for(String item) throws InterruptedException {
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search for anything']"));
        searchBox.click();
        searchBox.sendKeys(item);

        WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSearch.click();
        Thread.sleep(2000);
    }

    @When("user chooses the first item available")
    public void user_chooses_the_first_item_available() throws InterruptedException {
        WebElement firstItem = driver.findElement(By.xpath("(//div[@class='srp-river-results clearfix']//li[contains(@data-view,'mi:1686')]//h3)[1]"));
        firstItem.click();

        Thread.sleep(3000);
    }

    @Then("user adds it to cart")
    public void user_adds_it_to_cart() throws InterruptedException {
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
