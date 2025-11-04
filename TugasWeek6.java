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
            switch (mataKuliah) {
                case 1:
                    if (nilaiSData >= 75) {
                        System.out.println("Anda eligible untuk menjadi Asisten Dosen pada mata kuliah Struktur Data");
                    } else {
                        System.out.println("Anda tidak memenuhi syarat untuk menjadi asisten mata kuliah");
                    }
                    break;
                case 2:
                    if (nilaiPBObjek >= 75) {
                        System.out.println("Anda eligible untuk menjadi Asisten Dosen pada mata kuliah Pemrograman Berorientasi Objek");
                    } else {
                        System.out.println("Anda tidak memenuhi syarat untuk menjadi asisten mata kuliah");
                    }
                    break;
                case 3:
                    if (nilaiBData >= 75) {
                        System.out.println("Anda eligible untuk menjadi Asisten Dosen pada mata kuliah Basis Data");
                    } else {
                        System.out.println("Anda tidak memenuhi syarat untuk menjadi asisten mata kuliah");
                    }
                    break;
                case 4:
                    if (nilaiAlgoPemrograman >= 75) {
                        System.out.println("Anda eligible untuk menjadi Asisten Dosen pada mata kuliah Algoritma dan Pemrograman");
                    } else {
                        System.out.println("Anda tidak memenuhi syarat untuk menjadi asisten mata kuliah");
                    }
                    break;
                case 5:
                    if (nilaiRPL >= 75) {
                        System.out.println("Anda eligible untuk menjadi Asisten Dosen pada mata kuliah Rekayasa Perangkat Lunak");
                    } else {
                        System.out.println("Anda tidak memenuhi syarat untuk menjadi asisten mata kuliah");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } else {
            System.out.println("Anda belum memenuhi syarat menjadi asisten dosen");
        }

        nscan.close();
    }
}
