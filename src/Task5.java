import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("Pozitif sayı");
        } else if(a == 0){
            System.out.println("Sayı sıfır");
        }else{
            System.out.println("Negatif sayı");
        }
    }
}
