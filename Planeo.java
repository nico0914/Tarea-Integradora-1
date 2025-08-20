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
* Entradas: 
* Salidas:
*
*Ejemplo: 
*/

import java.util.Scanner;

public class Planeo {

     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Ingrese el código del curso");
        numero1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el nombre del curso");
        numero1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el número de créditos que tiene el curso ");
        numero1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el nombre del profesor asignado al curso");
        numero1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el número o nombre del salón donde se dicta el curso");
        numero1 = entrada.nextDouble();
        entrada.nextLine();
     }

}