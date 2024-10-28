package by.nn.zags.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//button[text()=\"Войти как пользователь\"]")
    private WebElement userEnterButton;

    @FindBy(xpath = "//button[text()=\"Войти как администратор\"]")
    private WebElement adminEnterButton;

    public void enterAsUser() {
        userEnterButton.click();
    }

    public void enterAsAdmin() {
        adminEnterButton.click();
    }
}
