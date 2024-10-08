package step_definitions;

import io.cucumber.java8.En;
import test.page_object.LoginPage;

public class LoginPageSteps implements En {

    LoginPage loginPage = new LoginPage();

    public LoginPageSteps() {

        Given("User in apps Alfagift", () -> loginPage.isOnAlfagiftPage());
        When("User click masuk in login page", () -> loginPage.tapLoginButton());
        And("User is on login page", () -> loginPage.isOnLoginPage());
        And("^User input number phone as \"([^\"]*)\" in login page$", (String number) -> loginPage.inputNumber(number));
        And("^User input password as \"([^\"]*)\" in login page$", (String password) -> loginPage.inputPassword(password));
        And("User click next in login page", () -> loginPage.tapNextLoginButton());
        When("User see homepage", () -> loginPage.isOnHomePage());
        Then("User see error not registered number warning", () -> loginPage.isNumberNotRegisterWarning());
        Then("User see error wrong password warning", () -> loginPage.isPasswordWrongWarning());
        Then("User see error login failed another device", () -> loginPage.isLoginFailedAnotherDevice());

    }
}
