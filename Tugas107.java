import java.util.Scanner;

public class Tugas107 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Menginisiasi variabel berjenis Scanner bernama input
        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt(); // Menginisiasi variabel berjenis integer bernama n dengan nilai yang diambil
                                 // dari masukan (input)
        int i = 1; // Menginisiasi variabel berjenis integer bernama i dengan nilai 1
        int totalAngka = 0; // Menginisiasi variabel berjenis integer bernama totalAngka dengan nilai 0
        while (i <= n) { // Membuat perulangan yang hanya bekerja jika nilai variabel j kurang dari sama
                         // dengan nilai variabel n.
            int j = 1; // Menginisiasi variabel berjenis integer bernama j dengan nilai 1
            while (j <= i) { // Membuat perulangan yang hanya bekerja jika nilai variabel j kurang dari sama
                             // dengan nilai variabel i.
                System.out.print(j + " "); // Mencetak nilai dari variabel j
                totalAngka++; // Menaikkan jumlah angka setiap kali setelah nilai dari variabel j dicetak
                j++; // Menaikkan (inkremental) nilai dari variabel j hingga kurang dari sama dengan
                     // nilai dari variabel i agar perulangan berhenti karena kondisi menjadi false.
            }
            System.out.println(); // Mencetak baris baru setiap kali perulangan tingkat dua (Inner Loop) yang
                                  // terletak di atas telah berhenti karena kondisinya sudah false.
            i++; // Menaikkan (inkremental) nilai dari variabel i hingga kurang dari sama dengan
                 // nilai dari variabel n agar perulangan berhenti karena kondisi menjadi false.
        }
        System.out.println("Total angka tercetak: " + totalAngka); // Mencetak nilai dari variabel totalAngka
        input.close(); // Variabel berjenis Scanner bernama input ditutup dan tidak menerima masukan
                       // (input) lagi untuk membebaskan dan mengurangi penggunaan RAM yang dikunci
                       // (state) sejak variabel di-inisiasi dan saat menunggu masukan (input)
                       // selanjutnya.
    }
}