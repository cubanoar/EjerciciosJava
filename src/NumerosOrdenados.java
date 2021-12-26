import java.util.Scanner;

public class NumerosOrdenados {
    //Pedir dos números y mostrarlos ordenados de mayor a menor.
    public static void main(String[] args) {

        int num1,num2;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();

        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();

        if(num1 > num2)
            System.out.println(num1 + " y " + num2);
        else
            System.out.println(num2 + " y " + num1);

    }
}
