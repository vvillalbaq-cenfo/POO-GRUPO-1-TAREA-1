package Ejercicio3;
//Clase hija de Moneda
public class Colon extends Moneda {
    public Colon(double valorIngresado) {
        super(valorIngresado);
    }
    //Sobreescritura de metodo para dolares
    @Override
    double conversion(TipoCambio tipoCambio) {
        return tipoCambio.obtenerValorCambio("colones",valor);
    }
}
