import java.util.Scanner;

public class DosNumerosIgualesOno {
    /*Pedir dos números y decir si son iguales o no.*/
    public static void main(String[] args) {
        //numero 1 y numero 2
        int num1,num2;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();
        if(num1==num2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
    }
}
