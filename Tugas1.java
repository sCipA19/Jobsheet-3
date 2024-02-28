import java.util.Scanner;
public class Tugas1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array untuk menyimpan data mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];

        // Input data mahasiswa
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            daftarMahasiswa[i] = new Mahasiswa();

            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            daftarMahasiswa[i].nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            daftarMahasiswa[i].nim = input.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            daftarMahasiswa[i].jenisKelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            daftarMahasiswa[i].ipk = input.nextDouble();
            input.nextLine(); // Membuang sisa inputan newline
        }

        // Hitung total IPK
        double totalIPK = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            totalIPK += mhs.ipk;
        }

        // Hitung rata-rata IPK
        double rataRataIPK = totalIPK / daftarMahasiswa.length;

        // Tampilkan data mahasiswa
        System.out.println("\n========================================");
        System.out.println("           Data Mahasiswa           ");
        System.out.println("========================================");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("Nama: " + mhs.nama);
            System.out.println("NIM: " + mhs.nim);
            System.out.println("Jenis Kelamin: " + mhs.jenisKelamin);
            System.out.println("IPK: " + mhs.ipk);
            System.out.println("----------------------------------------");
        }

        // Tampilkan rata-rata IPK
        System.out.println("Rata-rata IPK: " + rataRataIPK);
    }
}

class Mahasiswa {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;
}

