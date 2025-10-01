package Ejercicio1;

public class MCDiesel extends MCombustible {
    // Atributos
    private float potencia;

    // Constructor
    public MCDiesel(String marca, String numSerie, double precioM, float potencia) {
        super(marca, numSerie, precioM);
        this.potencia = potencia;
    }

    // Getters y Setters
    public float getpotencia() {
        return potencia;
    }

    public void setpotencia(float potencia) {
        this.potencia = potencia;
    }

    // Overrides
    @Override
    public String toString() {
        return "Marca" + marca + "Serie" + numSerie + "Precio" + precioM + " Potencia: " + potencia;
    }

    @Override
    public void setAlgo(float algo) {
        this.potencia = algo;
    }
}
