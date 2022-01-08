import java.util.Scanner;

public class DiaMesAnio {
    /*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
     Sin años bisiestos.*/
    public static void main(String[] args) {
        int dia,mes,anio;
        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca día: ");
        dia = sc.nextInt();
        System.out.print("Introduzca mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca año: ");
        anio = sc.nextInt();
        // el único año que no existe es el 0
        if(anio==0)
            System.out.println("Fecha incorrecta");
        else{
            if(mes==2 && (dia>=1 && dia<=28))
                System.out.println(dia + "/" + mes + "/" + anio+": Fecha correcta");
            else{
                if((mes==4 || mes==6 || mes==9 || mes==11) &&
                        (dia>=1 && dia<=30))
                    System.out.println(dia + "/" + mes + "/" + anio+": Fecha correcta");
                else{
                    if( (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) &&
                            (dia>=1 && dia<=31))
                        System.out.println(dia + "/" + mes + "/" + anio+": Fecha correcta");
                    else
                        System.out.println("Fecha incorrecta");
                }
            }
        }
    }
}
