package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestAutomationPracticeForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        //Configuration.holdBrowserOpen = true;
    }

    @Test
    void practiceFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Bolduin");
        $("#userEmail").setValue("abld@nail.ru");
        $x("//label[@for='gender-radio-1']").click();
        $("#userNumber").setValue("8999562458");
        $("#dateOfBirthInput").click();
        $x("//option[@value='2014']").click();
        $x("//option[@value='5']").click();
        $(".react-datepicker__day--024").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $x("//label[@for='hobbies-checkbox-2']").click();
        $("#currentAddress").setValue("Another street 1");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();

        $("#submit").click();


    }
}

