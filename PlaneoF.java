//ANALISIS:El área de acompañamiento estudiantil de la Universidad Icesi ha identificado que muchos de los estudiantes
//tienen dificultades para planificar las actividades académicas de sus cursos durante el desarrollo del semestre. 
//Estas actividades incluyen tareas, talleres, exámenes, proyectos y otras entregas que tienen un impacto en la nota final de cada curso.
//En muchos casos, los estudiantes no tienen claridad sobre el peso de cada actividad ni sobre el calendario de entregas, lo que afecta su rendimiento académico.
/*
*El programa debe: permitir al usuario registrar UN solo curso.
*El sistema debe garantizar que el porcentaje acumulado de todas las actividades de un curso sea del 100%.
*Se debe validar que al registrar la nota el valor numérico está en el rango establecido.
*Se debe presentar la lista completa 
*de actividades del curso (para cada una de ellas: el nombre, el peso (porcentaje) y la nota registrada), y finalmente el cálculo del promedio ponderado del curso.
* Entradas: curso : String, actividades : String, notas de las actividades : double, opcion de menu : int.
* Salidas: mensaje de confirmación, advertencia si se excede el 100 %, Listado con la información, mensaje de salida, promedio ponderado del curso.
*/

import java.util.Scanner;

public class Planeo {

    // Datos del curso
    static String codigoCurso = "";
    static String nombreCurso = "";
    static int creditosCurso = 0;
    static String profesor = "";
    static String salon = "";

    // Datos de las actividades (máx 5)
    static String[] nombresActividades = new String[5];
    static String[] fechasActividades = new String[5]; // Guardadas como texto simple
    static double[] porcentajesActividades = new double[5];
    static double[] notasActividades = new double[5];
    static int cantidadActividades = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENU PLANE0 =====");
            System.out.println("1. Registrar curso");
            System.out.println("2. Registrar actividades");
            System.out.println("3. Registrar notas");
            System.out.println("4. Ver actividades");
            System.out.println("5. Consultar promedio");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: registrarCurso(sc); break;
                case 2: registrarActividades(sc); break;
                case 3: registrarNotas(sc); break;
                case 4: verActividades(); break;
                case 5: consultarPromedio(); break;
                case 6: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción no válida.");
            }

        } while (opcion != 6);
    }

    // ===== MÉTODOS =====

    // Método para registrar curso
    public static void registrarCurso(Scanner sc) {
        System.out.print("Código del curso: ");
        codigoCurso = sc.nextLine();
        System.out.print("Nombre del curso: ");
        nombreCurso = sc.nextLine();
        System.out.print("Número de créditos: ");
        creditosCurso = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        System.out.print("Profesor: ");
        profesor = sc.nextLine();
        System.out.print("Salón: ");
        salon = sc.nextLine();

        System.out.println("Curso registrado con éxito.");
    }

    // Métodos vacíos (se completarán en los siguientes commits)
    public static void registrarActividades(Scanner sc) {
        System.out.println("Función en construcción...");
    }

    public static void registrarNotas(Scanner sc) {
        System.out.println("Función en construcción...");
    }

    public static void verActividades() {
        System.out.println("Función en construcción...");
    }

    public static void consultarPromedio() {
        System.out.println("Función en construcción...");
    }
}

    // Método para registrar actividades
    public static void registrarActividades(Scanner sc) {
        if (codigoCurso.equals("")) {
            System.out.println("Primero debe registrar un curso.");
            return;
        }

        if (cantidadActividades >= 5) {
            System.out.println("Ya se registraron 5 actividades (límite máximo).");
            return;
        }

        System.out.print("Nombre de la actividad: ");
        String nombre = sc.nextLine();
        System.out.print("Fecha de entrega (AAAA-MM-DD): ");
        String fecha = sc.nextLine();
        System.out.print("Porcentaje (%): ");
        double porcentaje = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        // Validar que no se pase de 100%
        double suma = porcentaje;
        for (int i = 0; i < cantidadActividades; i++) {
            suma += porcentajesActividades[i];
        }
        if (suma > 100) {
            System.out.println("Error: el porcentaje total excede el 100%.");
            return;
        }

        // Guardar la actividad
        nombresActividades[cantidadActividades] = nombre;
        fechasActividades[cantidadActividades] = fecha;
        porcentajesActividades[cantidadActividades] = porcentaje;
        notasActividades[cantidadActividades] = -1; // -1 = no registrada aún
        cantidadActividades++;

        System.out.println("Actividad registrada con éxito.");
    }

    // Método para visualizar actividades
    public static void verActividades() {
        if (cantidadActividades == 0) {
            System.out.println("No hay actividades registradas.");
            return;
        }

        System.out.println("\n=== ACTIVIDADES DEL CURSO " + nombreCurso + " ===");
        for (int i = 0; i < cantidadActividades; i++) {
            System.out.println((i + 1) + ". " + nombresActividades[i] +
                               " | Fecha: " + fechasActividades[i] +
                               " | Peso: " + porcentajesActividades[i] + "%");
        }
    }
    // Método para registrar notas
    public static void registrarNotas(Scanner sc) {
        if (cantidadActividades == 0) {
            System.out.println("Primero registre actividades.");
            return;
        }

        verActividades();
        System.out.print("Seleccione el número de la actividad: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion < 1 || opcion > cantidadActividades) {
            System.out.println("Actividad no válida.");
            return;
        }

        System.out.print("Ingrese la nota (0.0 a 5.0): ");
        double nota = sc.nextDouble();
        sc.nextLine();

        if (nota < 0.0 || nota > 5.0) {
            System.out.println("Nota inválida. Debe estar entre 0.0 y 5.0");
            return;
        }

        notasActividades[opcion - 1] = nota;
        System.out.println("Nota registrada con éxito.");
    }

    // Método para consultar promedio
    public static void consultarPromedio() {
        if (cantidadActividades == 0) {
            System.out.println("No hay actividades registradas.");
            return;
        }

        double promedio = 0;
        boolean notasCompletas = true;

        System.out.println("\n=== NOTAS DEL CURSO " + nombreCurso + " ===");
        for (int i = 0; i < cantidadActividades; i++) {
            System.out.println((i + 1) + ". " + nombresActividades[i] +
                               " | Peso: " + porcentajesActividades[i] + "%" +
                               " | Nota: " + (notasActividades[i] == -1 ? "Pendiente" : notasActividades[i]));

            if (notasActividades[i] == -1) {
                notasCompletas = false;
            } else {
                promedio += (notasActividades[i] * (porcentajesActividades[i] / 100));
            }
        }

        if (notasCompletas) {
            System.out.println("Promedio ponderado del curso: " + promedio);
        } else {
            System.out.println("Promedio no calculado: faltan notas.");
        }
    }
