import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int input = sc.nextInt();

        if (input > 0) {
            System.out.println("Pozitif bir sayıdır.");
        } else if (input < 0) {
            System.out.println("Negatif bir sayıdır.");
        } else {
            System.out.println("Girilen sayı sıfıra eşittir.");
        }
    }
}
