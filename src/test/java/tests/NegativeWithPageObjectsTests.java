package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class NegativeWithPageObjectsTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void negativeTest() {

        registrationPage.openPage()
                .checkTitle()
                .hideBanners()
                .setFirstName("Alex")
                .setLastName("Bolduin")
                .setGender("Male")
                .setUserNumber("dsafjafd;oikldfj")
                .setDateOfBirth("05", "July", "2000")
                .clickButtonSubmit()
        ;

        $(".modal-dialog").should(disappear);
    }
}