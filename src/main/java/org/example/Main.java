package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("  https://www.saucedemo.com");

       driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

        String agala=driver.findElement(By.className("shopping_cart_badge")).getText();

        if (agala.equals("2")){
            System.out.println("הפריטים  נוספו לעגלה בהצלחה");
        }

        else {
            System.out.println("הפריטים לא נוספו לעגלה שגיאה");
        }

        driver.findElement(By.className("shopping_cart_badge")).click();


        String TTitle= driver.findElement(By.className("title")).getText();

        if (agala.equals("Your Cart")){
            System.out.println(" שגיאה");
        }

        else {
            System.out.println("הגעת לעמוד הנכון");

        }

         driver.findElement(By.id("continue-shopping")).click();


        driver.findElement(By.id("remove-sauce-labs-backpack")).click();



        driver.quit();



    }
}