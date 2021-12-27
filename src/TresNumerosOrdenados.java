import java.util.Scanner;

public class TresNumerosOrdenados {
    //Pedir tres números y mostrarlos ordenados de mayor a menor.
    public static void main(String[] args) {
        int num1,num2,num3;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Introduzca el tercer número: ");
        num3 = sc.nextInt();
        if(num1>num2 && num2>num3)
            System.out.println( num1+", "+num2+", "+num3);
        else{
            if(num1>num3 && num3>num2)
                System.out.println(num1+", "+num3+", "+num2);
            else{
                if(num2>num1 && num1>num3)
                    System.out.println(num2+", "+num1+", "+num3);
                else{
                    if(num2>num3 && num3>num1)
                        System.out.println(num2+", "+num3+", "+num1);
                    else{
                        if(num3>num1 && num1>num2)
                            System.out.println(num3+", "+num1+", "+num2);
                        else{
                            if(num3>num2 && num2>num1)
                                System.out.println(num3+", "+num2+", "+num1);
                        }
                    }
                }
            }
        }
    }
}
