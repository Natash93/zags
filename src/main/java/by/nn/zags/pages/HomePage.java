package by.nn.zags.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//button[text()=\"Войти как пользователь\"]")
    private WebElement userEnterButton;

    @FindBy(xpath = "//button[text()=\"Войти как администратор\"]")
    private WebElement adminEnterButton;

    @Step ("choosing to enter as user")
    public void enterAsUser() {
        userEnterButton.click();
    }

    @Step ("choosing to enter as admin")
    public void enterAsAdmin() {
        adminEnterButton.click();
    }
}
