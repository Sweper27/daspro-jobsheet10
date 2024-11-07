import java.util.Scanner;

public class SIAKAD26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        
        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalperSiswa = 0;

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalperSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalperSiswa / jumlahMataKuliah);
        }

        
        System.out.println("\n========================================");
        System.out.println("Rata-rata Nilai setiap Mata kuliah:");

        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalperMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalperMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalperMatkul / jumlahSiswa);
        }
        
    }
}
