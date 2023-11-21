package pruebaPagina.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class agregarProductoUI {
    public static final Target PRIMER_PRODUCTO = Target.the("primer producto seleccionado").locatedBy("//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']");
    public static final Target AGREGAR_PRODUCTO = Target.the("Agregar al carrito").locatedBy("//*[@class='single_add_to_cart_button button alt']");
    public static final Target INICIO = Target.the("Volver a inicio").locatedBy("//*[@class='navmenu__logo-link']");
    public static final Target SEGUNDO_PRODUCTO = Target.the("Agregar segundo producto").locatedBy("//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']");
    public static final Target TERCER_PRODUCTO = Target.the("Agregar tercer producto").locatedBy("//*[contains(text(),'Presente')]");
    public static final Target CUARTO_PRODUCTO = Target.the("Agregar segundo producto").locatedBy("//*[contains(text(),'Reino de sueños')]");
    public static final Target QUINTO_PRODUCTO = Target.the("Agregar segundo producto").locatedBy("//*[contains(text(),'Universo encantado')]");


}
