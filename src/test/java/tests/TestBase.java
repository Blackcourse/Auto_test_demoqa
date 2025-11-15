package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeAll
    static void setupEnvironment() {

        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
          Configuration.browser = "chrome";
         Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "eager";
    }
    @BeforeEach
    void beforeSingle() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

}