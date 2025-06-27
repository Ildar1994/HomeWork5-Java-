import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class Enterprize {

    @Test
void proverkaTest() {
    open("https://github.com/home");
    $(".HeaderMenu-nav").$(byText("Solutions")).hover();
    $("[href=\"https://github.com/enterprise\"]").click();
    $("#hero-section-brand-heading").$(byText("The AI-powered")).$(byText("developer platform"));
    
    sleep(5000);

    }
}


