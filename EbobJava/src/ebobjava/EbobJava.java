package ebobjava;
import java.util.Scanner;
public class EbobJava {
    public static int ebobbulma (int a,int b) {
        int ebob = 1;
        for(int i = 1; i <= a && i <= b; i++) {
            if((a % i == 0) && (b % i == 0)) {
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayı: ");
        int birincisayi = scanner.nextInt();
        System.out.println("İkinci Sayı: ");
        int ikincisayi = scanner.nextInt();
        System.out.println("Ebob: " + ebobbulma(birincisayi,ikincisayi));
    }
    
}
