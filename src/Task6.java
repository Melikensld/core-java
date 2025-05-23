import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("Çift sayı");
        }else{
            System.out.println("Tek sayı");
        }
    }
}
