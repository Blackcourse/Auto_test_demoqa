package tests;
import org.junit.jupiter.api.*;

@DisplayName("Тесты на email рассылку")
public class EmailTest {

    @Test
    @DisplayName("Email для нового пользователя")
    void emailShouldBeSendToFirstUser () {
        System.out.println("Hello world");

    }
    @Test
    @DisplayName("Email для забаненного пользователя")
    void emailShouldBeSendToBannedUser () {
        System.out.println("Hello world");

    }
    @Disabled
    @Test
    @DisplayName("Email при оплате")
    void emailShouldBeSendAfter () {
        throw new AssertionError("Падаем!");

    }



}
