package Ejercicio3;

//Clase TipoCambio que posee unicamente un metodo para convertir las monedas respectivas
public class TipoCambio {
    double obtenerValorCambio(String tipoCambio, double cantidadDinero) {
        double factorConversion = 0;
        switch (tipoCambio) {
            case "colones":
                factorConversion = 0.002;
                break;
            case "dolares":
                factorConversion = 503.55;
                break;
        }
        return cantidadDinero * factorConversion;
    }
}
