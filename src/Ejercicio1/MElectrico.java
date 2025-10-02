package Ejercicio1;
public class MElectrico extends Motor {
    // Atributos
    private float amperage;

    // Constructor
    public MElectrico(String marca, String numSerie, double precioM, float amperage) {
        super(marca, numSerie, precioM);
        this.amperage = amperage;
    }

    // Getters y Setters
    public float getAmperage() {
        return amperage;
    }
    public void setAmperage(float amperage) {
        this.amperage = amperage;
    }

    // Overrides
    @Override
    public String toString() {
        return "Marca: " + marca + ","+ " Serie: "+ numSerie + "," + " Precio: " + precioM +"$"+","+  " Amperage:  " + amperage;
    }

    @Override
    public void setAlgo(float algo) {
        this.amperage = algo;
    }
}