package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
only use XPATH
navigate to fb.com
click on create new account
fill up all the text boxes
close the pop-up
close the browse
 */
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
        WebElement createNewAcc = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
        createNewAcc.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Nigora");
        driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Akhmadjanova");
        driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("Akhmadjanovanigora@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("qwerty123");
        driver.findElement(By.xpath("//select[@id = 'month']")).sendKeys("Jul");
        driver.findElement(By.xpath("//select[@id = 'day']")).sendKeys("20");
        driver.findElement(By.xpath("//select[@id = 'year']")).sendKeys("1993");
        driver.findElement(By.xpath("//label[text() = 'Female']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//img[@class = '_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
