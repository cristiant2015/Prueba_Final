/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo.trabajo;

/**
 *
 * @author victor_h2
 */
import java.util.Scanner;

public class NuevoTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String opcion;
        int digito1;
        int digito2;
        int a = 0;

        System.out.println("buenas tardes soy una calculadora: ");
        System.out.println("ingrese una opcion: ");
        System.out.println("a)suma");
        System.out.println("b)resta");
        System.out.println("c)multiplicacion");
        System.out.println("d)division");
        System.out.println("e)salir");

        while (a == 0) {

            System.out.println("ingrese una nueva opcion: ");
            opcion = leer.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Ingrese digito 1:");
                    digito1 = leer.nextInt();
                    System.out.println("Ingrese digito 2:");
                    digito2 = leer.nextInt();
                    int suma = digito1 + digito2;

                    System.out.println("La suma es: " + suma);
                    System.out.println("");
                    leer.nextLine();
                    break;
                case "b":
                    System.out.println("Ingrese digito 1:");
                    digito1 = leer.nextInt();
                    System.out.println("Ingrese digito 2:");
                    digito2 = leer.nextInt();
                    int resta = digito1 - digito2;

                    System.out.println("La resta es: " + resta);
                    System.out.println("");
                    leer.nextLine();
                    break;
                case "c":
                    System.out.println("Ingrese digito 1:");
                    digito1 = leer.nextInt();
                    System.out.println("Ingrese digito 2:");
                    digito2 = leer.nextInt();
                    int multiplicacion = digito1 * digito2;

                    System.out.println("La multiplicion es: " + multiplicacion);
                    System.out.println("");
                    leer.nextLine();
                    break;

                case "d":
                    System.out.println("Ingrese digito 1:");
                    digito1 = leer.nextInt();
                    System.out.println("Ingrese digito 2:");
                    digito2 = leer.nextInt();
                    int division = digito1 / digito2;

                    System.out.println("La division es: " + division);
                    System.out.println("");
                    leer.nextLine();

                    break;

                case "e":
                    System.out.println("¿Desea Salir? s/n");
                    String salir = leer.nextLine();
                    if (salir.equals("s")) {
                        System.out.println("Muchas gracias por utilizar nuestra aplicacion :-)");
                        a = 1;
                    } else {
                        a = 0;
                    }
                    break;
            }

        }
    }

}
