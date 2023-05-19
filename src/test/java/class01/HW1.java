package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        //navigate to
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FFOAFEDBDF4454B27BBC5CO5BO%22");

        //fill out the form
        driver.findElement(By.id("customer.firstName")).sendKeys("Nigora");
        driver.findElement(By.id("customer.lastName")).sendKeys("Akhmadjanova");
        driver.findElement(By.id("customer.address.street")).sendKeys("Makhtumquli 89");
        driver.findElement(By.id("customer.address.city")).sendKeys("Tashkent");
        driver.findElement(By.id("customer.address.state")).sendKeys("N/A");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("100400");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("+99893 000 00 00");
        driver.findElement(By.id("customer.ssn")).sendKeys("N/A");

        driver.findElement(By.id("customer.username")).sendKeys("Nigora");
        driver.findElement(By.id("customer.password")).sendKeys("qwerty123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("qwerty123");

        Thread.sleep(5000);

        driver.quit();

    }
}
