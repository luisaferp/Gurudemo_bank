package guru.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GuruLogin {
    public static final Target TXT_USUARIO = Target.the("campo de usuario").located(By.xpath("//input[@name='uid']"));
    public static final Target TXT_CONTRASENA = Target.the("campo contraseña").located(By.xpath("//input[@name='password']"));
    public static final Target LOGUIN = Target.the("boton login").located(By.xpath("//input[@name='btnLogin']"));
    public static final Target MENSAJE_INTERNO = Target.the("mensaje pagina").located(By.xpath("//a[contains(text(),'New Customer')]"));
}
