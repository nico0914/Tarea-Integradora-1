import java.util.Scanner;

public class Planeeo {

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
