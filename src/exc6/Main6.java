package exc6;

public class Main6 {
    public static void main(String[] args) {
        int start = 1;
        int finish = 99;
        for (int i = start; i <= finish; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}