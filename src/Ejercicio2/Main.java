package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//CLASE MAIN PARA EJECUTAR EL CODIGO
public class Main {

    // ELEMENTOS GLOBALES PARA QUE LOS DIFERENTES METODOS PUEDAN ACCESAR
    static ContenedorL contenedor = new ContenedorL();
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // METODO MAIN DEL PROGRAMA
    public static void main(String[] args) throws IOException {
        int opcion = 0;
        do {
            menu();
            opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    ingresarPaciente();
                    break;
                case 2:
                    eliminarPacientePorFecha();
                    break;
                case 3:
                    mostrarPacientes();
                    break;
                case 4:
                    ordenarPacientesPorFecha();
                    mostrarPacientes();
                    break;
                case 0:
                    System.out.println("Saliendo de sistema");
                    break;
                default:
                    System.out.println("Tiene que digitar una opcion correcta");
                    break;
            }

        } while (opcion != 0);
    }

    // METODO PARA MOSTRAR MENU
    static public void menu() {
        System.out.println("MENU DE HOSPITAL");
        System.out.println("1. Agregar pacientes");
        System.out.println("2. Eliminar paciente por fecha");
        System.out.println("3. Desplegar información de pacientes");
        System.out.println("4. Ordenar pacientes por fecha");
        System.out.println("0. Salir");
        System.out.println("Digite la opción que desea");
    }

    // METODO PARA LEER Y VALIR OPCION DE USUARIO
    static int leerOpcion() throws IOException {
        try {
            return Integer.parseInt(in.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Tiene que ditar una opcion correcta");
            return -1;
        }
    }

    // METODO PARA REGISTRAR LA INFORMACION DEL USARIO
    static void ingresarPaciente() throws IOException {
        System.out.print("Ingrese cédula: ");
        String cedula = in.readLine();
        System.out.print("Ingrese nombre: ");
        String nombre = in.readLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = in.readLine();
        System.out.print("Ingrese número de comorbilidades: ");
        int comorbilidades = Integer.parseInt(in.readLine());
        System.out.print("Ingrese día de ingreso: ");
        int dia = Integer.parseInt(in.readLine());
        System.out.print("Ingrese mes de ingreso: ");
        int mes = Integer.parseInt(in.readLine());
        System.out.print("Ingrese año de ingreso: ");
        int anio = Integer.parseInt(in.readLine());
        Fecha fechaIngreso = new Fecha(dia, mes, anio);
        PacienteCovid paciente = new PacienteCovid(cedula, nombre, telefono, comorbilidades, fechaIngreso);
        contenedor.ingresaDePrimero(paciente);
    }

    // METODO PARA ELIMINAR USUARIO SEGUN FECHA, IMPORTANTE QUE META LA FECHA EN EL
    // FORMATO QUE SE SOLICITA
    static void eliminarPacientePorFecha() throws IOException {
        System.out.print("Ingrese fecha a eliminar (formato: d/m/a): ");
        String fecha = in.readLine();
        if (contenedor.eliminarPacientePorFecha(fecha)) {
            System.out.println("Paciente eliminado correctamente");
        } else {
            System.out.println("Paciente no eliminado");
        }
    }

    // METODO PARA MOSTRAR PACIENTES
    static void mostrarPacientes() {
        System.out.println(contenedor.toString());
    }

    // METODO PARA ORDENAR A LOS PACINENTES SEGUN LA FECHA DE INGRESO
    static void ordenarPacientesPorFecha() {
        contenedor.ordenarPacientesPorFecha();
    }

}
