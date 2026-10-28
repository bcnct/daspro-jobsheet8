import java.util.Scanner;

public class Rectangle07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        for (int i = 1; i <= baris; i++) { // Outer Loop: Baris
            for (int j = 1; j <= kolom; j++) { // Inner Loop: Kolom
                System.out.print("#");
            }
            System.out.println();
            /*
             * Jika nilai dari variabel berjenis integer bernama j bernilai kurang dari sama
             * dengan variabel berjenis integer bernama kolom.
             * Maka, perulangan dihentikan karena kondisi sudah false dan memulai untuk
             * pindah baris
             */
        }
        sc.close(); // Variabel berjenis Scanner dengan nama sc ditutup dan tidak menerima segala
                    // masukkan lagi agar sumber daya memori yang digunakan bisa dibebaskan kembali
    }
}