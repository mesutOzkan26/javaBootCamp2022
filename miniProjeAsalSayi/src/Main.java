import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int number = 23;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("Asal Sayı değildir..");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz Sayı...");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayı Asaldir...");
        } else {
            System.out.println("Sayi Asal Değildir..");
        }
    }
}
