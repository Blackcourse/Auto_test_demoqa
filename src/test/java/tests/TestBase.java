package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Configuration.*;

public class TestBase {

    @BeforeAll
    static void setupEnvironment() {

        baseUrl = "https://github.com";
        browserSize = "1920x1080";
        browser = "chrome";
        timeout = 10000;
        pageLoadStrategy = "eager";
        remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }


    @BeforeEach

    void beforeSingle() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource("Page Source");
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}



