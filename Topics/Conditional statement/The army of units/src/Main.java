import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIncl = 1, endExcl = 11;

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum + i;
        }

        System.out.println(sum); // it prints "55"
    }
}