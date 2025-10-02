package Ejercicio2;
//CLASE PARA MODELAR PACIENTES
public class PacienteCovid {

    //ATRIBUTOS
    private String cedula;
    private String nombre;
    private String telefono;
    private int numComorbilidades;
    private Fecha fechaIngreso;

    //CONSTRUCTOR
    public PacienteCovid(String cedula, String nombre, String telefono, int numComorbilidades, Fecha fecheIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.numComorbilidades = numComorbilidades;
        this.fechaIngreso = fecheIngreso;
    }

    //SETTERS
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNumComorbilidades(int numComorbilidades) {
        this.numComorbilidades = numComorbilidades;
    }
    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    //GETTERS
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getNumComorbilidades() {
        return numComorbilidades;
    }
    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    //TO STRING
    public String toString() {
        return "Cédula: " + cedula + "\n" +
                "Nombre: " + nombre + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Comorbilidades: " + numComorbilidades + "\n" +
                "Fecha de ingreso: " + fechaIngreso.toString() + "\n";
    }

}
