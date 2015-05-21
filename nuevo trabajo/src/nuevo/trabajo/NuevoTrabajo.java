/*/**Aplicacion en Java que simula una calculadora que realiza operaciones basicas como: Suma-Resta-multiplicacion-division
con solo 2 digitos ( Numeros Distintos o iguales)*/
/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo.trabajo;

/**
 *
 * @author victor_h2
 *//**Importamos Clase Scanner
 */
import java.util.Scanner;

public class NuevoTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**Despues que importamos la clase scanner la ocupamos como una entrada estandar*/
        Scanner leer = new Scanner(System.in);
 /**Identificamos las variables que ocuparemos*/       
        String opcion;
        int digito1;
        int digito2;
        int a = 0;
/**Ahora le pedimos al programa que muestre en pantalla las siguientes salidas estandar conformadas
con presentacion y menu de opciones*/
        System.out.println("buenas tardes soy una calculadora: ");
        System.out.println("ingrese una opcion: ");
        System.out.println("a)suma");
        System.out.println("b)resta");
        System.out.println("c)multiplicacion");
        System.out.println("d)division");
        System.out.println("e)salir");
/**Ahora ocuparemos la estructura de repeticion while para que el programa siga pidiendo opciones 
asta que se ingrese un correcta ( Valida ) */
        while (a == 0) {
  
            System.out.println("ingrese una nueva opcion: ");
            opcion = leer.nextLine();
/**Aqui ocupamos la estructura CASE para aplicar cada una de las siguientes opciones segun cual se a seleccionada*/
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

}/**Integrantes: Victor Andrade
                Cristian Tapia
                Henry Matus*/
