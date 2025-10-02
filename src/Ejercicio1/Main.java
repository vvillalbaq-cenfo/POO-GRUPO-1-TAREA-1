package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        /* Creacion de los tres tipos de Motores **/
        MElectrico motorE = new MElectrico("Toshiba", "EGP5", 5000, 2.5f);
        MCGasolina motorG = new MCGasolina("Nissan", "N300", 3500, 98f);
        MCDiesel motorD = new MCDiesel("Cummis", "C789", 25000, 200f);

        /* Impresion de los atributos de los motores **/
        System.out.println(motorE);
        System.out.println(motorG);
        System.out.println(motorD);

        /* Cambio de Atributos mediante el flotante **/
        motorE.setAlgo(1.5f);
        motorG.setAlgo(90f);
        motorD.setAlgo(180.0f);

        /* Impresion de los atributos de los motores despues del cambio **/
        System.out.println("Modificancion de atributos");
        System.out.println(motorE.toString());
        System.out.println(motorG.toString());
        System.out.println(motorD.toString());

    }
}
