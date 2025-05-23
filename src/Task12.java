import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pozitif bir sayı giriniz: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
            return;
        }

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("1'den " + n + "'e kadar olan sayıların toplamı: " + total);
    }
}
