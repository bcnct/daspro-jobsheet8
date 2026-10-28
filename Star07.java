import java.util.Scanner;

public class Star07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i+= 2) { // Untuk variabel berjenis integer bernama "i" bernilai 1 dan hanya akan
                                       // berhenti jika i kurang dari sama dengan variabel berjenis integer bernama "n"
                                       // jika belum berhenti, nilai i inkremental
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}