import java.util.Scanner;

public class MultiploDelOtro {
    //Pedir dos números y decir si uno es múltiplo del otro.
    public static void main(String[] args) {
        int num1,num2;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número uno: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el número dos: ");
        num2 = sc.nextInt();

        if(num1%num2 == 0)
            System.out.println("Son múltiplos");
        else
            System.out.println("No son múltiplos");
    }
}
