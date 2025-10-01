package Ejercicio1;

public class MCGasolina extends MCombustible {
    // Atributos
    private float octanage;

    // Constructor
    public MCGasolina(String marca, String numSerie, double precioM, float octanage) {
        super(marca, numSerie, precioM);
        this.octanage = octanage;
    }

    // Getters y Setters
    public float getoctanage() {
        return octanage;
    }

    public void setoctanage(float octanage) {
        this.octanage = octanage;
    }

    // Overrides
    @Override
    public String toString() {
        return "Marca" + marca + "Serie" + numSerie + "Precio" + precioM + " octanage: " + octanage;
    }

    @Override
    public void setAlgo(float algo) {
        this.octanage = algo;
    }

}
