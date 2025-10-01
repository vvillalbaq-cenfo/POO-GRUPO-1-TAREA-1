package Ejercicio3;

//Clase hija de Moneda
public class Dolar extends Moneda {
    public Dolar(double valor) {
        super(valor);
    }

    // Sobreescritura de metodo para dolares
    @Override
    double conversion(TipoCambio tipoCambio) {
        return tipoCambio.obtenerValorCambio("dolares", valor);
    }
}
