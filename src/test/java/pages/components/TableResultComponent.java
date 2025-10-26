package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TableResultComponent {
    public void checkResult(String key, String value) {

        SelenideElement tableResponse=$(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
    }

}

