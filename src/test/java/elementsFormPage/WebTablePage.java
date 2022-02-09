package elementsFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablePage extends BasePage {

    WebDriver driver;
    WebElement addButton;
    WebElement firstNameTextBox;
    WebElement lastNameTextBox;
    WebElement userEmailTextBox;
    WebElement ageTextBox;
    WebElement salaryTextBox;
    WebElement departmentTextBox;
    WebElement submitButton;
    WebElement searchTextBox;
    WebElement firstSatir;
    WebElement addedName;
    WebElement editButon;
    WebElement deleteButton;
    WebElement noRowsText;

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstNameTextBox() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastNameTextBox() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getUserEmailTextBox() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAgeTextBox() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalaryTextBox() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartmentTextBox() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getSearchTextBox() {
        return driver.findElement(By.id("searchBox"));
    }

    public WebElement getFirstSatir() {
        return driver.findElement(By.xpath("//div[@class='rt-tr -odd']"));
    }

    public WebElement getAddedName() {
        return driver.findElement(By.xpath("//div [@class='rt-tr -even']) [2]"));
    }

    public WebElement getEditButon() {
        return driver.findElement(By.id("edit-record-1"));
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.id("delete-record-2"));
    }

    public WebElement getNoRowsText() {
        return driver.findElement(By.xpath("//div[.='No rows found']"));
    }
    //------------------------------------------------
   public void inputFirstName(String frName){
        this.getFirstNameTextBox().clear();
        this.getFirstNameTextBox().sendKeys(frName);
    }
    public void inputLastName(String laName){
        this.getLastNameTextBox().click();
        this.getLastNameTextBox().sendKeys(laName);
    }
    public void inputEmail(String email){
        this.getUserEmailTextBox().clear();
        this.getUserEmailTextBox().sendKeys(email);
    }
    public void inputAge(int age){
        this.getAgeTextBox().clear();
        this.getAgeTextBox().sendKeys(String.valueOf(age));
    }
    public void inputSalary(int salary){
        this.getSalaryTextBox().clear();
        this.getSalaryTextBox().sendKeys(String.valueOf(salary));
    }
    public void inputDepartment(String department){
        this.getDepartmentTextBox().clear();
        this.getDepartmentTextBox().sendKeys(department);
    }

        }




