package Ejercicio1;

public abstract class Motor {
    // Atributos
    protected String marca;
    protected String numSerie;
    protected double precioM;

    // Constructor
    public Motor(String marca, String numSerie, double precioM) {
        this.marca = marca;
        this.numSerie = numSerie;
        this.precioM = precioM;
    }

    // Getters y Setters
    public abstract void setAlgo(float algo);
    public abstract String toString();

}
