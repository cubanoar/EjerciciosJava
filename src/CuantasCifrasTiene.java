import java.util.Scanner;

public class CuantasCifrasTiene {
    //Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
    public static void main(String[] args) {
        int num;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = sc.nextInt();

        if(num<10)
            System.out.println("tiene 1 cifra");
        else{
            if(num<100)
                System.out.println("tiene 2 cifras");
            else{
                if(num<1000)
                    System.out.println("tiene 3 cifras");
                else{
                    if(num<10000)
                        System.out.println("tiene 4 cifras");
                    else{
                        if(num<100000)
                            System.out.println("tiene 5 cifras");
                    }
                }
            }
        }
    }
}
