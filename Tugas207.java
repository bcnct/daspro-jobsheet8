import java.util.Scanner;

public class Tugas207 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();
        if (n < 3) {
            System.out.println("Nilai n minimal 3. Silakan masukkan ulang program");
        } else {
            int totalAngka = 0; // Karena total angka adalah akumulasi dari angka yang dicetak sehingga nilai
                                // awalnya adalah 0
            for (int i = 1; i <= n; i++) { // Outer Loop untuk mengatur nomor baris
                for (int j = 1; j <= n; j++) { // Inner Loop untuk mencetak hasil kali dan kolom
                    int hasilKali = i * j; // Menginisiasi hasil perkalian dari nilai variabel i dengan nilai variabel j
                                           // ke dalam variabel berjenis integer dengan nama hasilKali.
                    System.out.print(hasilKali + "\t"); // Mencetak hasil perkalian disertai tab ("\t") agar kolom sejajar dan
                                                        // rapi
                    totalAngka += hasilKali; // Menginisiasi nilai totalAngka yang berasal dari akumulasi totalAngka +
                                             // hasilKali
                }
                System.out.print("\n"); // Mencetak baris baru ("\n") setelah Inner Loop selesai karena kondisi telah false
            }
            System.out.println("Jumlah seluruh angka: " + totalAngka);
        }
        input.close();
    }
}