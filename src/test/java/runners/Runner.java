package runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
@CucumberOptions(
        glue = "stepdefinitions",
        features = "src/test/resource/features/firstFeature.feature",
        tags = "@mytags"
)
public class Runner {

}
