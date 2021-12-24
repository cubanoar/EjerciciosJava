import java.util.Scanner;

public class CalcularLongituCircunferencia {
    /*Pedir el radio de una circunferencia y calcular su longitud.*/
    public static void main(String[] args) {
        // longitud y radio
        double l,r;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio de una circunferencia: ");
        r = sc.nextDouble();
        l = 2*Math.PI*r;
        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
    }
}
