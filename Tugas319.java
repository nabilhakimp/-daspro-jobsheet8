import java.util.Scanner;

public class Tugas319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSeluruh = 0;        // total barang seluruh toko
            int barangTerbanyak = -1;    // -1 agar toko pertama pasti tercatat
            int tokoTerbanyak = 0;

            int nomorToko = 1;
            while (nomorToko <= jumlahToko) {          // outer loop: toko
                System.out.println("Toko " + nomorToko);
                int totalBarangToko = 0;               // reset tiap toko

                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                for (int p = 1; p <= jumlahPelanggan; p++) {   // inner loop: pelanggan
                    int jumlahBarang;
                    do {
                        System.out.print("    Jumlah barang pelanggan " + p + ": ");
                        jumlahBarang = sc.nextInt();
                        if (jumlahBarang < 0) {
                            System.out.println("    Tidak boleh negatif. Ulangi input!");
                        }
                    } while (jumlahBarang < 0);
                    totalBarangToko += jumlahBarang;
                }

                System.out.println("Toko " + nomorToko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);
                totalSeluruh += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = nomorToko;
                }

                nomorToko++;
            }

            System.out.println("==============================");
            System.out.println("Total barang seluruh toko: " + totalSeluruh);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}