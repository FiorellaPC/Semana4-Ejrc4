import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Indique un número entre 1,2,3,4,6 y 12:");
        int numero = scan.nextInt();

        switch (numero){
            case 1: System.out.println("Período mensual");break;
            case 2: System.out.println("Período bimestral");break;
            case 3: System.out.println("Período trimestral");break;
            case 4: System.out.println("Período cuatrimestral");break;
            case 6: System.out.println("Período semestral");break;
            case 12: System.out.println("Período anual");break;
        }
    }
}