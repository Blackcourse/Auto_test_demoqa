package guru.qa.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.anyMatch;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;



    @Nested
   public class  LambdaTest extends TestBase {

        private static final String link = "/Blackcourse/Auto_test_demoqa";
        private static final String nameOfBug = "Bug2";

        @Test
        public void simpleLambdaTest() {
            SelenideLogger.addListener("allure", new AllureSelenide());

            step("Open github repo", () -> {
                open(link);
            });


            step("Click on \"Issue\" tab", () -> {
                $("#issues-tab").click();
            });

            step("Check that bug with name {name} exists", () -> {
                $$("[data-testid=issue-pr-title-link]").shouldHave(anyMatch(
                        "element exist",
                        el -> el.getText().contains(nameOfBug)
                ));
            });

        }
    }

