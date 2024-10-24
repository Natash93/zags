import by.nn.zags.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApplicationSubmissionTest {
    private HomePage homePage;
    private ApplicantDataPage applicantDataPage;
    private ChooseServicePage chooseServicePage;
    private CitizenDataPage citizenDataPage;
    private ServiceDataPage serviceDataPage;
    private ApplStatusPage applStatusPage;

    @BeforeMethod
    public void setup() {
        homePage = new HomePage();
        homePage.openMainPage();
        homePage.enterAsUser();

        applicantDataPage = new ApplicantDataPage();
        chooseServicePage = new ChooseServicePage();
        citizenDataPage = new CitizenDataPage();
        serviceDataPage = new ServiceDataPage();
        applStatusPage = new ApplStatusPage();
    }

    @Test
    public void createBirthRegistrationApplication() {
        applicantDataPage.fillApplicantDataForm("Bah", "Iogan", "Volfgang", "1234567", "hb12345678", "some city");
        applicantDataPage.goToChooseServicePage();
        chooseServicePage.chooseBirthRegistrationService();
        citizenDataPage.fillCitizenDataForm("Bah", "Iogan", "Volfgang", "01.01.1990", "hb12345678", "male");
        citizenDataPage.goToServiceDataPage();
        serviceDataPage.fillServiceDataForm("some city", "Alena", "Pedro");
        serviceDataPage.finishApplicationSubmission();

        Assert.assertEquals(applStatusPage.getPageTitle(), "Вы вошли как Пользователь");
        Assert.assertEquals(applStatusPage.getChosenServiceTitle(), "Вы выбрали услугу: Pегистрация рождения");
    }

    @AfterMethod
    public void quit (){
        homePage.quit();
    }
}
