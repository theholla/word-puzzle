import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class IntegratedTests extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Please type a sentence to be");
  }

  @Test
  public void wordPuzzle_makeStringCryptic_containsDashes(){
    goTo("http://localhost:4567");
    fill("#userinput").with("Let's ride bikes!");
    submit(".btn");
    assertThat(pageSource()).contains("r-d- b-k-s!");
  }
}
