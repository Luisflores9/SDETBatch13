package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeInformationPage extends CommonMethods {

    @FindBy(id = "empsearch_id")
    public WebElement idEmployeeSearch;

    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement nameEmployeeSearch;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;

    public EmployeeInformationPage() {
        PageFactory.initElements(driver, this);
    }
}