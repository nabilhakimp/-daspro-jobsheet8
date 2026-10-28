import java.util.Scanner;

public class Tugas119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Nilai n minimal 1.");
        } else {
            int total = 0;                       // penghitung banyak angka

            for (int i = 1; i <= n; i++) {       // outer loop: baris
                for (int j = 1; j <= i; j++) {   // inner loop: angka 1 sampai i
                    System.out.print(j + " ");
                    total++;
                }
                System.out.println();            // pindah baris
            }
            System.out.println("Total angka tercetak: " + total);
        }
        sc.close();
    }
}