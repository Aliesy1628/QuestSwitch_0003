import java.util.Scanner;

public class TugasWeek6 {
    public static void main(String[] args) {
        Scanner nscan = new Scanner(System.in);
        int nilaiSData, nilaiPBObjek, nilaiBData, nilaiAlgoPemrograman, nilaiRPL;
        double rataRata, ipk;

        System.out.print("- Masukkan nilai Struktur Data: ");
        nilaiSData = nscan.nextInt();
        System.out.print("- Masukkan nilai Pemrograman Berorientasi Objek: ");
        nilaiPBObjek = nscan.nextInt();
        System.out.print("- Masukkan nilai Basis Data: ");
        nilaiBData = nscan.nextInt();
        System.out.print("- Masukkan nilai Algoritma dan Pemrograman: ");
        nilaiAlgoPemrograman = nscan.nextInt();
        System.out.print("- Masukkan nilai Rekayasa Perangkat Lunak: ");
        nilaiRPL = nscan.nextInt();

        rataRata = (nilaiSData + nilaiPBObjek + nilaiBData + nilaiAlgoPemrograman + nilaiRPL) / 5.0;
        System.out.println("Rata-rata nilai adalah: " + rataRata);

        ipk = rataRata / 25.0;
        System.out.println("IPK Anda adalah: " + ipk);
        if (ipk >= 3.75) {
            System.out.println("Mendapat predikat A (Sangat Baik)");
        } else if (ipk <= 3.74 && ipk >= 3.50) {
            System.out.println("Mendapat predikat AB (Baik Sekali)");
        } else if (ipk <= 3.49 && ipk >= 3.00) {
            System.out.println("Mendapat predikat B (Baik)");
        } else if (ipk <= 2.99 && ipk >= 2.50) {
            System.out.println("Mendapat predikat BC (Cukup)");
        } else if (ipk < 2.50) {
            System.out.println("Mendapat predikat C (Kurang)");
        }

        if (ipk >= 3.50) {
            System.out.println("Selamat Anda memenuhi syarat menjadi asisten dosen");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pemrograman Berorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dan Pemrograman");
            System.out.println("5. Rekayasa Perangkat Lunak");
            System.out.print("Silahkan pilih mata kuliah yang dapat diajukan untuk posisi asisten (1/2/3/4/5): ");
            int mataKuliah = nscan.nextInt();
            
        } else {
            System.out.println("Maaf Anda belum memenuhi syarat menjadi asisten dosen");
        }
    }
}
