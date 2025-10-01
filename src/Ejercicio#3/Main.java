package Ejercicio3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //Variable para lectura de datos accesible para todos los metodos de la clase
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int opcionUsuario = 0; //Variable de opcion de usuario
        //Ejecución del programa
        do {
            menuPrograma();
            //Manejo de tipo de dato para evitar errores de usuario
            try {
                opcionUsuario = Integer.parseInt(in.readLine());
            }  catch (NumberFormatException e) {
                System.out.println("Digite una opcion valida");
            }
            //Posibles opciones de usuario
            switch (opcionUsuario) {
                case 1:
                    colonesDolares(); //metodo para cambiar de colones a dolares
                    break;
                case 2:
                    dolaresColones(); //metodo para cambiar de dolares a colones
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Digite una opcion correcta");
                    break;
            }
        } while (opcionUsuario != 3);
    }
    //Metodo para imprimir menu de opciones
    static void menuPrograma() {
        System.out.println("--CONVERTIDOR DE MONEDAS--");
        System.out.println("1. Convertir colones a dolares");
        System.out.println("2. Convertir dolares a colones");
        System.out.println("3. Salir del sistema");
        System.out.println("Digite la opcion que desea:");
    }
    //Metodo para cambiar de colones a dolares
    static void colonesDolares() throws IOException {
        double montoConvertir = 0;
        System.out.println("Digite la cantidad de colones:");
        try {
            montoConvertir = Double.parseDouble(in.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Digite un monto adecuado");
        }
        Colon nuevoColon = new Colon(montoConvertir);
        TipoCambio tipoCambioColon = new TipoCambio();
        System.out.println("Sus ₡" + montoConvertir + " equivalen a $" + nuevoColon.conversion(tipoCambioColon));
    }
    //Metodo para cambiar de dolares a colones
    static void dolaresColones() throws IOException {
        double montoConvertir = 0;
        System.out.println("Digite la cantidad de dolares:");
        try {
            montoConvertir = Double.parseDouble(in.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Digite un monto adecuado");
        }
        Dolar nuevoDolar = new Dolar(montoConvertir);
        TipoCambio tipoCambioDolar = new TipoCambio();
        System.out.println("Sus $" + montoConvertir + "equivalen a ₡" + nuevoDolar.conversion(tipoCambioDolar));
    }
}
