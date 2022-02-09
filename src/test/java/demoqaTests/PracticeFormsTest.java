package demoqaTests;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class PracticeFormsTest extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL); //pozivamo URL
    }

    @Test
    public void goToForms() {
        demoqaHomePage.clickForm();

        wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".col-12.mt-4.col-md-6")));

        String actualString = driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6")).getText();
        String expectedString = "Please select an item from left to start practice.";
        Assert.assertEquals(actualString, expectedString);

    }
    @Test
    public void VerifyThatPracticeFormUnderFormsIsVisible(){
        goToForms();
        practicePage.getPracticeFormButton().click();
        Assert.assertTrue(practicePage.getPracticeFormButton().isEnabled());
    }
    @Test
    public void InputStudentRegistrationForm() throws InterruptedException {
        goToForms();
        practicePage.getPracticeFormButton().click();

        String firstName = excelReader.getStringData("FormsPage", 1, 0);
        String lastName = excelReader.getStringData("FormsPage", 1, 1);
        String userEmail = excelReader.getStringData("FormsPage", 1, 2);
        int mobileNumber = excelReader.getIntegerData("FormsPage", 1, 4);
        int date = excelReader.getIntegerData("FormsPage",1,3);
        String subjects = excelReader.getStringData("FormsPage",1,5);
        String uploadPicture = excelReader.getStringData("FormsPage",1,6);
        String getAddress = excelReader.getStringData("FormsPage",1,7);


        practicePage.inputFirstName(firstName);
        practicePage.inputLastName(lastName);
        practicePage.inputUserEmail(userEmail);
        practicePage.getFemale().click();
        practicePage.inputMobileNumber(mobileNumber);
        //practicePage.getDateOfBirth().click();
       // waitVisibility(practicePage.getSubjects());
        //practicePage.inputSubject(subjects);
        //practicePage.getSubjects().click();
        practicePage.getHobbyReading().click();
        practicePage.getHobbySports().click();
        practicePage.uploadPicture(uploadPicture);
        practicePage.inputAddress(getAddress);
        practicePage.selectDropDownStateValue();
        practicePage.selectDropDownCityValue();
        practicePage.getSubmit().click();

        Assert.assertTrue(practicePage.getOutputText().isDisplayed());








    }
}
