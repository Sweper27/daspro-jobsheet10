import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int baris,kolom,pilihan;
        String nama,next;

        String [][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                               
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data berhasil dimasukkan.");
                                break;
                            } else {
                                
                                System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Nomor baris atau kolom tidak tersedia! Silakan coba lagi.");
                        }
                        
                    }
                    break;

                case 2:
                    
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.printf("Baris & Kolom: ", i + 1, j + 1, 
                                              penonton[i][j] == null ? "***" : penonton[i][j]);
                        }
                    }
                    break;

                case 3:
                    
                    System.out.println("Program selesai. Terima kasih!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            
                }
            }
        }
    }
