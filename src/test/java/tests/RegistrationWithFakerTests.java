package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import static io.qameta.allure.Allure.step;



public class RegistrationWithFakerTests extends TestBaseRemote {


    RegistrationPage registrationPage = new RegistrationPage();


    @BeforeEach
    void setupListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }



    @Test
    @Tag("demoqa_property")
    void successfulRegistrationTest() {

        String firstName = TestData.getFirstNameFaker();
        String lastName = TestData.getLastNameFaker();
        String userEmail = TestData.getUserEmailFaker();
        String userGender = TestData.getUserGenderFaker();
        String userNumber = TestData.getUserPhoneNumbFaker();
        String day = TestData.getDay();
        String month = TestData.getMonth();
        String year = TestData.getYear();
        String userAddress = TestData.getUserAddressFaker();
        String userSubjects = TestData.getUserSubjects();
        String userHobbies = TestData.getUserHobbies();
        String userState = TestData.getUserState();
        String userCity = TestData.getUserCity(userState);

        step ("Open form", () -> {
            registrationPage.openPage()
                    .checkTitle()
                    .hideBanners()
            ;
        });

        step ("Fill form", () -> {
            registrationPage.setFirstName(firstName)
                    .setLastName(lastName)
                    .setEmail(userEmail)
                    .setGender(userGender)
                    .setUserNumber(userNumber)
                    .setDateOfBirth(day, month, year)
                    .setSubjects(userSubjects)
                    .setHobbiesWrapper(userHobbies)
                    .setUploadPicture("img.png")
                    .setCurrentAddress(userAddress)
                    .setState(userState)
                    .setCity(userCity)
                    .clickButtonSubmit()
            ;
        });


        step ("Check results", () -> {
        registrationPage.checkModalDialog("Thanks for submitting the form")
                .checkKeyValue("Student Name", firstName + " " + lastName)
                .checkKeyValue("Student Email", userEmail)
                .checkKeyValue("Gender", userGender)
                .checkKeyValue("Mobile", userNumber)
                .checkKeyValue("Date of Birth", day + " " + month +  "," + year)
                .checkKeyValue("Subjects", userSubjects)
                .checkKeyValue("Hobbies", userHobbies)
                .checkKeyValue("Picture", "img.png")
                .checkKeyValue("Address", userAddress)
                .checkKeyValue("State and City", userState + " " + userCity);

        });


    }
}


