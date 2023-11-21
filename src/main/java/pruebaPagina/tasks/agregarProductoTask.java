package pruebaPagina.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pruebaPagina.interactions.esperaExplicita;
import java.io.IOException;

import static pruebaPagina.userInterfaces.agregarProductoUI.*;

public class agregarProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        try {
            actor.attemptsTo(
                    Click.on(PRIMER_PRODUCTO),
                    esperaExplicita.enSegundos(3),
                    Click.on(AGREGAR_PRODUCTO),
                    esperaExplicita.enSegundos(4),
                    Click.on(INICIO),
                    Click.on(SEGUNDO_PRODUCTO),
                    esperaExplicita.enSegundos(3),
                    Click.on(TERCER_PRODUCTO),
                    esperaExplicita.enSegundos(3),
                    Click.on(CUARTO_PRODUCTO),
                    esperaExplicita.enSegundos(3),
                    Click.on(QUINTO_PRODUCTO)
            );



        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}
