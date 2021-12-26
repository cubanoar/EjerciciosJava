import java.util.Scanner;

public class MayorDeDosNumeros {
    //Pedir dos números y decir cual es el mayor.

    public static void main(String[] args) {
        int num1,num2;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();

        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();

        if(num1 > num2)
            System.out.println(num1 + " es mayor que " + num2);
        else if (num1 < num2)
            System.out.println(num2 + " es mayor que " + num1);
        else
            System.out.println(num2 + " es igual que " + num1);
    }
}
