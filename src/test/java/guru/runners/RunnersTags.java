package guru.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/guru.feature",
        tags = "@caso1",
        glue = "guru.stepdefintions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnersTags {
}
