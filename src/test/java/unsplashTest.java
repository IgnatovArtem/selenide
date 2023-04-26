import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class unsplashTest {
    @Test
    public void unsplashTest () {
        open("https://unsplash.com/");
        $x("//a[@class='cLLOA p1cWU jpBZ0 EzsBC KHq0c XHI2L']").click();
        $x("//div[@class='form-group']//input[@id='user_email']")
                .setValue("test@gmail.com")
                .shouldBe(Condition.value("test@gmail.com"));

        $x("//div[@class='form-group']//input[@id='user_password']")
                .setValue("1234567")
                .shouldBe(Condition.value("1234567"));

        $x("//div[@class='form-group']//input[@name='commit']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='col-xs-10 col-sm-6 center-block flash__message']")
                .shouldBe(Condition.exactText("Invalid email or password."));
    }
}
