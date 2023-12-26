package exc8;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();

        int num = Integer.parseInt(number);
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Answer - " + sum);
    }
}




