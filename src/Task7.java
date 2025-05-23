import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        int grade = sc.nextInt();
        String harfNotu = switch (grade / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };

        System.out.println("Harf notunuz: " + harfNotu);
    }
}
