package TestSerenityBDDCucumber.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;


public class OrangeHRMHomePage extends PageObject {
    public  void openApp(){
        getDriver().navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void enterUsername() {
        $(By.name("username")).type("Admin");
    }

    public void enterPassword() {
        $(By.name("password")).type("admin123");
    }

    public void clicLogin() {
        $(By.xpath("//button[@type='submit']")).click();
    }
}
