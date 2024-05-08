package HomeWork12;

import org.openqa.selenium.WebDriver;


public class HillelManagement {
    private WebDriver driver;
    public HillelManagement(WebDriver driver) {
        this.driver = driver;
    }
    public HillelManagement manageManagementPage() {
        return new HillelManagement(driver);
    }
}
