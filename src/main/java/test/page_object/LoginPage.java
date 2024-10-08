package test.page_object;

public class LoginPage extends BasePage {

    public void isOnAlfagiftPage() {
        assertIsDisplay("TEXT_WELCOME_LOGIN");
        assertIsDisplay("LOGO_ALFAMART_LOGIN");
    }

    public void tapLoginButton() {
        tap("BUTTON_LOGIN");
    }

    public void isOnLoginPage() {
        assertIsDisplay("TEXT_LOGIN");
        assertIsDisplay("TEXT_FORGOT_PASSWORD");
    }

    public void inputNumber(String number) {
        typeOn("FIELD_NUMBER_LOGIN", (number));
    }

    public void inputPassword(String password) {
        typeOn("FIELD_PASSWORD_LOGIN", (password));
    }

    public void tapNextLoginButton() {
        tap("BUTTON_NEXT_LOGIN");
    }

    public void isOnHomePage() {
        assertIsDisplay("TEXT_BERANDA_MAIN_PAGE");
        assertIsDisplay("LOGO_MESSAGE_HEADER_MAIN");
        assertIsDisplay("LOGO_LONCENG_HEADER_MAIN");
        assertIsDisplay("LOGO_KERANJANG_HEADER_MAIN");
    }

    public void isNumberNotRegisterWarning() {
        assertIsDisplay("TEXT_NUMBER_NOT_REGISTERED");
    }

    public void isPasswordWrongWarning() {
        assertIsDisplay("TEXT_PASSWORD_INVALID");
    }
    public void isLoginFailedAnotherDevice() {
        assertIsDisplay("TEXT_POPUP_LOGIN_FAILED");
    }






    public void isSuccessRegisterNotification() {
        assertIsDisplay("TEXT_SUCCESS_REGISTER");
    }

    public void isInvalidEmailNotification() {
        assertIsDisplay("TEXT_ERROR_ENTER_VALID_EMAIL");
    }

    public void isInvalidNameNotification() {
        assertIsDisplay("TEXT_ERROR_ENTER_VALID_NAME");
    }

    public void isEmailExistsNotification() {
        assertIsDisplay("TEXT_ERROR_EMAIL_ALREADY_EXISTS");
    }

    public void isEnterPasswordNotification() {
        assertIsDisplay("TEXT_ERROR_ENTER_PASSWORD");
    }

    public void isPasswordNotMatchNotification() {
        assertIsDisplay("TEXT_ERROR_PASSWORD_IS_NOT_MATCH");
    }

//    public void isHomePage() {
//        assertIsDisplay("TEXT_HOMEPAGE");
//    }
//
//    public void backDevice() {
//        getDriver().navigate().back();
//    }
//
//    public void isWrongEmailPassword() {
//        assertIsDisplay("TEXT_ERROR_WRONG_EMAIL_PASSWORD");
//    }
}
