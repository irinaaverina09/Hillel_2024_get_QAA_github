package HomeWork12;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

import java.util.List;


public class HillelTesting {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriver browser = getDriver(args[0]);
        browser.get("https://ithillel.ua/courses/testing");
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));



       /* This loop has 4 values as output. Why?
       for (int i = 0; i < 8; i++ )
         { System.out.println(coursesList.get(i).getText());
                i++;
            } */
        List<WebElement> coursesList = browser.findElements(By.className("profession-bar_title"));
        List<WebElement> opportunityList = browser.findElements(By.className("opportunity-item_title"));

        WebElement programmingTab = browser.findElement(By.className("categories_link"));





        getOpportunities(opportunityList);

        getCourses(coursesList);

        getAdditionalCourses(coursesList);

        goToProgrammingTab(programmingTab);

        browser.navigate().refresh();

        WebElement managementTab = browser.findElement(By.cssSelector("#categories > div > ul > li:nth-child(3) > a"));

        goToManagementTab(managementTab);

        WebElement marketingTab = browser.findElement(By.cssSelector("#categories > div > ul > li:nth-child(5)"));

        goToMarketingTab(marketingTab);

        browser.quit();

    }

    public static HillelMarketing goToMarketingTab(WebElement marketingTab) throws InterruptedException {
        Thread.sleep(7);
        System.out.println(marketingTab.getText());
        Thread.sleep(7);
        marketingTab.click();
        Thread.sleep(7);
        return new HillelMarketing(driver);

    }



    public static HillelProgramming goToManagementTab(WebElement managementTab) throws InterruptedException {
        Thread.sleep(7);
        System.out.println(managementTab.getText());
        Thread.sleep(7);
        managementTab.click();
        Thread.sleep(7);
        return new HillelProgramming(driver);

    }

    public static HillelManagement goToProgrammingTab(WebElement programmingTab) throws InterruptedException {
        Thread.sleep(7);
        System.out.println(programmingTab.getText());
        Thread.sleep(7);
        programmingTab.click();
        Thread.sleep(7);
        return new HillelManagement(driver);

    }



    private static void getOpportunities(List<WebElement> opportunityList) {
        int i = 0;
        while (i < 5) {

            System.out.println(opportunityList.get(i).getText());
            i++;

        }
    }

    public static void getCourses(List<WebElement> coursesList) {
        int i = 0;
     System.out.println("All QA courses");
        while (i < 8) {

            System.out.println(coursesList.get(i).getText());
            i++;
        }
    }
    public static void getAdditionalCourses(List<WebElement> coursesList) {
            System.out.println("Additional QA courses");
            System.out.println(coursesList.get(7).getText());
            System.out.println(coursesList.get(6).getText());
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