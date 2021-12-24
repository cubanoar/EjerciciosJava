import java.util.Scanner;

public class CalculoAreaCirculo {
    /*Pedir el radio de un círculo y calcular su área. A=PI*r^2.*/
    public static void main(String[] args) {
        // área y radio
        double a,r;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio de un circulo: ");
        r=sc.nextDouble();
        // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        a=Math.PI*(r*r);
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
    }
}
