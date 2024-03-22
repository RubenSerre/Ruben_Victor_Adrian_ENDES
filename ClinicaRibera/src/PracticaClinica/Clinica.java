package PracticaClinica;

import java.util.ArrayList;
import java.util.Scanner;


public class Clinica implements EntradasUsuario{
	private ArrayList<Profesionales>medicos;
	private ArrayList<Pacientes> pacientesEspera;
	
	public Clinica() {
        medicos = new ArrayList<>();
        pacientesEspera = new ArrayList<>();
    }

   

    public void añadirMedico(Profesionales medico) {
        medicos.add(medico);
    }

    public Profesionales obtenerMedico(int indice) {
        return medicos.get(indice);
    }

    public void añadirPacienteEspera(Pacientes paciente) {
        pacientesEspera.add(paciente);
    }

    public Pacientes obtenerPacienteEspera(int indice) {
        return pacientesEspera.get(indice);
    }

    @Override
    public boolean esEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

 
    public int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir paciente a la lista de espera");
            System.out.println("2. Atender siguiente paciente");
            System.out.print("Opción: ");
            String input = scanner.nextLine();

            if (esEntero(input)) {
                opcion = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Por favor, introduzca un número válido.");
            }
        } while (true);

        return opcion;
    }

   
    public void simularDiaClinica() {
        Scanner scanner = new Scanner(System.in);
        int opcion=0;

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                	
                	break;
                case 4:
                	
                	break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (true);
    }
}
