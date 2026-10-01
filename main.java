import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    
    public static void main(String[] args) {
        // Считывание двух вещественных чисел a и b из консоли
        double a = in.nextDouble();
        double b = in.nextDouble();
        
        if (a == 0){
            if (b == 0) out.printf("x < 0 or x > 0");  // случай для a = 0, b = 0
            else{
                if (b > 0) out.printf("x < 0 or 0 < x < %s or x > %s", b, b); // случай для a = 0, b > 0
                else out.printf("x < %s or %s < x < 0 or x > 0", b, b); // случай для a = 0, b < 0
            }
        }
        else{
            if (b == 0){
                if (a > 0) out.printf("x < 0 or x > 0"); // случай для a > 0, b = 0
                else out.printf("no such x"); // случай для a < 0, b = 0
            }
            else{
                if (a > 0){
                    if (b > 0) out.printf("x < 0 or x > %s", b); // случай для a > 0, b > 0
                    else out.printf("x < %s or x > 0", b); // случай для a > 0, b < 0
                }
                else{
                    if (b > 0) out.printf("0 < x < %s", b); // случай для a < 0, b > 0
                    else out.printf("%s < x < 0", b); // случай для a < 0, b < 0
                }
            }
        }
    }
}