package guru.task;

import guru.userinterface.GuruLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginSesion implements Task {
    private GuruLogin guruLogin;
    public static LoginSesion onThePage() {
        return Tasks.instrumented(LoginSesion.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("mngr569993").into(GuruLogin.TXT_USUARIO),
                Enter.theValue("ypybuva").into(GuruLogin.TXT_CONTRASENA),
                Click.on(GuruLogin.LOGUIN)

        );
    }
}
