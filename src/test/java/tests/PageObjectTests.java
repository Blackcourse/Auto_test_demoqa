package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

class RegistrationWithPageObjectsTests extends TestBase {

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
                .setUserNumber("89521457896")
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
                .checkKeyValue("Mobile", "1234234")
                .checkKeyValue("Date of Birth", "28 July,2003")
                .checkKeyValue("Subjects", "Math")
                .checkKeyValue("Hobbies", "Sports")
                .checkKeyValue("Picture", "img.png")
                .checkKeyValue("Address", "Another 123")
                .checkKeyValue("State and City", "NCR Delhi")
        ;

    }
}