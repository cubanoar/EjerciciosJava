import java.util.Scanner;

public class PositivoOnegativo {
    //Pedir un número e indicar si es positivo o negativo.
    public static void main(String[] args) {
        int num;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        if( num < 0)
            System.out.println("Negativo");
        else
            System.out.println("Positivo");

    }
}
