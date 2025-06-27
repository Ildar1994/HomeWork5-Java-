import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class dragDrop {
    @Test
    void DragDropTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
       $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
       $("#column-b").shouldHave(text("A"));
        sleep(5000);
        //actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(300,0).release().perform(); тоже работает
    }

}
