package by.nn.zags.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServiceDataPage extends BasePage {
    @FindBy(xpath = "//label[text()='Место рождения']/following-sibling::input")
    private WebElement birthPlaceInputField;

    @FindBy(xpath = "//label[text()='Мать']/following-sibling::input")
    private WebElement motherNameInputField;

    @FindBy(xpath = "//label[text()='Отец']/following-sibling::input")
    private WebElement fatherNameInputField;

    @FindBy(xpath = "//button[text()='Завершить']")
    private WebElement finishButton;

    public void fillServiceDataForm(String birthPlace, String motherName, String fatherName){
        birthPlaceInputField.sendKeys(birthPlace);
        motherNameInputField.sendKeys(motherName);
        fatherNameInputField.sendKeys(fatherName);

    }
    public void finishApplicationSubmission(){
        finishButton.click();
    }
}
