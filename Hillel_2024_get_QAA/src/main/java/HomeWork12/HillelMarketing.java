package HomeWork12;

import org.openqa.selenium.WebDriver;


public class HillelMarketing {
    private WebDriver driver;
    public HillelMarketing(WebDriver driver) {
        this.driver = driver;
    }
    public HillelMarketing manageMarketingPage() {
        return new HillelMarketing(driver);
    }
}
