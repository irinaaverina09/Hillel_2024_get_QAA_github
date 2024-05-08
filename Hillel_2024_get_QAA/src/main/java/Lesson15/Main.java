package Lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = getDriver(args [0]);
        browser.get("https://ithillel.ua/");


        browser.manage().window().maximize();
        System.out.println(browser.getTitle());

        WebElement blogButton = browser.findElement(By.cssSelector("#body > div.site-wrapper > div.site-header.-no-logo > div > nav:nth-child(2) > div > div > ul > li:nth-child(5) > a"));
        blogButton.click();

        Thread.sleep(3000);

        WebElement searchField = browser.findElement(By.cssSelector("*.site-nav-search_btn"));
        WebElement searchInput = browser.findElement(By.cssSelector("*.site-nav-search_input"));
        searchField.click();
        searchInput.sendKeys("java");
        searchInput.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        System.out.println(browser.getTitle());
        browser.quit();

    }

    static WebDriver getDriver(String driverName) {
            switch (driverName) {
                case "chrome":
                    return new ChromeDriver();


                default:
                    throw new IllegalArgumentException("No such element");
            }
        }

    }

