import java.util.Scanner;

public class SIAKAD26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int [4][3];

        for (int i = 0; i < nilai.length;i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalperSiswa = 0;

            for (int j=0; j < nilai[i].length;j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalperSiswa += nilai [i][j];
            }
            System.out.println("Nilai rata-rata; " + totalperSiswa/3);
        }
        System.out.println("========================================");
        System.out.println("Rata-rata Nilai setiap Mata kuliah:");

        for (int j=0; j <3; j++) {
            double totalperMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalperMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalperMatkul / 4 );
        }
    }
}
