import java.util.Scanner;

public class Tugas307 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Menginisiasi variabel berjenis Scanner dengan nama input
        int jumlahToko;
        // Menginisiasi variabel berjenis integer dengan nama jumlahToko
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = input.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko tidak valid!");
                // Mencetak pesan jika jumlah toko kurang dari 1
            }
        } while (jumlahToko < 1);
        // Perulangan hanya akan berhenti jika jumlah toko tidak kurang dari 1
        int totalBarang = 0;
        // Variabel berjenis integer dengan nama totalBarang untuk menyimpan total dari
        // semua barang yang terjual dari setiap toko (toko 1 + toko 2 + ...)
        int jumlahBarang;
        // Variabel berjenis integer dengan nama jumlahBarang untuk menyimpan jumlah
        // barang yang dibeli oleh setiap pelanggan dari satu toko
        int tokoTerbanyak = 0;
        // Variabel berjenis integer untuk menyimpan nomor toko dengan jumlah barang
        // yang terjual paling banyak dari antara toko lain
        int barangToko = 0;
        // Menampung total akumulasi barang yang dibeli seluruh pelanggan di satu toko
        // (pelanggan 1 + pelanggan 2 + ...)
        String ringkasan = "";
        // Variabel berjenis String untuk menyimpan templat ringkasan sesuai ketentuan.
        // Wajib diinisialisasi dengan String kosong ("") agar operator += dapat
        // digunakan.
        for (int i = 1; i <= jumlahToko; i++) {
            // Perulangan yang akan berjalan hingga nilai dari variabel i kurang dari sama
            // dengan jumlah toko
            System.out.println("Data Toko " + i);
            // Mencetak data toko dengan nomor yang identik seperti nilai dari variabel i
            int jumlahPelanggan;
            // Menginisiasi variabel berjenis integer dengan nama jumlahPelanggan
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = input.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                    // Mencetak pesan jika jumlah pelanggan kurang dari 0
                }
            } while (jumlahPelanggan < 0);
            // Perulangan hanya akan berhenti jika jumlah pelanggan tidak kurang dari 0
            for (int j = 1; j <= jumlahPelanggan; j++) {
                // Perulangan yang akan berjalan hingga nilai dari variabel j kurang dari sama
                // dengan jumlah pelanggan
                do {
                    System.out.print("Masukkan jumlah barang pelanggan ke-" + j + ": ");
                    jumlahBarang = input.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                        // Mencetak pesan jika jumlah barang kurang dari 0
                    }
                } while (jumlahBarang < 0);
                // Perulangan hanya akan berhenti jika jumlah barang tidak kurang dari 0
                barangToko += jumlahBarang;
                // Menginisiasi nilai dari variabel barangToko (akumulasi barang yang dibeli
                // seluruh pelanggan di satu toko)
            }
            totalBarang += barangToko;
            // Menambahkan akumulasi barang yang dibeli di satu toko (barangToko) ke dalam
            // barang yang dibeli dari seluruh toko (totalBarang)
            ringkasan += "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + barangToko + "\n";
            // Menambahkan nilai dari variabel ringkasan dengan pesan yang sesuai ketentuan.
            // Sebagai contoh:
            // Toko 1 - pelanggan: 1, total barang: 1
            if (barangToko > tokoTerbanyak) {
                // Membandingkan jumlah barang terjual dari toko saat ini dengan jumlah barang
                // jual dari toko terbanyak
                // Jika true (barang terjual dari toko saat ini lebih besar daripada barang
                // terjual dari toko terbanyak)
                tokoTerbanyak = barangToko;
                // Maka, menginisiasi (mengganti) jumlah barang terjual dari toko terbanyak
                // dengan jumlah barang terjual dari toko saat ini
                tokoTerbanyak = i;
                // Maka, menginisiasi (mengganti) nomor toko dengan penjualan terbanyak menjadi
                // nomor toko saat ini atau yang identik dengan nilai dari variabel i
            }
        }
        ringkasan += "Total barang seluruh toko: " + totalBarang + "\n";
        ringkasan += "Toko dengan barang terbanyak: Toko " + tokoTerbanyak;
        // Menambahkan nilai dari variabel ringkasan dengan pesan yang sesuai ketentuan
        // setelah perulangan berakhir. Sebagai contoh:
        // Total barang seluruh toko: 1
        // Toko dengan barang terbanyak: Toko 1
        System.out.println(ringkasan);
        // Mencetak nilai terbaru dari variabel ringkasan.
        input.close();
        // Menutup variabel input berjenis Scanner agar mengurangi penggunaan memori
        // saat kondisi diam (idle state) tanpa masukan
    }
}