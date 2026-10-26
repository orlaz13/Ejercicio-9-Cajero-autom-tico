import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        double retiro;
        while (true) {
            System.out.println("Saldo actual: S/" + saldo);
            System.out.print("Retiro (0 para salir): ");
            retiro = sc.nextDouble();
            if (retiro == 0) {
                System.out.println("Gracias por usar el cajero.");
                break;
            }
            if (retiro < 0) {
                System.out.println("Error: ingrese un monto válido.");
            } else if (retiro > saldo) {
                System.out.println("Error: saldo insuficiente.");
            } else {
                saldo = saldo - retiro;
                System.out.println("Saldo restante: S/" + saldo);
            }
            System.out.println();
        }
        sc.close();
    }
}