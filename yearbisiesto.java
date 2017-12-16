package pa.edu.uip;

import java.util.Scanner;

/**
 * Created by Marvin on 10/18/2017.
 */
public class yearbisiesto {
//programa que reciba un entero que represente un ano y resultado es un mensaje que diga si el ano es bisiesto
    public static void main(String[] args) {
        Scanner Biciesto = new Scanner(System.in);
        int anio;
        System.out.println("ingresar año");
        Scanner biciesto;
        anio = Biciesto.nextInt();

        if ( anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)
            System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");
    }
}
