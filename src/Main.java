import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora para notas de estudiantes en una clase");
        System.out.print("Por favor, ingrese la cantidad de estudiantes:");

        Scanner scanner = new Scanner(System.in);
        int nEstudiantes = scanner.nextInt();
        System.out.println("Número de estudiantes = " + nEstudiantes);

        System.out.println();

        int[] calificaciones = new int[nEstudiantes];
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingresa la calificación del estudiante:");

            int calificacion = scanner.nextInt();
            calificaciones[i] = calificacion;

            System.out.println("Se ingresó la calificación: " + calificacion);
            System.out.println();
        }

        boolean runProgram = true;
        while (runProgram) {
            System.out.println();
            System.out.println("¿Qué te gustaría hacer con las calificaciones?");
            System.out.println("Ingresa el número correspondiente.");
            System.out.println("1 ) Calcular el promedio.");
            System.out.println("2 ) Encontrar la calificación más alta.");
            System.out.println("3 ) Encotrar la calificación más baja.");
            System.out.println("4 ) Salir del programa.");
            int queHacer = scanner.nextInt();

            switch (queHacer) {
                case 1 -> {
                    double suma = 0;
                    for (int value : calificaciones) {
                        suma += value;
                    }
                    double promedio = suma / calificaciones.length;
                    System.out.println("El promedio es: " + promedio);
                }
                case 2 -> {
                    int cAlta = 0;
                    for (int value : calificaciones) {
                        if (value > cAlta) cAlta = value;
                    }
                    System.out.println("La calificación más ALTA es: " + cAlta);
                }
                case 3 -> {
                    int cBaja = 10;
                    for (int value : calificaciones) {
                        if (value < cBaja) cBaja = value;
                    }
                    System.out.println("La calificación más BAJA es: " + cBaja);
                }
                case 4 -> {
                    System.out.println("Saliendo del programa.");
                    runProgram = false;
                    scanner.close();
                }
                default -> {
                    System.out.println("Elige una opción válida.");
                    System.out.println("¿Qué te gustaría hacer con las calificaciones?");
                    System.out.println();
                }
            }
        }
    }
}