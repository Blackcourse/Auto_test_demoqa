package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;


public class ModalDialogComponent {
    private String modalDialog;
    private String modalDialogSize;

    public void modalDialog(String value) {
        modalDialog = String.valueOf(Selenide.$(".modal-dialog").should(Condition.appear));
        modalDialogSize = String.valueOf(Selenide.$("#example-modal-sizes-title-lg").shouldHave(Condition.text(value)));


    }
}