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
