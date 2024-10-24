package by.nn.zags.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitizenDataPage extends BasePage {
    @FindBy(xpath = "//label[text()='Фамилия']/following-sibling::input")
    private WebElement surnameInputField;

    @FindBy (xpath = "//label[text()='Имя']/following-sibling::input")
    private WebElement nameInputField;

    @FindBy (xpath = "//label[text()='Отчество']/following-sibling::input")
    private WebElement middleNameInputField;

    @FindBy (xpath = "//label[text()='Дата рождения']/following-sibling::input")
    private WebElement birthDateInputField;

    @FindBy (xpath = "//label[text()='Номер паспорта']/following-sibling::input")
    private WebElement passportInputField;

    @FindBy(xpath = "//label[text()='Пол']/following-sibling::input")
    private WebElement genderInputField;

    @FindBy (xpath = "//button[text()='Далее']")
    private WebElement nextButton;

    public void fillCitizenDataForm(String surname, String name, String middleName, String birthDate, String passport, String gender){
        surnameInputField.sendKeys(surname);
        nameInputField.sendKeys(name);
        middleNameInputField.sendKeys(middleName);
        birthDateInputField.sendKeys(birthDate);
        passportInputField.sendKeys(passport);
        genderInputField.sendKeys(gender);
    }
    public void goToServiceDataPage(){
        nextButton.click();
    }
}
