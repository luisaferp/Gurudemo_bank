package guru.questions;


import guru.userinterface.GuruLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarSesion implements Question {
    public static VerificarSesion thePage() {
        return new VerificarSesion();
    }



    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(GuruLogin.MENSAJE_INTERNO).answeredBy(actor);
    }
}
