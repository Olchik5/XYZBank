package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".home")
    private WebElement homeButton;

    @FindBy(xpath = "//button[@ng-click='customer()']")
    private WebElement customerLoginButton;

    @FindBy(xpath = "//button[@ng-click='manager()']")
    private WebElement bankManagerLoginButton;

    public void clickOnHomeButton() {
        click(homeButton);
    }

    public void clickOnCustomerLoginButton() {
        click(customerLoginButton);
    }

    public void clickOnBankManagerLoginButton() {
        click(bankManagerLoginButton);
    }
}
