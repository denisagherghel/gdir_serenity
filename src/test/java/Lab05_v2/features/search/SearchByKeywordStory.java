package Lab05_v2.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Lab05_v2.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public lab05.steps.serenity.VVSSEndUserSteps denisa;

    @Issue("#WIKI-1")
    @Test
    public void adding_correct_input_for_question() {

        denisa.is_the_home_page();
        denisa.adds("Added with serenity?", "1)dsalm", "2)kdjna", "3)dsa",
                "1","OOP");
        denisa.should_see_succes();

    }

    @Test
    public void adding_incorrect_input_for_question() {
        denisa.is_the_home_page();
        denisa.adds("Added with serenity", "1)dsalm", "2)kdjna", "3)dsa",
                "1","OOP");
        denisa.should_see_error("Ultimul caracter din enunt nu e '?'!");
    }

} 