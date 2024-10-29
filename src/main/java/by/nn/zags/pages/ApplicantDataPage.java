package by.nn.zags.pages;

import by.nn.zags.model.ApplicantModel;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicantDataPage extends BasePage {
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

    @FindBy(xpath = "//label[text()='Адрес прописки']/following-sibling::input")
    private WebElement addressInputField;

        /*@FindBy (xpath = "//div[@class='MuiDialogActions-root MuiDialogActions-spacing']/button[2]")
    private WebElement nextButton;*/

    @FindBy(xpath = "//button[text()='Далее']")
    private WebElement nextButton;

    @Step("user fills applicant data form")
    public void fillApplicantDataForm(ApplicantModel applicant) {
        surnameInputField.sendKeys(applicant.getSurname());
        nameInputField.sendKeys(applicant.getName());
        middleNameInputField.sendKeys(applicant.getMiddleName());
        phoneInputField.sendKeys(applicant.getPhone());
        passportInputField.sendKeys(applicant.getPassport());
        addressInputField.sendKeys(applicant.getAddress());
        nextButton.click();
    }

    public void goToChooseServicePage() {
        nextButton.click();
    }


}
