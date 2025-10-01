package Ejercicio3;

//Padre o superclase Moneda, de ella se heredan los campos y metodos respectivos
//La clase fue definida como abstracta para dejar "metodos genericos" que seran implementados por los hijos
public abstract class Moneda {
    protected double valor; // Al ser superclase, se utiliza acceso protected

    public Moneda(double valor) {
        this.valor = valor;
    }

    // Metodo que genera la dependecia de clases: Moneda -- TipoCambio
    // Se define como metodo abstracto para que los hijos puedan reescribir el
    // metodo e implementarlo como se necesite
    abstract double conversion(TipoCambio tipoCambio);
}
