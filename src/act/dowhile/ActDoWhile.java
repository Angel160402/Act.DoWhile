/*
Realice los siguientes programas, en el lenguaje Java.
 */
package act.dowhile;

import java.util.Scanner;

/**
 *
 * @author ÁNGEL_HIDALGO
 */
public class ActDoWhile {

    static void encabezados() {
        System.out.println("UNIVERSIDAD AUTÓNOMA DE CAMPECHE");
        System.out.println("FACULTAD DE INGENIERÍA");
        System.out.println("INGENIERÍA EN SISTEMAS COMPUTACIONALES");

    }

    static void separador() {
        System.out.println("[-----------------------------------------------]");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        encabezados();
        /* separador();
        
      //1.- Calcular el factorial del 1 al 10.
      System.out.println("[----------EJERCICIO 1-------------]");
      int mult = 1;
       int constant = 0;
       while(constant < 10){
           constant++;
           mult = mult * constant;
           
      System.out.println("EL NÚMERO ES:" + constant);
      }
      System.out.println("EL FACTORIAL ES:" + mult);*/

 /* separador();
        //2.- Calcular la media de la suma del 0 hasta el número introcucido por el usuario
        System.out.println("[----------EJERCICIO 2-------------]");
        System.out.println("INTRODUCE LOS NÚMERO PARA CALCULAR SU MEDIA:");
        
       int valor = 1;
       int med = 0;
       double suma = 0;
      
       while (valor<=5){
           System.out.println("INGRESE SU VALOR" + " " + valor);
           med = teclado.nextInt();
           valor++;
           suma += med;
       }
        System.out.println("LA MEDIA DEL SU NÚMERO ES:" +(suma/5) );*/
        //3.- Pedir un número y leer n veces números, realizar la suma de los números, sacar el promedio 
        //y determinar cual número introducido es el mayor y cual el menor, y la distancia numérica entre ellos.
        System.out.println("[----------EJERCICIO 3-------------]");
       
        System.out.print("INTRODUCE TU PRIMER VALOR: ");
        int valor2 = 0;
        Scanner usuario2 = new Scanner(System.in);
        valor2 = usuario2.nextInt();

        System.out.print("INTRODUCE TU SEGUNDO VALOR: ");
        int valor3 = 0;
        Scanner usuario3 = new Scanner(System.in);
        valor3 = usuario3.nextInt();

        int suma = valor2 + valor3;
        System.out.println("LA SUMA DE " + valor2 + "  MÁS " + valor3 + " ES: " + suma);

        int promedio = suma / 2;

        System.out.println("EL PROMEDIO ES: " + promedio);

        if (valor2 > valor3) {
            System.out.println(valor2 + " ES MAYOR QUE " + valor3);
        }
        if (valor3 > valor2) {
            System.out.println(valor3 + " ES MAYOR QUE " + valor2);
        }
        if (valor2 == valor3) {
            System.out.println("TUS VALORES SON IGUALES");
        }

        if (valor2 < valor3) {
            System.out.println("LA DISTANCIA ES: ");
            int d = valor2;
            while (d < valor3) {
                d++;
                System.out.println(d);

            }
        }
        if (valor3 < valor2) {
            System.out.println("DISTANCIA: ");
            int e = valor3;
            while (e < valor2) {
                e++;
                System.out.println(e);
            }
        }

    }
}
