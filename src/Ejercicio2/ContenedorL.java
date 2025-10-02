package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//CLASE QUE MODELA LA LISTA DE PACIENTES DEL HOSPITAL
public class ContendorL {

    // ATRIBUTO
    private ArrayList<PacienteCovid> listaPacientes;

    // CONSTRUCTOR (SE PUEDE NOTAR LA RELACION DE COMPOSICION PORQUE EN EL
    // CONSTRUCTOR SE INICIALIZA EL ARRAY)
    public ContendorL() {
        listaPacientes = new ArrayList<>();
    }

    // METODO PARA AGREGAR UN PACIENTE A LA LISTA
    public void ingresaDePrimero(PacienteCovid pacienteAIngresar) {
        listaPacientes.add(pacienteAIngresar);
    }

    // METODO PARA ELIMINAR PACIENTE SEGUN UNA FECHA ESTABLECIDA ()
    public boolean eliminarPacientePorFecha(String fecha) {
        boolean resultado = false;
        for (int i = 0; i < listaPacientes.size(); i++) {
            if (listaPacientes.get(i).getFechaIngreso().toString().equals(fecha)) {
                listaPacientes.remove(i);
                resultado = true;
                break; // Evitar ConcurrentModificationException
            }
        }
        return resultado;
    }

    // METODO PARA ORDENAR LA LISTA SEGUN LA FECHA DE INGRESO
    public void ordenarPacientesPorFecha() {
        Collections.sort(listaPacientes, new Comparator<PacienteCovid>() {
            public int compare(PacienteCovid p1, PacienteCovid p2) {
                Fecha f1 = p1.getFechaIngreso();
                Fecha f2 = p2.getFechaIngreso();
                if (f1.getAnio() != f2.getAnio()) {
                    return f1.getAnio() - f2.getAnio();
                }
                if (f1.getMes() != f2.getMes()) {
                    return f1.getMes() - f2.getMes();
                }
                return f1.getDia() - f2.getDia();
            }
        });
    }

    // TO STRING
    public String toString() {
        return listaPacientes.toString();
    }

}
