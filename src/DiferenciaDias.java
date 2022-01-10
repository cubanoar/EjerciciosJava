import java.util.Scanner;

public class DiferenciaDias {
        /*Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30
        días.*/
    public static void main(String[] args) {

        int dia1,mes1,anio1;
        int dia2,mes2,anio2;
        int total_dias;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.println ("Fecha 1:");
        System.out.print("Introduzca día: ");
        dia1=sc.nextInt();
        System.out.print("Introduzca mes: ");
        mes1=sc.nextInt();
        System.out.print("Introduzca año: ");
        anio1=sc.nextInt();
        System.out.println ("Fecha 2:");
        System.out.print("Introduzca día: ");
        dia2=sc.nextInt();
        System.out.print("Introduzca mes: ");
        mes2=sc.nextInt();
        System.out.print("Introduzca año: ");
        anio2=sc.nextInt();
        // suponemos que las fecha introducidas son correctas
        // convertimos las dos fechas a días y calculamos la diferencia
        total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(anio2-anio1);
        System.out.println ("Días de diferencia: " + total_dias);
    }
}
