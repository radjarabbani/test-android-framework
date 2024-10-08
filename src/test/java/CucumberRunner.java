import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        plugin = {
                "pretty",
                "html:report/automation-report.html"
        },
        features = {
                "classpath:features"
        }
)
public class CucumberRunner {
}
