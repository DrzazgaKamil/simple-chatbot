import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int hundred = a / 100;
        int ten = (a / 10) % 10;
        int unit = a % 10;

        int result = hundred + ten + unit;

        System.out.println(result);
    }
}