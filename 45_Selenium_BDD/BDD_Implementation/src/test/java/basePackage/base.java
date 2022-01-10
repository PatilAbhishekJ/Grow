package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class base {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Users\\Abhishek_Patil\\IdeaProjects\\BDD_Implementation\\src\\test\\resources\\Info.properties");
        Properties prop=new Properties();
        //prop.load("Info.properties");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek_Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String header=driver.getTitle();
        System.out.println(header);

    }


}
