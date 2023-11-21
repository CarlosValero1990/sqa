package pruebaPagina.interactions;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

public class esperaExplicita implements Interaction {
    private int segundos;
    public esperaExplicita(int segundos) {
        this.segundos = segundos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos*1000);
        } catch (Exception e) {
        }
    }
    public static Performable enSegundos(int segundos){
        return Instrumented.instanceOf(esperaExplicita.class).withProperties(segundos);
    }
}

