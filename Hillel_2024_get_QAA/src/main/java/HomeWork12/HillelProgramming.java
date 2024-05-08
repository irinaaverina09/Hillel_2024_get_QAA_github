package HomeWork12;

import org.openqa.selenium.WebDriver;


public class HillelProgramming {
    private WebDriver driver;
    public HillelProgramming(WebDriver driver) {
        this.driver = driver;
    }
    public HillelProgramming manageProgrammingPage() {
        return new HillelProgramming(driver);
    }
}
