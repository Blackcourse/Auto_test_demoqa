package guru.qa.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.anyMatch;
import static com.codeborne.selenide.Selenide.*;

public class SeleinideTest extends TestBase {
    
    @Test
    @Owner("Blackcourse")
    @Severity(SeverityLevel.BLOCKER)
    void simpleSeleinideTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("/Blackcourse/Auto_test_demoqa");
        $("#issues-tab").click();
        $$("[data-testid=issue-pr-title-link]").shouldHave(anyMatch(
                "element exist",
                el -> el.getText().contains("Bug2")
        ));
    }
}
