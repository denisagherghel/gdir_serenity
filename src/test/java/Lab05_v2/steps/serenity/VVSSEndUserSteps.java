package lab05.steps.serenity;

import lab05.pages.VVSSPage;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class VVSSEndUserSteps {
    VVSSPage vvssPage;
    @Step
    public void enters(String enunt, String varianta1, String varianta2,
                       String varianta3, String variantaCorecta, String domeniu) {
        vvssPage.enter_enunt(enunt);
        vvssPage.enter_varianta1(varianta1);
        vvssPage.enter_varianta2(varianta2);
        vvssPage.enter_varianta3(varianta3);
        vvssPage.enter_variantaCorecta(variantaCorecta);
        vvssPage.enter_domeniu(domeniu);
    }

    @Step
    public void starts_add() {
        vvssPage.add_question();
    }

    @Step
    public void should_see_error(String error) {
        assertTrue(vvssPage.getErrorMessage().contains(error));
    }

    @Step
    public void should_see_succes() {
        assertTrue(vvssPage.getSuccessMessage().contains("S-a adaugat intrebarea!"));
    }

    @Step
    public void is_the_home_page() {
        vvssPage.open();
    }

    @Step
    public void adds(String enunt, String varianta1, String varianta2,
                     String varianta3, String variantaCorecta, String domeniu) {
        vvssPage.setImplicitTimeout(30, TimeUnit.SECONDS);
        enters(enunt, varianta1, varianta2, varianta3, variantaCorecta, domeniu);
        starts_add();
    }
}
