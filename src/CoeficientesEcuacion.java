import java.util.Scanner;

public class CoeficientesEcuacion {

    /*
    Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
    debe indicarlo.
     */
    public static void main(String[] args) {
        // coeficientes ax^2+bx+c=0
        double a,b,c;
        // soluciones y determinante
        double x1,x2,d;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer coeficiente (a):");
        a = sc.nextDouble();
        System.out.println("Introduce el segundo coeficiente: (b):");
        b = sc.nextDouble();
        System.out.println("Introduce el tercer coeficiente: (c):");
        c = sc.nextDouble();
        // calculamos el determinante
        d=((b*b)-4*a*c);
        if(d<0)
            System.out.println("No existen soluciones reales");
        else{
            /* queda confirmar que a sea distinto de 0.
               si a=0 nos encontramos una división por cero.*/
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        }
    }
}
