import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, acu1 = 0, acu2 = 0;
        double n1, n2, n3, notaf, suma = 0;
      
        System.out.println("\n**************************************");
        System.out.println("**********Calculo De Notas************");
        System.out.println("**************************************\n");

        do {
            System.out.print("Introduce Cantidad De Estudiantes A Registrar: ");
            n = sc.nextInt();  //n contiene el número de estudiantes
        } while (n <= 0); //repetir mientras que el valor de n sea <= 0

        do {
            System.out.print("\n*****Ingrese Notas Del Estudiante 1*****\n");
            System.out.print("Nota del Parcial: ");
            n1 = sc.nextDouble(); // leemos la primera nota         
        } while (n1 < 0.0 || n1 > 5.0);
          n1 = n1*0.5;

        do {
            System.out.print("Nota de Quices: ");
            n2 = sc.nextDouble(); // leemos la segunda nota
        } while (n2 < 0.0 || n2 > 5.0);
          n2 = n2*0.3;

       do {
            System.out.print("Nota de los Trabajos y Talleres: ");
            n3 = sc.nextDouble(); // leemos la tercera nota         
        } while (n3 < 0.0 || n3 > 5.0);
          n3 = n3*0.2;

        notaf = n1+n2+n3;
            
        suma = suma + notaf; //la sumamos al acumulador

        if (notaf > 2.9 ){  // Verififcamos que estudiantes que aprobaron la materia
            acu1 ++;
            System.out.printf("\n+ La Nota Final Es " +notaf+ "\n");
            System.out.print("\n+ El Estudiante A Aprobado\n");
            
        } else if (notaf < 3.0 ) {
            acu2 ++;
            System.out.printf("\n+ La Nota Final Es " +notaf+ "\n");
            System.out.print("\n+ El Estudiante A Desaprobado\n");
        }
       
        for (int i = 2; i <= n; i++) {  // leemos el resto de notas desde el estudiante  2 hasta el estudiante n         
            System.out.print("\n*****Ingrese Notas del Estudiantes " + i + "***** \n");

            do {
                System.out.print("Nota del Parcial: ");
                n1 = sc.nextDouble(); // leemos la primera nota         
            } while (n1 < 0.0 || n1 > 5.0);
            n1 = n1*0.5;

            do {
                System.out.print("Nota de Quices: ");
                n2 = sc.nextDouble(); // leemos la segunda nota
            } while (n2 < 0.0 || n2 > 5.0);
            n2 = n2*0.3;

            do {
                System.out.print("Nota de los Trabajos y Talleres: ");
                n3 = sc.nextDouble(); // leemos la tercera nota         
            } while (n3 < 0.0 || n3 > 5.0);
            n3 = n3*0.2;

            notaf = n1+n2+n3;
          
            suma = suma + notaf; // sumamos la nota al acumulador

             if (notaf > 2.9 ){  // Estudiantes que aprobaron la materia
              acu1 ++;
              System.out.printf("\n+ La Nota Final Es " +notaf+ "\n");
              System.out.print("\n+ El Estudiante A Aprobado\n");
            
            } else if (notaf < 3.0 ) {
              acu2 ++;
              System.out.printf("\n+ La Nota Final Es " +notaf+ "\n");
              System.out.print("\n+ El Estudiante A Desaprobado\n");
            }
          
        }

        // Se Muestran los resultados
        System.out.printf("\n+ Aprobaron "+ acu1 + " Estudiante(s)\n");
        System.out.printf("\n+ Desaprobaron "+ acu2 + " Estudiante(s)\n");
        System.out.printf("\n+ Nota Promedio Del Curso: %.2f %n " , suma/n);
    }
}

