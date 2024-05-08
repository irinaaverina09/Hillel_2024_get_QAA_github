package HomeWork11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = getDriver(args[0]);
        browser.get("https://ithillel.ua/");


        browser.manage().window().maximize();
        System.out.println(browser.getTitle());


        WebElement courses = browser.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav[2]/div/div/ul/li[2]/button"));
        courses.click();


        Thread.sleep(3000);


        WebElement searchForCourseProgramming = browser.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav[2]/div/div/ul/li[2]/div/div[1]/ul/li[2]/button"));

        searchForCourseProgramming.click();


        WebElement searchFE = browser.findElement(By.xpath("//*[@id=\"block-202987\"]/div/ul/li[1]/a/div"));
        Thread.sleep(3000);
        searchFE.click();

        Thread.sleep(3000);


        JavascriptExecutor js = (JavascriptExecutor) browser;
        WebElement technologies = browser.findElement(By.cssSelector("*.technologies_title"));

        js.executeScript("arguments[0].scrollIntoView();", technologies);

        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        WebElement pressShowButton = browser.findElement(By.cssSelector("*.button#coachesShowAllButton.button.-xl.-light-blue.coaches_action"));
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);", pressShowButton);
        js.executeScript("arguments[0].click();", pressShowButton);

        WebElement coachHeader = browser.findElement(By.className("coaches_header"));
        WebElement coachList = browser.findElement(By.className("coach-list_item"));
        List<WebElement> coachCardName = browser.findElements(By.className("coach-card_name"));

        int i = 0;
        while (i < 17) {

            System.out.println(coachCardName.get(i).getText());
            i++;


        }
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

