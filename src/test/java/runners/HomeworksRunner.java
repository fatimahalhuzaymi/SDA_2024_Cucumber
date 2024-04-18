package runners;


import io.cucumber.junit.CucumberOptions;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
@CucumberOptions(
        glue = "stepdefinitions",
        features = "src/test/resource/features/HW2.feature",
        tags = "@mytags"



)
public class HomeworksRunner {
}
