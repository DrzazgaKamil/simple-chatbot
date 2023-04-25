import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        if(i > 100){
            System.out.println(i - 1);
        }else{
            System.out.println("chuj");
        }
    }
}