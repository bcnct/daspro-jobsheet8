import java.util.Scanner;

public class Triangle07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        // BENTUK SEGITIGA PERTAMA (INKREMENTAL)
        int i = 1; // Menginisiasi variabel berjenis integer bernama i dengan nilai 1 agar Inner
                   // Loop dapat berjalan
        while (i <= n) { // Outer Loop : Hanya bekerja jika nilai variabel i kurang dari sama dengan
                         // nilai variabel n.
            int j = 1;
            while (j <= i) { // Inner Loop : Hanya bekerja jika nilai variabel j kurang dari sama dengan
                             // nilai variabel i.
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        // BENTUK SEGITIGA KEDUA (DEKREMENTAL / PENURUNAN)
        i = n; // Menggunakan ulang variabel berjenis integer bernama i
        while (i >= 1) { // Sebelumnya nilai i ditambah hingga sama dengan nilai n. Berikutnya nilai i
                         // dikurangi hingga lebih dari sama dengan 1 untuk membuat segitiga terbalik.
            int j = 1;
            while (j <= i) { // Perulangan akan mencetak * sebanyak nilai j hinggan nilai j kurang dari sama
                             // dengan nilai i.
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}