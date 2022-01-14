package todosPostsUser;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@todosApi or @usersApi or @postsApi",plugin = {"pretty", "html:target/cucumber/report.html"})
public class RunCuke {
}
