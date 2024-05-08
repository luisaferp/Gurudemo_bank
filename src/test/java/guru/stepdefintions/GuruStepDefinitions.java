package guru.stepdefintions;

import guru.questions.VerificarSesion;
import guru.task.LoginSesion;
import guru.task.OpenTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class GuruStepDefinitions {
@Before
public void setStage () {OnStage.setTheStage(new OnlineCast());}

    @Given("que luisa ingresa a guru")
    public void queLuisaIngresaAGuru() {
        OnStage.theActorCalled("luisa").wasAbleTo(OpenTask.thepage());
    }

    @When("digita la credenciales")
    public void digitaLaCredenciales() {
    OnStage.theActorInTheSpotlight().attemptsTo(LoginSesion.onThePage());
    }

    @Then("Verifico que inicio correctamente")
    public void verificoQueInicioCorrectamente() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarSesion.thePage(), Matchers.equalTo("New Customer")));
    }
}
