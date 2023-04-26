import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class testSelenide {
    @Test
    public void testGoogle() {
        open("https://www.google.com/");
        $x("//textarea[@name='q']").setValue("selenium").pressEnter();
        $x("//div[@id='result-stats']").shouldBe(Condition.exactOwnText("Результатов: примерно 173 000 000"));
    }
}
