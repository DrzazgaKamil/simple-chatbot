import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer number = scanner.nextInt();

        System.out.println(number < 10);
    }
}