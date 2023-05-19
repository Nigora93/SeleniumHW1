package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        //declare the instance
        WebDriver driver = new ChromeDriver();

        //navigate to hrm
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboar");

        //maximize the screen
        driver.manage().window().maximize();

        //1st method - find the element username TextBox
        WebElement userNameTextBox = driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Hello");

        //2nd method
//        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //slow down
        Thread.sleep(3000);

        //after sending the username to the textbox, clear the text box
        userNameTextBox.clear();

        //sending the username again
        userNameTextBox.sendKeys("Admin");

        //find and fill in the password
        WebElement pass = driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        //bind the login btn
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        //get the welcome message
        WebElement message = driver.findElement(By.linkText("Welcome Admin"));
        String text = message.getText();
        System.out.println(text);

        //click on the recruitment tab
        driver.findElement(By.partialLinkText("Recru")).click();


    }
}
