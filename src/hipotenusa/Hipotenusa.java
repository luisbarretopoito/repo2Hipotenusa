/*
 * Cálculo de la Hipotenusa de un triángulo rectángulo.
 */
package hipotenusa;

import java.util.Scanner;

/**
 *
 * @author luisbarretopoito
 */
public class Hipotenusa {

    public static void main(String[] args) {

        double catetoa, catetob, hipotenusa;
        Scanner scanner = new Scanner(System.in);

        //Solicitud de datos para calcular el lado más largo de un triángulo rectángulo.
        System.out.print("Digite el valor del cateto a: ");
        catetoa = scanner.nextDouble();

        System.out.print("Digite el valor del cateto b: ");
        catetob = scanner.nextDouble();

        //Ecuación matemática para obtener el resultado deseado.
        hipotenusa = Math.sqrt((catetoa*catetoa)+(catetob*catetob));
        
        //Resultado del requerimiento
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
    }

}
