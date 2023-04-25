import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer h1 = scanner.nextInt();
        Integer h2 = scanner.nextInt();
        Integer h3 = scanner.nextInt();

        Boolean checkOrder = (h1 >= h2) && (h2 >= h3) || (h1 <= h2) && (h2 <= h3);

        System.out.println(checkOrder);
    }
}