package by.nn.zags.pages;

import by.nn.zags.model.AdminModel;
import by.nn.zags.model.ApplicantModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDataPage extends BasePage{
    @FindBy(xpath = "//label[text()='Фамилия']/following-sibling::input")
    private WebElement surnameInputField;

    @FindBy(xpath = "//label[text()='Имя']/following-sibling::input")
    private WebElement nameInputField;

    @FindBy(xpath = "//label[text()='Отчество']/following-sibling::input")
    private WebElement middleNameInputField;

    @FindBy(xpath = "//label[text()='Телефон']/following-sibling::input")
    private WebElement phoneInputField;

    @FindBy(xpath = "//label[text()='Номер паспорта']/following-sibling::input")
    private WebElement passportInputField;

    @FindBy (xpath = "//label[text()='Дата рождения']/following-sibling::input")
    private WebElement birthDateInputField;

    @FindBy(xpath = "//button[text()='Далее']")
    private WebElement nextButton;

    public void fillAdminDataForm(AdminModel adminModel) {
        surnameInputField.sendKeys(adminModel.getSurname());
        nameInputField.sendKeys(adminModel.getName());
        middleNameInputField.sendKeys(adminModel.getMiddleName());
        phoneInputField.sendKeys(adminModel.getPhone());
        passportInputField.sendKeys(adminModel.getPassport());
        birthDateInputField.sendKeys(adminModel.getBirthDate());
        nextButton.click();
    }
}
