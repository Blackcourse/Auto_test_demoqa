package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

class RegistrationWithPageObjectsTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulRegistrationTest() {

        registrationPage.openPage()
                .checkTitle()
                .hideBanners()
                .setFirstName("Gella")
                .setLastName("Kurbobovna")
                .setEmail("gell@kur.com")
                .setGender("Female")
                .setUserNumber("8952145789")
                .setDateOfBirth( "28", "July", "2023")
                .setSubjects("Math")
                .setHobbiesWrapper("Sports")
                .setUploadPicture("img.png")
                .setCurrentAddress("Another 123")
                .setState("NCR")
                .setCity("Delhi")
                .clickButtonSubmit()
                .checkModalDialog("Thanks for submitting the form")
                .checkKeyValue("Student Name", "Gella Kurbobovna")
                .checkKeyValue("Student Email", "gell@kur.com")
                .checkKeyValue("Gender", "Female")
                .checkKeyValue("Mobile", "8952145789")
                .checkKeyValue("Date of Birth", "28 July,2023")
                .checkKeyValue("Subjects", "Math")
                .checkKeyValue("Hobbies", "Sports")
                .checkKeyValue("Picture", "img.png")
                .checkKeyValue("Address", "Another 123")
                .checkKeyValue("State and City", "NCR Delhi")
        ;

    }
}