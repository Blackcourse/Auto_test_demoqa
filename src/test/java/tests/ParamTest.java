package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.stream.Stream;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;


public class ParamTest {


    @ParameterizedTest(name = "Поиск Яндекс-маркет: {0}")
    @ValueSource(strings = {
            "колонка", "мышь", "клавиатура"
    })
    @DisplayName("Отображение ")
    void search(String search) {
        open("https://market.yandex.ru/");
        $("#header-search").setValue(search).pressEnter();
        $$("#EQlfk Gqfzd").shouldBe(sizeGreaterThan(0));

    }
    @ParameterizedTest(name = "Проверка заголовка страницы поиска {0}")
    @CsvSource({
            "колонки",
            "мышь",
            "клавиатура"
    })
    void searchTitleCheck(String query) {
        open("https://market.yandex.ru/");
        $("#header-search").setValue(query).pressEnter();
        $$(".data-auto-themename").shouldHave(CollectionCondition.sizeGreaterThan(0));
    }


    static Stream<String> popularQueries() {
        return Stream.of("носки", "джинсы", "перчатки");
    }

    @ParameterizedTest(name = "Проверка количества результатов для {0}")
    @MethodSource("popularQueries")
    void resultCountCheck(String query) {
        open("https://market.yandex.ru/");
        $("#header-search").setValue(query).pressEnter();
        $$(".product-card").shouldHave(CollectionCondition.sizeGreaterThan(20));
    }
    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}