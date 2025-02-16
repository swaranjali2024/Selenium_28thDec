package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageobjects.Filter_SortPage;

public class Filter_Sort extends BaseTest{

    @Test
    public void selectValuefromDropdown() throws InterruptedException {

        login_module.login(envProp.getProperty("username"), envProp.getProperty("password"));

        WebElement dropdownelement = driver.findElement(Filter_SortPage.dropdown);
        Select select = new Select(dropdownelement);
        select.selectByVisibleText("Price (low to high)");
        Select select1 = new Select(dropdownelement);
        WebElement ele = select1.getFirstSelectedOption();
        String selectedoption = ele.getText();
        System.out.println("Selected option is:" + selectedoption );



    }
}
