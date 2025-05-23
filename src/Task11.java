import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int num1 = sc.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = sc.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int num3 = sc.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("En büyük sayı: " + max);
    }
}
