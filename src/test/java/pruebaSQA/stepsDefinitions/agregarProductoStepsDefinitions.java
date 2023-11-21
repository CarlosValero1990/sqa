package pruebaSQA.stepsDefinitions;

import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import pruebaPagina.models.constantes;

public class agregarProductoStepsDefinitions {

    @Dado("que el usuario ingresa a la pagina principal")
    public void queElUsuarioIngresaALaPaginaPrincipal() {
        WebDriverManager.chromedriver().setup();
        OnStage.theActorCalled(constantes.ACTOR).wasAbleTo(
                Open.url("https://sanangel.com.co/")
        );

    }
    @Cuando("seleccione el producto")
    public void seleccioneElProducto() {

    }
    @Entonces("lo agrega al carrito de compras")
    public void loAgregaAlCarritoDeCompras() {

    }
}
