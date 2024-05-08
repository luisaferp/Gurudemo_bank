package guru.task;

import guru.userinterface.GuruPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTask implements Task {
    private GuruPage guruPage;
    public static Performable thepage() { return Tasks.instrumented(OpenTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(guruPage),
                Browser.maximize());
    }
}

