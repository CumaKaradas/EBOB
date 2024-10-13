import java.util.Scanner;

public class EBOB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayıyı alma
        System.out.println("İki sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // En büyük ortak böleni hesaplama
        int ebob = bulEBOB(sayi1, sayi2);

        // Sonucu ekrana yazdırma
        System.out.println("En Büyük Ortak Bölen (EBOB): " + ebob);

        scanner.close();
    }

    // EBOB'u hesaplayan fonksiyon
    public static int bulEBOB(int sayi1, int sayi2) {
        while (sayi1 != sayi2) {
            if (sayi1 > sayi2) {
                sayi1 -= sayi2;
            } else {
                sayi2 -= sayi1;
            }
        }
        return sayi1;
    }
}
