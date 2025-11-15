package guru.qa.allure;

import org.junit.jupiter.api.Test;
import tests.TestBase;

public class StepTest extends TestBase {
    private static final String link = "Blackcourse/Auto_test_demoqa";
    private static final String nameOfBug = "Bug";

    @Test
    public void simpleStepTest() {
        GitHubSteps gitHubStep = new GitHubSteps();
        gitHubStep.openRepoPage(link);
        gitHubStep.openIssueTab();
        gitHubStep.checkBugByName(nameOfBug);
    }
}