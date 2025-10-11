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
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8999562458");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__day.react-datepicker__day--010").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("img.png");
        $("#currentAddress").setValue("Another street 1");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $("div.table-responsive").shouldHave(text("Alex Bolduin"));
        $("div.table-responsive").shouldHave(text("abld@nail.ru"));
        $("div.table-responsive").shouldHave(text("Male"));
        $("div.table-responsive").shouldHave(text("8999562458"));
        $("div.table-responsive").shouldHave(text("10 June,1990"));
        $("div.table-responsive").shouldHave(text("img.png"));
        $("div.table-responsive").shouldHave(text("Another street 1"));
        $("div.table-responsive").shouldHave(text("NCR Delhi"));


    }
}

