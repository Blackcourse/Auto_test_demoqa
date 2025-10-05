package tests;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExample {
    void cssXpath () {
        $("[data-testid=email]").setValue("1");
        $(by("data-testid","email")).setValue("1");
        $x("//*[@data-testid='email']").setValue("1");

        $("[id=email]").setValue("1");
        $(by("id","email")).setValue("1");
        $(byId("email")).setValue("1");
        $("email").setValue("1");
        $x("//*[@name='email']").setValue("1");
    }
}
