package exc2;

public class Main2 {
    public static void main(String[] args) {
        int num = 1;
        if (num >= 1 && num <= 2) {
            System.out.println("Winter");
        } else if (num >= 3 && num <= 5) {
            System.out.println("Spring");
        } else if (num >= 6 && num <= 8) {
            System.out.println("Summer");
        } else if (num >= 9 && num <= 11) {
            System.out.println("Autumn");
        } else if (num == 12) {
            System.out.println("Winter");
        } else {
            System.out.println("No matches. Please enter the correct number from 1 to 12.");
        }
    }
}


