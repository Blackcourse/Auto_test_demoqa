package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.*;

public class RegistrationWithTestData {


    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Gella");
        $("#lastName").setValue("Kurbob");
        $("#userEmail").setValue("kurbob@asd.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9991112233");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(4);
        $(".react-datepicker__year-select").selectOption(99);
        $(".react-datepicker__day--029").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("image_1.jpg");
        $("#currentAddress").setValue("Moscow");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Delhi")).click();
        $("#submit").click();


        $(".modal-body").shouldHave(text("Gella"));
        $(".modal-body").shouldHave(text("Kurbob"));
        $(".modal-body").shouldHave(text("kurbob@asd.ru"));
        $(".modal-body").shouldHave(text("Male"));
        $(".modal-body").shouldHave(text("9991112233"));
        $(".modal-body").shouldHave(text("29 April,1999"));
        $(".modal-body").shouldHave(text("Maths"));
        $(".modal-body").shouldHave(text("Sports, Reading, Music"));
        $(".modal-body").shouldHave(text("image_1.jpg"));
        $(".modal-body").shouldHave(text("Moscow"));
        $(".modal-body").shouldHave(text("NCR Delhi"));


    }


}