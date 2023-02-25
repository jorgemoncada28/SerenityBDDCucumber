package TestSerenityBDDCucumber.Pages;

import net.thucydides.core.annotations.Step;

public class HomePage {

    OrangeHRMHomePage homePage;

    @Step
    public void openApplication() {
        homePage.openApp();
    }

    @Step
    public void enterUsername() {
        homePage.enterUsername();
    }

    @Step
    public void enterPassword() {
        homePage.enterPassword();
    }

    @Step
    public void clickOnLoginButton() {
        homePage.clicLogin();
    }

}
