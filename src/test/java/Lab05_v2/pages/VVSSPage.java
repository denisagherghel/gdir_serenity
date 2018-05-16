package lab05.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.concurrent.TimeUnit.SECONDS;

@DefaultUrl("http://localhost:3000/landing")
public class VVSSPage extends PageObject {

    @FindBy(id="enuntId")
    private WebElementFacade enuntTextBox;

    @FindBy(id="varianta1Id")
    private WebElementFacade varianta1TextBox;

    @FindBy(id="varianta2Id")
    private WebElementFacade varianta2TextBox;

    @FindBy(id="varianta3Id")
    private WebElementFacade varianta3TextBox;

    @FindBy(id="variantaCorectaId")
    private WebElementFacade variantaCorectaTextBox;

    @FindBy(id="domeniuId")
    private WebElementFacade domeniuTextBox;

    @FindBy(id="addId")
    private WebElementFacade addButton;

    public void enter_enunt(String enunt) {
        enuntTextBox.type(enunt);
    }

    public void enter_varianta1(String varianta1) {
        varianta1TextBox.type(varianta1);
    }

    public void enter_varianta2(String varianta2) {
        varianta2TextBox.type(varianta2);
    }

    public void enter_varianta3(String varianta3) {
        varianta3TextBox.type(varianta3);
    }

    public void enter_variantaCorecta(String variantaCorecta) {
        variantaCorectaTextBox.type(variantaCorecta);
    }

    public void enter_domeniu(String domeniu) {
        domeniuTextBox.type(domeniu);
    }

    public void add_question() {
        addButton.click();
    }

    public String getSuccessMessage() {
        WebElementFacade successMessage = find(By.id("succesMessage"));
        return successMessage.getText();
    }

    public String getErrorMessage() {
        WebElementFacade errorMessage = find(By.id("errorMessage"));
        return errorMessage.getText();
    }
}
