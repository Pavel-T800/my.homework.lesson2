package exc5;

public class Main5 {
    public static void main(String[] args) {
        int num = 7;
        switch (num) {
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("Blue");
            case 6 -> System.out.println("Indigo");
            case 7 -> System.out.println("Violet");
            default -> System.out.println("No colors. Please enter the correct number for the Rainbow from 1 to 7.");
        }
    }
}