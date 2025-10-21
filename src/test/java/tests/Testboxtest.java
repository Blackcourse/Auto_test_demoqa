package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Testboxtest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("asd@nail.ru");
        $("#currentAddress").setValue("Strange street 2");
        $("#permanentAddress").setValue("Another street 1");
        $("#submit").click();


        $("#output #name").shouldHave(text("Alex"));
        $("#output #email").shouldHave(text("asd@nail.ru"));
        $("#output #currentAddress").shouldHave(text("Strange street 2"));
        $("#output #permanentAddress").shouldHave(text("Another street 1"));

    }


}
