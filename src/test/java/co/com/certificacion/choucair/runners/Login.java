package co.com.certificacion.choucair.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        //tags = {"@run"},
        glue = {"co.com.certificacion.choucair.stepdefinitions","co.com.certificacion.choucair.utils"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class Login {
}
